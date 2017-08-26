package com.nocol.download;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

@WebServlet("/download")
public class DownLoad extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 1 获得参数,拿到用户需要下载的文件名称
		String fileName = req.getParameter("name");
		fileName = new String(fileName.getBytes("ISO-8859-1"), "UTF-8");//将前者编码转换为后者编码方式
		
		// 2 准备工作
		// 设置content-type
		resp.setContentType(getServletContext().getMimeType(fileName));
		// 添加响应头 content-disposition
		resp.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
		
		// 2 获得输入流
		InputStream is = getServletContext().getResourceAsStream("/WEB-INF/" + fileName);
		// 3 获得输出流
		OutputStream os = resp.getOutputStream();
		// 4 两个流对接
		IOUtils.copy(is, os);
		// 关闭输出流
		is.close();
		os.close();
	}
}
