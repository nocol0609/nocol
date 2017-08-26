package com.cookie.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookie.bean.Product;
import com.cookie.dao.ProductDao;

public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListServlet() {
		super();
		// TODO Auto-geerated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");

		// ��ȡ���ݿ��ѯ������Ʒ
		ProductDao dao = new ProductDao();
		List<Product> list = dao.findAll();
		// ��ʾ����
		String html = "";
		html += "<html>";
		html += "<head>";
		html += "<title>��ʾ��Ʒ�б�</title>";
		html += "</head>";
		html += "<body>";
		html+="<table border='1' align='center' width='600px'>";
		html += "<tr>";
		html += "<th>���</th><th>��Ʒ����</th><th>��Ʒ�ͺ�</th><th>��Ʒ�۸�</th>";
		html += "</tr>";
		//������Ʒ
		if(list!=null){
			for (Product product : list) {
				html += "<tr>";
				// /Cookie_Session/DetailServlet?id=1 ����DetailSErvlet��servlet����ͬʱ���� ��Ϊid��ֵΪ1 �Ĳ���
				html += "<td>"+product.getId()+"</td><td><a href='"+request.getContextPath()+"/DetailServlet?id="+product.getId()+"'>"+product.getName()+"</a></td><td>"+product.getType()+"</td><td>"+product.getPrice()+"</td>";
				html += "<tr>";
			}
		}
		
		html+="</table>";
		
		/**
		 * ��ʾ���������Ʒ
		 */
		html += "������������Ʒ��<br/>";
		//ȡ��prodHist��cookie
		Cookie[] cookies = request.getCookies();
		if(cookies!=null){
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("proHist")){
					String prodHist = cookie.getValue(); // 3,2,1
					String[] ids = prodHist.split(",");
					//�������������Ʒid
					for (String id : ids) {
						//��ѯ���ݿ⣬��ѯ��Ӧ����Ʒ
						Product p = dao.findById(id);
						//��ʾ�������
						html += p.getId()+"&nbsp;&nbsp;"+p.getName()+"&nbsp;&nbsp;"+p.getPrice()+"<br/>";
					}
				}
			}
		}
		html += "</body>";
		html += "</html>";
		response.getWriter().write(html);
	}

}
