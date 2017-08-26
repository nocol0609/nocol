package com.ssm.dao;

import java.util.List;

import com.ssm.bean.Order;

/**
 * 持久层接口
 * 
 * @author Nocol
 *
 */
public interface OrderDao {
	/**
	 * 添加订单
	 * 
	 * @param order
	 */
	void addOrder(Order order);

	/**
	 * 根据用户id查询订单
	 * 
	 * @param id
	 * @return
	 */
	List<Order> findOrderByUserId(int id);

	/**
	 * 根据订单id删除订单
	 * 
	 * @param order_id
	 */
	void delOrderByOrderId(String order_id);
}
