package com.proxy;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
// ������Գ���(����ʵ�������Ե�ʵ��)
public class ComputerProduce implements Computer {
	// �˿�
	String Customer_name;

	public ComputerProduce(String Customer_name) {
		this.Customer_name = Customer_name;
	}

	@Override
	public void sellComputer() {
		// TODO Auto-generated method stub
		System.out.println("���ҽ��������۸���" + Customer_name);
	}
}