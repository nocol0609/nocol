package com.proxy;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
public class ComputerProxy implements Computer {

	// 创建厂家对象
	ComputerProduce computerProduce;

	public ComputerProxy(String Customer_name) {
		// TODO Auto-generated constructor stub
		computerProduce = new ComputerProduce(Customer_name);
	}

	@Override
	public void sellComputer() {
		// TODO Auto-generated method stub
		computerProduce.sellComputer();
	}

}
