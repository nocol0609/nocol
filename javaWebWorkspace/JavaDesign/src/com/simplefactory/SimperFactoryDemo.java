package com.simplefactory;
/**
* @author lxp
*
* @TODO 
* 
*/
//������
public class SimperFactoryDemo {
	public static void main(String[] args) {
		
		//�ӷ�����
		OperationFactory opFactory=new AddOperation();
		opFactory.setOperator(10.0, 20.0);
		System.out.println("�ӷ�����ǣ�"+opFactory.getResult());
		//��������
		opFactory=new SubOperation();
		opFactory.setOperator(10.0, 20.0);
		System.out.println("��������ǣ�"+opFactory.getResult());
		//�˷�����
		opFactory=new MulOperation();
		opFactory.setOperator(10.0, 20.0);
		System.out.println("�˷�����ǣ�"+opFactory.getResult());
		//��������(����Ϊ�����)
		opFactory=new DivOperation();
//		opFactory.setOperator(10.0, 0.0);
//		System.out.println("��������ǣ�"+opFactory.getResult());
		//��������(������Ϊ��)
		opFactory.setOperator(10.0, 20.0);
		System.out.println("��������ǣ�"+opFactory.getResult());
	}
}
