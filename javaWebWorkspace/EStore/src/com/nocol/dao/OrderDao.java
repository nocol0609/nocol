package com.nocol.dao;

import java.util.List;

import com.nocol.bean.Order;
import com.nocol.bean.OrderItem;

public interface OrderDao {
	/**
	 * ��Ӷ���
	 * @param order
	 */
	void addOder(Order order);
	
	/**
	 * ���ɶ�����
	 * @param item
	 */
	void addOrderItem(OrderItem item);
	/**
	 * �����û�id��ѯ���û����ж���
	 * @param user_id
	 * @return
	 */
	List<Order> findOrderByUserId(int user_id);
	
	/**
	 * ���ݶ���id��ѯ������
	 * @param id
	 * @return
	 */
	List<OrderItem> findOrderItemByOrderId(String id);
	/**
	 * ���ݶ���idɾ������
	 * @param order_id
	 */
	void delOrderByOrderId(String order_id);
	
	/**
	 * ���ݶ���idɾ���ö��������ж�����
	 * @param order_id
	 */
	void delOrderItemByOrderId(String order_id);
	
	/**
	 * ���ݶ���id��ѯ����
	 * @param orderid
	 * @return
	 */
	Order findOrderById(String orderid);
	/**
	 * �޸�֧��״̬
	 * @param r6_Order
	 * @param i
	 */
	void changPayState(String r6_Order, int i);

}
