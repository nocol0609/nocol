package com.nocol.Dao;

import java.util.List;

import com.nocol.Bean.Order;
import com.nocol.Bean.OrderLine;

public interface OrderDao {
	
	/**
	 * 添加订单
	 * @param order
	 */
	void addOrder(Order order);
	
	/**
	 * 根据用户id查询订单
	 * @param id
	 * @return
	 */
	List<Order> findOrderByUserId(int id);
	
	/**
	 * 根据订单id查询订单项
	 * @param id
	 * @return
	 */
	List<OrderLine> findOrderLineByOrderId(String id);
	
	/**
	 * 根据订单id删除订单项
	 * @param order_id
	 */
	void delOrderLineByOrderId(String order_id);
	
	/**
	 * 根据订单id删除订单
	 * @param order_id
	 */
	void delOrderByOrderId(String order_id);

}
