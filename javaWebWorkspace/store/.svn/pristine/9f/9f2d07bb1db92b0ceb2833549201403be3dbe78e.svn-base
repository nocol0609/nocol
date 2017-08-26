package com.ssm.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.bean.Order;
import com.ssm.bean.OrderLine;
import com.ssm.bean.Payway;
import com.ssm.bean.Product;
import com.ssm.bean.Receiver;
import com.ssm.bean.User;
import com.ssm.service.OrderService;
import com.ssm.service.PaywayService;

/**
 * 订单控制器
 * @author Nocol
 *
 */
@Controller
@RequestMapping("/order")
public class OrderAction {
	
	
	private OrderService orderService;
	@Autowired
    private PaywayService paywayService; 

	/**
	 * 添加订单
	 */
	@RequestMapping("addOrder")
	public void addOrder(Receiver receiver,HttpServletRequest request,HttpServletResponse response){
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
			receiver.setId(UUID.randomUUID().toString());
			receiver.setUser(user);
			System.out.println("收件人信息："+receiver);
			
			//订单收件人
			order.setReceiver(receiver);
			
			//添加订单
			orderService.addOrder(order);
			
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
	
	/**
	 * 删除订单
	 */
	@RequestMapping("/delOrder")
	public void DelOrder(String order_id,HttpServletResponse resp) throws Exception{
		
		System.out.println("要删除的订单号："+order_id);
		
		orderService.delOrderByOrderId(order_id);
		// 返货订单查询页面
		resp.setCharacterEncoding("GBK");
		resp.getWriter().write("订单删除成功！3秒回到订单列表...");
		resp.setHeader("refresh", "3;url=orderList");
	}
}
