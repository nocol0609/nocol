package com.ssm.service;

import java.util.List;

import com.ssm.bean.Order;
import com.ssm.bean.OrderListForm;


public interface OrderService {
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
	List<OrderListForm> findOrderByUserId(int id);
	
	/**
	 * 通过订单id删除订单
	 * @param order_id
	 */
	void delOrderByOrderId(String order_id);

}
