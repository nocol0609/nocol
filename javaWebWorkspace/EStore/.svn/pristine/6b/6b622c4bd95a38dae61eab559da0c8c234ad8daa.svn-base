package com.nocol.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.nocol.bean.Order;
import com.nocol.bean.OrderItem;
import com.nocol.bean.Product;
import com.nocol.bean.User;
import com.nocol.service.OrderService;
import com.nocol.service.impl.OrderServiceImpl;

@WebServlet("/addOrder")
public class AddOrderServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			// 将订单信息封装
			Order order = new Order();
			// 订单编号
			order.setId(UUID.randomUUID().toString());
			// 支付状态
			order.setPaystate(0);
			// 支付地址
			String receiverinfo = req.getParameter("receiverinfo");
			System.out.println("收货地址：" + receiverinfo);
			order.setReceiverinfo(receiverinfo);
			// 用户id
			User user = (User) req.getSession().getAttribute("user");
			order.setUser_id(user.getId());

			// 支付的钱----订单里的每一个订单项
			double money = 0;
			List<OrderItem> list = new ArrayList<OrderItem>();
			Map<Product, Integer> cartmap = (Map<Product, Integer>) req.getSession().getAttribute("cartmap");
			// 遍历购物车
			Set<Product> set = cartmap.keySet();
			
			for (Product product : set) {
				int buyNum = cartmap.get(product);
				money = buyNum * product.getPrice();
				// 封装订单项
				OrderItem item = new OrderItem();
				item.setOrder_id(order.getId());
				item.setProduct_id(product.getId());
				item.setBuynum(buyNum);
				list.add(item);
			}
			order.setMoney(money);
			order.setList(list);

			// 调用Service中添加订单的方法
			OrderService service = new OrderServiceImpl();
			service.addOrder(order);

			// 清空购物车
			cartmap.clear();

			// 生成订单成功3秒回到主页
			resp.getWriter().write("订单生成成功,请前往支付...");
			resp.setHeader("refresh", "3;url=index.jsp");

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
