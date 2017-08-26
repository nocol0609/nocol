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
		// * ԭʼ�ϴ�����
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
		 * ʹ�õ������ϴ�������
		 */
		// �������ù���
		DiskFileItemFactory factory = new DiskFileItemFactory();
		// ͨ���������������ϴ����ݵĽ�����
		ServletFileUpload upload = new ServletFileUpload(factory);
		
		upload.setHeaderEncoding("utf-8");
		
		// �жϵ���ǰ�Ƿ��Ƕ��ʽ�ύ
		if (!upload.isMultipartContent(req)) {
			// ��ͨ�����ύ
			throw new RuntimeException("��ǰΪ�Ƕ��ʽ�ύ");
		}

		// ��Ϊ���ʽ�ύ�����request����
		try {
			List<FileItem> list = upload.parseRequest(req);
			// ��������
			if (list != null) {
				for (FileItem fileItem : list) {
					// �жϵ�ǰ�ϴ������ļ��ϴ�������ͨ�ֶ�
					if (!fileItem.isFormField()) {// �ļ��ϴ�
						String fname = fileItem.getName();
						// ��ȡ�ϴ��ļ���������
						InputStream is = fileItem.getInputStream();
						
						//��ȡ�����ļ������ƣ���֤���ظ���
						 String fname1 = UUID.randomUUID().toString();
						
						// ��ȡ�ļ������
						FileOutputStream fos = new FileOutputStream("i://upload/"+fname1);

						IOUtils.copy(is, fos);
						fos.close();

					} else {// ��ͨ�ֶζ�
						String name = fileItem.getFieldName();//�����ύ�ļ�
						String value = fileItem.getString("utf-8");//���ض����ڵ�����
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
