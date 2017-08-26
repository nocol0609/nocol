package com.nocol.upload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
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

@WebServlet("/mfile")
public class ManyUpload extends HttpServlet {
	@SuppressWarnings("resource")
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 工厂
		DiskFileItemFactory factory = new DiskFileItemFactory();
		// 解析器
		ServletFileUpload upload = new ServletFileUpload(factory);

		// 判断是否为多段式提交
		if (!upload.isMultipartContent(req)) {
			throw new RuntimeException("该上传为非多段式上传");
		}

		try {
			List<FileItem> list = upload.parseRequest(req);
			if (list != null) {
				// 判断是否为文件上传
				for (FileItem fileItem : list) {
					if (!fileItem.isFormField()) {

						String name = fileItem.getName();
						// 获取文件输入流
						InputStream is = fileItem.getInputStream();
						// 保证上传文件名不一样
						SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd");
						String date = sdf.format(new Date());

						String fname = UUID.randomUUID().toString();
						// 获取文件输出流

						String wholeName = "i://Upload" + date;

						// 确保文件夹存在
						File dFile = new File(wholeName);
						if (!dFile.exists()) {
							dFile.mkdirs();
						}

						FileOutputStream fos = new FileOutputStream(wholeName + fname);

						IOUtils.copy(is, fos);

						fos.close();

					}
				}
			}
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
