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
		// �ϴ�ͼƬ
		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setSizeThreshold(1024 * 1024 * 1);
		// ������ʱ�ļ�λ��
		// factory.setRepository(new
		// File(this.getServletContext().getRealPath("WEB-INF/temp")));
		ServletFileUpload upload = new ServletFileUpload(factory);
		upload.setHeaderEncoding("UTF-8");
		upload.setFileSizeMax(1024 * 1024);
		upload.setSizeMax(1024 * 1024 * 10);

		// �������map���ڴ洢������imgUrl
		Map<String, String> paramMap = new HashMap<String, String>();

		// �ж��Ƿ�Ϊ���ʽ�ύ
		if (!upload.isMultipartContent(req)) {
			throw new RuntimeException("���ϴ�Ϊ�Ƕ��ʽ�ϴ�");
		}
		try {
			List<FileItem> list = upload.parseRequest(req);
			if (list != null) {
				for (FileItem fileItem : list) {
					if (!fileItem.isFormField()) {// �ļ��ϴ���

						String filename = fileItem.getName();
						System.out.println("�ļ�����" + filename);
						// ��ȡ�ļ�������
						InputStream is = fileItem.getInputStream();
						// ��֤�ϴ��ļ�����һ��
						String uuidName = UUID.randomUUID().toString() + "_" + filename;
						String uploadLocation = this.getServletContext().getRealPath("/upload");
						
						System.out.println("uploadLocation :"+uploadLocation);

						// ͼƬ·��
						//String imgUrl = "http://127.0.0.1:8088/EStore/upload" + "/" + uuidName;
						String imgUrl = "/upload" + "/" + uuidName;
						paramMap.put("imgurl", imgUrl);

						// ȷ���ļ��д���
						File dFile = new File(uploadLocation);
						if (!dFile.exists()) {
							dFile.mkdirs();
						}
						// ��ȡ�ļ������
						FileOutputStream fos = new FileOutputStream(uploadLocation + "/" + uuidName);// ��Ŀ¼
						System.out.println("�ļ�ȫ·����" + uploadLocation +"/"+ uuidName);
						IOUtils.copy(is, fos);

						// ����ͼƬ����ͼ
						PicUtils picUtils = new PicUtils(this.getServletContext().getRealPath(imgUrl));
						picUtils.resizeByHeight(140);

						System.out.println("�ļ��ϴ����");
						fos.close();
					} else {// ��ͨ�ֶ�
						String name = fileItem.getFieldName();// �����ύ�ļ�
						String value = fileItem.getString("utf-8");// ���ض����ڵ�����
						System.out.println("name----value:" + name + "----" + value);

						paramMap.put(name, value);
					}
				}
			}
			// ����service����Ʒ��ӵ����ݿ�
			Product product = new Product();
			BeanUtils.populate(product, paramMap);

			ProdService service = new ProdServiceImpl();
			service.addProduct(product);

			// ��ʾ��ӳɹ�
			PrintWriter pw = resp.getWriter();
			pw.write("�����Ʒ�ɹ���3��ص���ҳ...");
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
