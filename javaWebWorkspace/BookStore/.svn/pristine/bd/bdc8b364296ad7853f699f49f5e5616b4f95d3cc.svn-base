package com.nocol.Web.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nocol.Bean.OrderListForm;
import com.nocol.Bean.User;
import com.nocol.Service.OrderService;
import com.nocol.Service.Impl.OrderServiceImpl;


@WebServlet("/orderList")
public class OrderListServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//获取用户id
		User user = (User) req.getSession().getAttribute("user");
		int id=(int) user.getId();
		
		System.out.println("当前用户id:"+id);
		
		//根据用户id查询用户所有订单
		OrderService service=new OrderServiceImpl();
		
		List<OrderListForm> olflist=service.findOrderByUserId(id);
		
		for (OrderListForm orderListForm : olflist) {
			System.out.println("当前用户订单:"+orderListForm);
		}
		
		//存入request域中带到页面显示
		req.setAttribute("olflist", olflist);
		//返回订单查询页面
		req.getRequestDispatcher("/orderList.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}
