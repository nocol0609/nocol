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
		// ����
		DiskFileItemFactory factory = new DiskFileItemFactory();
		// ������
		ServletFileUpload upload = new ServletFileUpload(factory);

		// �ж��Ƿ�Ϊ���ʽ�ύ
		if (!upload.isMultipartContent(req)) {
			throw new RuntimeException("���ϴ�Ϊ�Ƕ��ʽ�ϴ�");
		}

		try {
			List<FileItem> list = upload.parseRequest(req);
			if (list != null) {
				// �ж��Ƿ�Ϊ�ļ��ϴ�
				for (FileItem fileItem : list) {
					if (!fileItem.isFormField()) {

						String name = fileItem.getName();
						// ��ȡ�ļ�������
						InputStream is = fileItem.getInputStream();
						// ��֤�ϴ��ļ�����һ��
						SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd");
						String date = sdf.format(new Date());

						String fname = UUID.randomUUID().toString();
						// ��ȡ�ļ������

						String wholeName = "i://Upload" + date;

						// ȷ���ļ��д���
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
