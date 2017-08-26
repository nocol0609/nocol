package com.ssm.dao;

import java.util.List;

import com.ssm.bean.OrderLine;

/**
 * �־ò�ӿ�
 * @author Nocol
 *
 */
public interface OrderLineDao {
	/**
	 * ���ɶ�����
	 * @param item
	 */
	void addOrderLine(OrderLine item);
	
	/**
	 * ���ݶ���id��ѯ������
	 * @param id
	 * @return
	 */
	List<OrderLine> findOrderLineByOrderId(String id);
	
	/**
	 * ���ݶ���idɾ��������
	 * @param order_id
	 */
	void delOrderLineByOrderId(String order_id);
}
