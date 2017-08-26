package com.nocol.service;

import java.util.List;

import com.nocol.bean.Order;
import com.nocol.bean.OrderListForm;

public interface OrderService {
	/**
	 * 添加订单
	 * @param order
	 */
	void addOrder(Order order);
	
	/**
	 * 根据用户id查询该用户所有订单
	 * @param id
	 * @return
	 */
	List<OrderListForm> findOrderByUserId(int id);
	
	/**
	 * 根据订单id删除商品
	 * @param order_id
	 */
	void delOrderByOrderId(String order_id);
	
	/**
	 * 根据订单号查询订单
	 * @param orderid
	 * @return
	 */
	Order findOrderById(String orderid);
	
	/**
	 * 修改支付状态
	 * @param r6_Order
	 * @param i
	 */
	void changPayState(String r6_Order, int i);

}
