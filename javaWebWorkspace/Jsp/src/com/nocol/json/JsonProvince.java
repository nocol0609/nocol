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
		if ("江西".equals(province)) {
			Province2 pro = new Province2(province, list);
			list.add(new City2("南昌"));
			list.add(new City2("九江"));
			JSONArray array = JSONArray.fromObject(pro);
		
			
			String msg = array.toString();
			System.out.println(msg);
			pw.write(msg);
			pw.flush();
			pw.close();
		} else if ("江苏".equals(province)) {
			Province2 pro = new Province2(province, list);
			list.add(new City2("南京"));
			list.add(new City2("苏州"));
			list.add(new City2("昆山"));
			JSONArray array = JSONArray.fromObject(pro);
			String msg = array.toString();
			System.out.println(msg);
			pw.write(msg);
			pw.flush();
			pw.close();
		}

	}
}
