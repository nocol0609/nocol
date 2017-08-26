package com.nocol.Dao.Impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.nocol.Bean.Order;
import com.nocol.Bean.OrderLine;
import com.nocol.Dao.OrderDao;
import com.nocol.Util.Common.DataSourceUtils;

public class OrderDaoImpl implements OrderDao {

	@Override
	public void addOrder(Order order) {
		// TODO Auto-generated method stub
		try {
			String sql = "insert into d_order values(?,sysdate,?,?,?,?,?)";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			runner.update(sql, order.getId(), order.getSum_price(), order.getPayway_id(),
					order.getStatus(), order.getUser().getId(), order.getReceiver().getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Order> findOrderByUserId(int id) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from d_order where user_id=?";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			return runner.query(sql, new BeanListHandler<Order>(Order.class), id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<OrderLine> findOrderLineByOrderId(String id) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from d_orderline where order_id=?";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			return runner.query(sql, new BeanListHandler<OrderLine>(OrderLine.class), id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Override
	public void delOrderLineByOrderId(String order_id) {
		// TODO Auto-generated method stub
		try {
			String sql = "delete from d_orderline where order_id=?";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			runner.update(sql, order_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Override
	public void delOrderByOrderId(String order_id) {
		// TODO Auto-generated method stub
		try {
			String sql = "delete from d_order where id=?";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			runner.update(sql, order_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
