package com.nocol.Service.Impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nocol.Bean.Order;
import com.nocol.Bean.OrderLine;
import com.nocol.Bean.OrderListForm;
import com.nocol.Bean.Product;
import com.nocol.Bean.User;
import com.nocol.Dao.OrderDao;
import com.nocol.Dao.OrderLineDao;
import com.nocol.Dao.ProductDao;
import com.nocol.Dao.ReceiverDao;
import com.nocol.Dao.UserDao;
import com.nocol.Dao.Impl.OrderDaoImpl;
import com.nocol.Dao.Impl.OrderLineDaoImpl;
import com.nocol.Dao.Impl.ProductDaoImpl;
import com.nocol.Dao.Impl.ReceiverDaoImpl;
import com.nocol.Dao.Impl.UserDaoImpl;
import com.nocol.Service.OrderService;
import com.nocol.Util.Common.DataSourceUtils;

public class OrderServiceImpl implements OrderService {

	OrderDao orderDao = new OrderDaoImpl();
	OrderLineDao oderLineDao = new OrderLineDaoImpl();
	ProductDao productDao = new ProductDaoImpl();
	ReceiverDao receiverDao = new ReceiverDaoImpl();
	UserDao userDao = new UserDaoImpl();

	@Override
	public void addOrder(Order order) {
		// TODO Auto-generated method stub
		try {
			// 开启事务
			DataSourceUtils.startTransaction();

			// 生成收件人数据
			receiverDao.addReceiver(order.getReceiver());

			// 生成订单
			orderDao.addOrder(order);
			for (OrderLine item : order.getOrderlines()) {
				// 生成订单项
				oderLineDao.addOderLine(item);
				// 减掉库存
				productDao.delProdNum(item.getProduct().getId(), item.getAmount());
			}

			// 提交事务
			DataSourceUtils.commitAndClose();

		} catch (SQLException e) {
			// TODO Auto-generated catch block

			// 回滚事务
			DataSourceUtils.rollbackAndClose();

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
		// 2、遍历订单 生成orderListForm对象存入list
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
			List<OrderLine> itemsList = orderDao.findOrderLineByOrderId(order.getId());
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
	public void delOrderByOrderId(String order_id) {
		// TODO Auto-generated method stub
		try {
			// 开启事务
			DataSourceUtils.startTransaction();

			// 根据订单id找到所有订单项
			List<OrderLine> itemList = orderDao.findOrderLineByOrderId(order_id);
			// 遍历订单项将对应prod_id的商品的数量加会库存
			for (OrderLine orderLine : itemList) {
				productDao.addProdNumByProdId(orderLine.getProduct().getId(),orderLine.getAmount());
			}
			// 删除订单项
			orderDao.delOrderLineByOrderId(order_id);
			// 删除订单
			orderDao.delOrderByOrderId(order_id);

			// 提交事务
			DataSourceUtils.commitAndClose();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// 回滚事务
			DataSourceUtils.rollbackAndClose();
			e.printStackTrace();
		}
	}
}
