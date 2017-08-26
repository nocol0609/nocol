package com.ssm.service.Impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssm.bean.Order;
import com.ssm.bean.OrderLine;
import com.ssm.bean.OrderListForm;
import com.ssm.bean.Product;
import com.ssm.bean.User;
import com.ssm.dao.OrderDao;
import com.ssm.dao.OrderLineDao;
import com.ssm.dao.ProductDao;
import com.ssm.dao.ReceiverDao;
import com.ssm.dao.UserDao;
import com.ssm.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderDao orderDao;
	@Autowired
	private OrderLineDao oderLineDao;
	@Autowired
	private ProductDao productDao;
	@Autowired
	private ReceiverDao receiverDao;
	@Autowired
	private UserDao userDao;

	@Override
	//开启事务
	@Transactional
	public void addOrder(Order order) {
		// TODO Auto-generated method stub
		try {
	
			// 生成收件人数据
			receiverDao.addReceiver(order.getReceiver());

			// 生成订单
			orderDao.addOrder(order);
			for (OrderLine item : order.getOrderlines()) {
				// 生成订单项
				oderLineDao.addOrderLine(item);
				// 减掉库存
				productDao.delProdNum(item.getProduct().getId(), item.getAmount());
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<OrderListForm> findOrderByUserId(int id) {
		// TODO Auto-generated method stub
		// 创建存储所有订单结果信息集合
		List<OrderListForm> olfList = new ArrayList<OrderListForm>();

		// 1、根据用户id查询该用户所有订单
		List<Order> list = orderDao.findOrderByUserId(id);
		// 2、遍历订单生成orderListForm对象存入list
		for (Order order : list) {
			OrderListForm olf = new OrderListForm();
			olf.setId(order.getId());
			olf.setMoney(order.getSum_price());
			olf.setOrdertime(order.getStart_date());
			olf.setPaystate(order.getStatus());
			olf.setReceiverinfo(order.getReceiver().getAddress());
			// 设置用户名
			User user = userDao.findUserByUserId(id);
			olf.setUsername(user.getName());
			// 3、设置商品信息
			// 查询当前订单的所有订单项
			List<OrderLine> itemsList = oderLineDao.findOrderLineByOrderId(order.getId());
			// 遍历所有订单项存入map集合
			Map<Product, Integer> map = new HashMap<Product, Integer>();
			for (OrderLine orderLine : itemsList) {
				long prod_id = orderLine.getProduct().getId();
				// 根据商品id查询该商品
				Product product = productDao.findProdById(String.valueOf(prod_id));
				map.put(product, Integer.valueOf((int) orderLine.getAmount()));
			}
			olf.setProdMap(map);
			olfList.add(olf);
		}
		return olfList;
	}

	@Override
	@Transactional
	public void delOrderByOrderId(String order_id) {
		// TODO Auto-generated method stub
		try {

			// 根据订单id找到所有订单项
			List<OrderLine> itemList = oderLineDao.findOrderLineByOrderId(order_id);
			// 遍历订单项将对应prod_id的商品的数量加会库存
			for (OrderLine orderLine : itemList) {
				productDao.addProdNumByProdId(orderLine.getProduct().getId(),orderLine.getAmount());
			}
			// 删除订单项
			oderLineDao.delOrderLineByOrderId(order_id);
			// 删除订单
			orderDao.delOrderByOrderId(order_id);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
