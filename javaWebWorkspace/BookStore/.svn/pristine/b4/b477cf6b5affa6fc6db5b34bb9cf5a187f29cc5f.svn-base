package com.nocol.Web.Servlet;

import java.io.IOException;
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

import com.nocol.Bean.Order;
import com.nocol.Bean.OrderLine;
import com.nocol.Bean.Payway;
import com.nocol.Bean.Product;
import com.nocol.Bean.Receiver;
import com.nocol.Bean.User;
import com.nocol.Service.OrderService;
import com.nocol.Service.PaywayService;
import com.nocol.Service.Impl.OrderServiceImpl;
import com.nocol.Service.Impl.PaywayServiceImpl;

@WebServlet("/addOrder")
public class AddOrderServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
	
			//存储订单项
			Set<OrderLine> orderlines=new HashSet<OrderLine>();
			
			// 封装订单
			Order order = new Order();
			// 订单编号
			order.setId(UUID.randomUUID().toString());
			
			// 订单支付状态
			order.setStatus(String.valueOf(1));
			
			//查询支付方式
			PaywayService paywayService=new PaywayServiceImpl();
			List<Payway> paywayList=paywayService.findPayWay();
			for (Payway payway : paywayList) {
				order.setPayway_id(payway.getId());
			}	
			
			User user = (User) request.getSession().getAttribute("user");
			order.setUser(user);

			Map<Product, Integer> cartmap = (Map<Product, Integer>) request.getSession().getAttribute("cartmap");
			// 遍历购物车
			Set<Product> set = cartmap.keySet();
			double money=0;
			// 支付的钱----订单里的每一个订单项
			for (Product product : set) {
				int buyNum=cartmap.get(product);
				money=buyNum * product.getPrice();
				//封装订单项
				OrderLine orderLine=new OrderLine();
				orderLine.setAmount(buyNum);
				orderLine.setSingle_price(product.getPrice());
				orderLine.setProduct(product);
				orderLine.setOrder(order);
				orderLine.setProduct_version(product.getVersion());
				//将订单项存储在订单内
				orderlines.add(orderLine);
			}
			//订单总价
			order.setSum_price(money);
			order.setOrderlines(orderlines);
			
			// 封装收件人信息
			Receiver receiver = new Receiver();
			BeanUtils.populate(receiver, request.getParameterMap());
			receiver.setId(UUID.randomUUID().toString());
			receiver.setUser(user);
			System.out.println("收件人信息："+receiver);
			
			//订单收件人
			order.setReceiver(receiver);
			
			//添加订单
			OrderService service=new OrderServiceImpl();
			service.addOrder(order);
			
			// 清空购物车
			cartmap.clear();

			// 生成订单成功3秒回到主页
			response.setCharacterEncoding("GBK");
			response.getWriter().write("订单生成成功,请前往支付...");
			response.setHeader("refresh", "3;url=index.jsp");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
