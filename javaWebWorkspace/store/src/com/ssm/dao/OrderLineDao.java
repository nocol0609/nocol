package com.ssm.dao;

import java.util.List;

import com.ssm.bean.OrderLine;

/**
 * 持久层接口
 * @author Nocol
 *
 */
public interface OrderLineDao {
	/**
	 * 生成订单项
	 * @param item
	 */
	void addOrderLine(OrderLine item);
	
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
}
