package com.nocol.upload;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;

@WebServlet("/upload")
public class UploadServlet extends HttpServlet {
	@SuppressWarnings("resource")
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		// /**
		// * 原始上传方法
		// */
		// InputStream is = req.getInputStream();
		// OutputStream os = System.out;
		//
		// byte[] bys = new byte[1024];
		// int len = 0;
		// while ((len = is.read(bys)) != -1) {
		// os.write(bys, 0, len);
		// os.flush();
		// }
		/**
		 * 使用第三方上传工具类
		 */
		// 创建配置工厂
		DiskFileItemFactory factory = new DiskFileItemFactory();
		// 通过工厂创建解析上传内容的解析器
		ServletFileUpload upload = new ServletFileUpload(factory);
		
		upload.setHeaderEncoding("utf-8");
		
		// 判断当当前是否是多段式提交
		if (!upload.isMultipartContent(req)) {
			// 普通表单项提交
			throw new RuntimeException("当前为非多段式提交");
		}

		// 若为多段式提交则解析request对象
		try {
			List<FileItem> list = upload.parseRequest(req);
			// 遍历集合
			if (list != null) {
				for (FileItem fileItem : list) {
					// 判断当前上传段是文件上传还是普通字段
					if (!fileItem.isFormField()) {// 文件上传
						String fname = fileItem.getName();
						// 获取上传文件的输入流
						InputStream is = fileItem.getInputStream();
						
						//获取保存文件的名称（保证不重复）
						 String fname1 = UUID.randomUUID().toString();
						
						// 获取文件输出流
						FileOutputStream fos = new FileOutputStream("i://upload/"+fname1);

						IOUtils.copy(is, fos);
						fos.close();

					} else {// 普通字段段
						String name = fileItem.getFieldName();//表单中提交的键
						String value = fileItem.getString("utf-8");//返回段体内的内容
						System.out.println(name + "---" + value);
					}
				}
			}

		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
