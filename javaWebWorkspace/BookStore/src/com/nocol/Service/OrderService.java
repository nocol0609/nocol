package com.nocol.Service;

import java.util.List;

import com.nocol.Bean.Order;
import com.nocol.Bean.OrderListForm;

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
