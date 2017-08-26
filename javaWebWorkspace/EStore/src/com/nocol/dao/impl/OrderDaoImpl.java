package com.nocol.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.nocol.bean.Order;
import com.nocol.bean.OrderItem;
import com.nocol.dao.OrderDao;
import com.nocol.utils.DataSourceUtils;

public class OrderDaoImpl implements OrderDao {
	/**
	 * 添加订单
	 */
	@Override
	public void addOder(Order order) {
		// TODO Auto-generated method stub
		try {
			String sql = "insert into orders values(?,?,?,?,sysdate,?)";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			runner.update(sql, order.getId(), order.getMoney(), order.getReceiverinfo(), order.getPaystate(),
					order.getUser_id());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 生成订单项
	 */
	@Override
	public void addOrderItem(OrderItem item) {
		// TODO Auto-generated method stub
		try {
			String sql = "insert into orderitem values(?,?,?)";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			runner.update(sql, item.getOrder_id(), item.getProduct_id(), item.getBuynum());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 根据用户id查询该用户所有订单
	 */
	@Override
	public List<Order> findOrderByUserId(int user_id) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from orders where user_id=?";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			return runner.query(sql, new BeanListHandler<Order>(Order.class), user_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * 根据订单id查询订单项
	 */
	@Override
	public List<OrderItem> findOrderItemByOrderId(String id) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from orderitem where order_id=?";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			return runner.query(sql, new BeanListHandler<OrderItem>(OrderItem.class), id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * 根据订单id删除订单
	 */
	@Override
	public void delOrderByOrderId(String order_id) {
		// TODO Auto-generated method stub
		try {
			String sql = "delete from orders where id=?";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			runner.update(sql, order_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * 根据订单id删除该商品的所有订单项
	 */
	@Override
	public void delOrderItemByOrderId(String order_id) {
		// TODO Auto-generated method stub
		try {
			String sql = "delete from orderitem where order_id=?";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			runner.update(sql, order_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * 根据订单id查询订单
	 */
	@Override
	public Order findOrderById(String orderid) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from orders where id=?";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			return runner.query(sql, new BeanHandler<Order>(Order.class), orderid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * 修改支付状态
	 */
	@Override
	public void changPayState(String r6_Order, int i) {
		// TODO Auto-generated method stub
		try {
			String sql = "update orders set paystate=? where id=?";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			runner.update(sql, i, r6_Order);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
