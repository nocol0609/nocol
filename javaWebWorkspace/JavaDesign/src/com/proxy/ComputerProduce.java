package com.proxy;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
// 定义电脑厂家(真正实现卖电脑的实体)
public class ComputerProduce implements Computer {
	// 顾客
	String Customer_name;

	public ComputerProduce(String Customer_name) {
		this.Customer_name = Customer_name;
	}

	@Override
	public void sellComputer() {
		// TODO Auto-generated method stub
		System.out.println("厂家将电脑销售给了" + Customer_name);
	}
}
