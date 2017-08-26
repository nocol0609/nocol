package com.nocol.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nocol.bean.Order;
import com.nocol.bean.OrderItem;
import com.nocol.bean.OrderListForm;
import com.nocol.bean.Product;
import com.nocol.bean.User;
import com.nocol.dao.OrderDao;
import com.nocol.dao.ProdDao;
import com.nocol.dao.UserDao;
import com.nocol.dao.impl.OrderDaoImpl;
import com.nocol.dao.impl.ProdDaoImpl;
import com.nocol.dao.impl.UserDaoImpl;
import com.nocol.service.OrderService;
import com.nocol.utils.DataSourceUtils;

public class OrderServiceImpl implements OrderService {

	OrderDao orderdao = new OrderDaoImpl();
	ProdDao proddao = new ProdDaoImpl();
	UserDao userdao = new UserDaoImpl();

	/**
	 * ��Ӷ���
	 */
	@Override
	public void addOrder(Order order) {
		// TODO Auto-generated method stub

		try {
			// ��������
			DataSourceUtils.startTransaction();

			// ���ɶ���
			orderdao.addOder(order);
			for (OrderItem item : order.getList()) {
				// ���ɶ�����
				orderdao.addOrderItem(item);
				// �۳��������
				proddao.delProdNum(item.getProduct_id(), item.getBuynum());
			}
			// �ύ����
			DataSourceUtils.commitAndClose();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			// �ع�����
			DataSourceUtils.rollbackAndClose();

			e.printStackTrace();
		}

	}

	/**
	 * �����û�id��ѯ���û����ж���
	 */
	@Override
	public List<OrderListForm> findOrderByUserId(int user_id) {
		// TODO Auto-generated method stub

		// �����洢���ж��������Ϣ����
		List<OrderListForm> olfList = new ArrayList<OrderListForm>();

		// 1�������û�id��ѯ���û����ж���
		List<Order> list = orderdao.findOrderByUserId(user_id);
		// 2���������� ����orderListForm�������list
		for (Order order : list) {
			OrderListForm olf = new OrderListForm();
			olf.setId(order.getId());
			olf.setMoney(order.getMoney());
			olf.setOrdertime(order.getOrdertime());
			olf.setPaystate(order.getPaystate());
			olf.setReceiverinfo(order.getReceiverinfo());
			// �����û���
			User user = userdao.findUserByUserId(user_id);
			olf.setUsername(user.getUsername());
			// 3��������Ʒ��Ϣ
			// ��ѯ��ǰ���������ж�����
			List<OrderItem> itemsList = orderdao.findOrderItemByOrderId(order.getId());
			// �������ж��������map����
			Map<Product, Integer> map = new HashMap<Product, Integer>();
			for (OrderItem orderItem : itemsList) {
				String prod_id = orderItem.getProduct_id();
				// ������Ʒid��ѯ����Ʒ
				Product product = proddao.findProductById(prod_id);
				map.put(product, orderItem.getBuynum());
			}
			olf.setProdMap(map);
			olfList.add(olf);
		}
		return olfList;
	}

	/**
	 * ���ݶ���idɾ������
	 */
	@Override
	public void delOrderByOrderId(String order_id) {
		// TODO Auto-generated method stub
		try {
			// ��������
			DataSourceUtils.startTransaction();

			// ���ݶ���id�ҵ����ж�����
			List<OrderItem> itemList = orderdao.findOrderItemByOrderId(order_id);
			// �����������Ӧprod_id����Ʒ�������ӻ���
			for (OrderItem orderItem : itemList) {
				proddao.addProdNumByProdId(orderItem.getProduct_id(),orderItem.getBuynum());
			}
			// ɾ��������
			orderdao.delOrderItemByOrderId(order_id);
			// ɾ������
			orderdao.delOrderByOrderId(order_id);

			// �ύ����
			DataSourceUtils.commitAndClose();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// �ع�����
			DataSourceUtils.rollbackAndClose();
			e.printStackTrace();
		}
	}
	/**
	 * ���ݶ�����Ų�ѯ����
	 */
	@Override
	public Order findOrderById(String orderid) {
		// TODO Auto-generated method stub
		return orderdao.findOrderById(orderid);
	}
	/**
	 * �޸�֧��״̬
	 */
	@Override
	public void changPayState(String r6_Order, int i) {
		// TODO Auto-generated method stub
		orderdao.changPayState(r6_Order,i);
	}
}
