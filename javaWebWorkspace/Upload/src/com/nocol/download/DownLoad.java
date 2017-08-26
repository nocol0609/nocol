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
		// 1 ��ò���,�õ��û���Ҫ���ص��ļ�����
		String fileName = req.getParameter("name");
		fileName = new String(fileName.getBytes("ISO-8859-1"), "UTF-8");//��ǰ�߱���ת��Ϊ���߱��뷽ʽ
		
		// 2 ׼������
		// ����content-type
		resp.setContentType(getServletContext().getMimeType(fileName));
		// �����Ӧͷ content-disposition
		resp.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
		
		// 2 ���������
		InputStream is = getServletContext().getResourceAsStream("/WEB-INF/" + fileName);
		// 3 ��������
		OutputStream os = resp.getOutputStream();
		// 4 �������Խ�
		IOUtils.copy(is, os);
		// �ر������
		is.close();
		os.close();
	}
}
