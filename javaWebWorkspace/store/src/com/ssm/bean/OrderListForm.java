package com.ssm.bean;

import java.sql.Timestamp;
import java.util.Map;

public class OrderListForm {
	private String id;
	private double money;
	private String address;
	private String paystate;
	private Timestamp ordertime;
	private String username;
	private Map<Product,Integer> prodMap;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getReceiverinfo() {
		return address;
	}
	public void setReceiverinfo(String address) {
		this.address = address;
	}
	public String getPaystate() {
		return paystate;
	}
	public void setPaystate(String paystate) {
		this.paystate = paystate;
	}
	public Timestamp getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(Timestamp ordertime) {
		this.ordertime = ordertime;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Map<Product, Integer> getProdMap() {
		return prodMap;
	}
	public void setProdMap(Map<Product, Integer> prodMap) {
		this.prodMap = prodMap;
	}
}