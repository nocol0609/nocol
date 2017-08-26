package com.nocol.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nocol.bean.Order;
import com.nocol.bean.OrderItem;
import com.nocol.bean.OrderListForm;
import com.nocol.bean.Product;
import com.nocol.bean.User;
import com.nocol.dao.OrderDao;
import com.nocol.dao.ProdDao;
import com.nocol.dao.UserDao;
import com.nocol.dao.impl.OrderDaoImpl;
import com.nocol.dao.impl.ProdDaoImpl;
import com.nocol.dao.impl.UserDaoImpl;
import com.nocol.service.OrderService;
import com.nocol.utils.DataSourceUtils;

public class OrderServiceImpl implements OrderService {

	OrderDao orderdao = new OrderDaoImpl();
	ProdDao proddao = new ProdDaoImpl();
	UserDao userdao = new UserDaoImpl();

	/**
	 * 添加订单
	 */
	@Override
	public void addOrder(Order order) {
		// TODO Auto-generated method stub

		try {
			// 开启事务
			DataSourceUtils.startTransaction();

			// 生成订单
			orderdao.addOder(order);
			for (OrderItem item : order.getList()) {
				// 生成订单项
				orderdao.addOrderItem(item);
				// 扣除库存数量
				proddao.delProdNum(item.getProduct_id(), item.getBuynum());
			}
			// 提交事务
			DataSourceUtils.commitAndClose();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			// 回滚事务
			DataSourceUtils.rollbackAndClose();

			e.printStackTrace();
		}

	}

	/**
	 * 根据用户id查询该用户所有订单
	 */
	@Override
	public List<OrderListForm> findOrderByUserId(int user_id) {
		// TODO Auto-generated method stub

		// 创建存储所有订单结果信息集合
		List<OrderListForm> olfList = new ArrayList<OrderListForm>();

		// 1、根据用户id查询该用户所有订单
		List<Order> list = orderdao.findOrderByUserId(user_id);
		// 2、遍历订单 生成orderListForm对象存入list
		for (Order order : list) {
			OrderListForm olf = new OrderListForm();
			olf.setId(order.getId());
			olf.setMoney(order.getMoney());
			olf.setOrdertime(order.getOrdertime());
			olf.setPaystate(order.getPaystate());
			olf.setReceiverinfo(order.getReceiverinfo());
			// 设置用户名
			User user = userdao.findUserByUserId(user_id);
			olf.setUsername(user.getUsername());
			// 3、设置商品信息
			// 查询当前订单的所有订单项
			List<OrderItem> itemsList = orderdao.findOrderItemByOrderId(order.getId());
			// 遍历所有订单项存入map集合
			Map<Product, Integer> map = new HashMap<Product, Integer>();
			for (OrderItem orderItem : itemsList) {
				String prod_id = orderItem.getProduct_id();
				// 根据商品id查询该商品
				Product product = proddao.findProductById(prod_id);
				map.put(product, orderItem.getBuynum());
			}
			olf.setProdMap(map);
			olfList.add(olf);
		}
		return olfList;
	}

	/**
	 * 根据订单id删除订单
	 */
	@Override
	public void delOrderByOrderId(String order_id) {
		// TODO Auto-generated method stub
		try {
			// 开启事务
			DataSourceUtils.startTransaction();

			// 根据订单id找到所有订单项
			List<OrderItem> itemList = orderdao.findOrderItemByOrderId(order_id);
			// 遍历订单项将对应prod_id的商品的数量加会库存
			for (OrderItem orderItem : itemList) {
				proddao.addProdNumByProdId(orderItem.getProduct_id(),orderItem.getBuynum());
			}
			// 删除订单项
			orderdao.delOrderItemByOrderId(order_id);
			// 删除订单
			orderdao.delOrderByOrderId(order_id);

			// 提交事务
			DataSourceUtils.commitAndClose();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// 回滚事务
			DataSourceUtils.rollbackAndClose();
			e.printStackTrace();
		}
	}
	/**
	 * 根据订单编号查询订单
	 */
	@Override
	public Order findOrderById(String orderid) {
		// TODO Auto-generated method stub
		return orderdao.findOrderById(orderid);
	}
	/**
	 * 修改支付状态
	 */
	@Override
	public void changPayState(String r6_Order, int i) {
		// TODO Auto-generated method stub
		orderdao.changPayState(r6_Order,i);
	}
}
