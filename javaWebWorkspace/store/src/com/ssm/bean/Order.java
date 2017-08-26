package com.ssm.bean;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

/*
 * 订单
 */
public class Order implements Serializable{

	//生成的订单编号
	private String id;
	//订单生成的时间
	private Timestamp start_date;
	//所有产品的总价
	private double sum_price;
	//支付方式
	private long payway_id;
	//订单的状态:1，待付款，2完成，3评价
	private String status;
	//订单所属的用户
	private User user;
	//接受人详细信息
	private Receiver receiver;
	
	private Set<OrderLine> orderlines;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Timestamp getStart_date() {
		return start_date;
	}

	public void setStart_date(Timestamp start_date) {
		this.start_date = start_date;
	}

	public double getSum_price() {
		return sum_price;
	}

	public void setSum_price(double sum_price) {
		this.sum_price = sum_price;
	}

	public long getPayway_id() {
		return payway_id;
	}

	public void setPayway_id(long payway_id) {
		this.payway_id = payway_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Receiver getReceiver() {
		return receiver;
	}

	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

	public Set<OrderLine> getOrderlines() {
		return orderlines;
	}

	public void setOrderlines(Set<OrderLine> orderlines) {
		this.orderlines = orderlines;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", start_date=" + start_date + ", sum_price=" + sum_price + ", payway_id="
				+ payway_id + ", status=" + status + ", user=" + user + ", receiver=" + receiver + ", orderlines="
				+ orderlines + "]";
	}

	
	

}
