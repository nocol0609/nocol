package com.upload.more;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/more")
public class MoreServlet extends HttpServlet {
	//fileupload ������ʹ�����
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 1 �������ù���=> �вεĹ������ ֱ������������������
		DiskFileItemFactory factory = new DiskFileItemFactory();
		// 1.1 �����ļ��ϴ���ʱĿ¼ => Ĭ��λ�� => tomcat/temp
		factory.setRepository(new File("i://upload"));
		// 1.2 �����ļ�д��Ӳ�̵Ļ�������С=>Ĭ��ֵ=>10k
		factory.setSizeThreshold(10240);
		// 2 �������ù�������������(����request����)
		ServletFileUpload upload = new ServletFileUpload(factory);
		// 2.1 �жϵ�ǰ�����Ƿ��Ƕ��ʽ�ύ
		upload.isMultipartContent(req);
		// 2.2 ���ö����ÿ�� ��ͷ �ڽ���ʱ,ʹ��ʲô������ => ����ͷ�г�������ʱ,һ��Ҫ���ø÷�ʽָ����ͷ���
		upload.setHeaderEncoding("UTF-8");//����ļ���������
		// 2.3 �����ļ�����ϴ���С (��λ:�ֽ�)
		upload.setSizeMax(1024 * 1024 * 10); // ��������,���ϴ���С���� 10��
		upload.setFileSizeMax(1024 * 1024);// ÿ���ļ��ϴ���,��С���� 1��
		List<FileItem> list = null;
		try {
			// 2.4 ����request,��ÿ���ֶ��е����ݷ�װ��FileItem��
			list = upload.parseRequest(req);
		} catch (FileUploadException e) {
			e.printStackTrace();
		}
		if (list != null) {
			for (FileItem item : list) {
				// 3.1 item �жϵ�ǰ�ֶ��Ƿ�����ͨ����
				boolean flag = item.isFormField();
				// ��ͨ��
				// 3.2��� ���ύ�ļ�.(inputԪ��,name���Ե�ֵ)
				String fname = item.getFieldName();
				// 3.3 �����ļ�����
				String name = item.getName();
				// 3.4 ����ļ��ϴ��е�����
				// item.getInputStream();
				// 3.5 ���ַ�����ʽ���ض����е����� ע��:�ļ��ϴ��β�����ʹ�ø÷���.
				String content = item.getString("utf-8");//����ļ�������������
				// 3.6 ɾ���ϴ�����ʱ�ļ�
				item.delete();
				System.out.println("�Ƿ�����ͨ���ύ:" + flag + ",���ύ�ļ�:" + fname + ",�ļ�����:" + name + ",�ļ�����:" + content);
			}
		}

	}
}
