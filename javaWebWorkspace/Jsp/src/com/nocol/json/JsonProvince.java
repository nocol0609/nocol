package com.nocol.json;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

@WebServlet("/json")
public class JsonProvince extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String province = req.getParameter("province");
		List<City2> list = new LinkedList<City2>();
		PrintWriter pw = resp.getWriter();
		if ("����".equals(province)) {
			Province2 pro = new Province2(province, list);
			list.add(new City2("�ϲ�"));
			list.add(new City2("�Ž�"));
			JSONArray array = JSONArray.fromObject(pro);
		
			
			String msg = array.toString();
			System.out.println(msg);
			pw.write(msg);
			pw.flush();
			pw.close();
		} else if ("����".equals(province)) {
			Province2 pro = new Province2(province, list);
			list.add(new City2("�Ͼ�"));
			list.add(new City2("����"));
			list.add(new City2("��ɽ"));
			JSONArray array = JSONArray.fromObject(pro);
			String msg = array.toString();
			System.out.println(msg);
			pw.write(msg);
			pw.flush();
			pw.close();
		}

	}
}
