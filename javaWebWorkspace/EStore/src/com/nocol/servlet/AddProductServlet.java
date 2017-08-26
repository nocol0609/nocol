package com.nocol.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;

import com.nocol.bean.Product;
import com.nocol.service.ProdService;
import com.nocol.service.impl.ProdServiceImpl;
import com.nocol.utils.PicUtils;

@WebServlet("/addProduct")
public class AddProductServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 上传图片
		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setSizeThreshold(1024 * 1024 * 1);
		// 设置临时文件位置
		// factory.setRepository(new
		// File(this.getServletContext().getRealPath("WEB-INF/temp")));
		ServletFileUpload upload = new ServletFileUpload(factory);
		upload.setHeaderEncoding("UTF-8");
		upload.setFileSizeMax(1024 * 1024);
		upload.setSizeMax(1024 * 1024 * 10);

		// 定义参数map用于存储姓名和imgUrl
		Map<String, String> paramMap = new HashMap<String, String>();

		// 判断是否为多段式提交
		if (!upload.isMultipartContent(req)) {
			throw new RuntimeException("该上传为非多段式上传");
		}
		try {
			List<FileItem> list = upload.parseRequest(req);
			if (list != null) {
				for (FileItem fileItem : list) {
					if (!fileItem.isFormField()) {// 文件上传项

						String filename = fileItem.getName();
						System.out.println("文件名：" + filename);
						// 获取文件输入流
						InputStream is = fileItem.getInputStream();
						// 保证上传文件名不一样
						String uuidName = UUID.randomUUID().toString() + "_" + filename;
						String uploadLocation = this.getServletContext().getRealPath("/upload");
						
						System.out.println("uploadLocation :"+uploadLocation);

						// 图片路径
						//String imgUrl = "http://127.0.0.1:8088/EStore/upload" + "/" + uuidName;
						String imgUrl = "/upload" + "/" + uuidName;
						paramMap.put("imgurl", imgUrl);

						// 确保文件夹存在
						File dFile = new File(uploadLocation);
						if (!dFile.exists()) {
							dFile.mkdirs();
						}
						// 获取文件输出流
						FileOutputStream fos = new FileOutputStream(uploadLocation + "/" + uuidName);// 分目录
						System.out.println("文件全路径：" + uploadLocation +"/"+ uuidName);
						IOUtils.copy(is, fos);

						// 生成图片缩略图
						PicUtils picUtils = new PicUtils(this.getServletContext().getRealPath(imgUrl));
						picUtils.resizeByHeight(140);

						System.out.println("文件上传完成");
						fos.close();
					} else {// 普通字段
						String name = fileItem.getFieldName();// 表单中提交的键
						String value = fileItem.getString("utf-8");// 返回段体内的内容
						System.out.println("name----value:" + name + "----" + value);

						paramMap.put(name, value);
					}
				}
			}
			// 调用service将商品添加到数据库
			Product product = new Product();
			BeanUtils.populate(product, paramMap);

			ProdService service = new ProdServiceImpl();
			service.addProduct(product);

			// 提示添加成功
			PrintWriter pw = resp.getWriter();
			pw.write("添加商品成功！3秒回到主页...");
			resp.setHeader("Refresh", "3;url=index.jsp");
			pw.flush();
			pw.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setCharacterEncoding("GBK");
		this.doGet(req, resp);
	}
	
}
