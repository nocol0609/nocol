package com.nocol.dao;

import java.util.List;

import com.nocol.bean.Order;
import com.nocol.bean.OrderItem;

public interface OrderDao {
	/**
	 * 添加订单
	 * @param order
	 */
	void addOder(Order order);
	
	/**
	 * 生成订单项
	 * @param item
	 */
	void addOrderItem(OrderItem item);
	/**
	 * 根据用户id查询该用户所有订单
	 * @param user_id
	 * @return
	 */
	List<Order> findOrderByUserId(int user_id);
	
	/**
	 * 根据订单id查询订单项
	 * @param id
	 * @return
	 */
	List<OrderItem> findOrderItemByOrderId(String id);
	/**
	 * 根据订单id删除订单
	 * @param order_id
	 */
	void delOrderByOrderId(String order_id);
	
	/**
	 * 根据订单id删除该订单的所有订单项
	 * @param order_id
	 */
	void delOrderItemByOrderId(String order_id);
	
	/**
	 * 根据订单id查询订单
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
