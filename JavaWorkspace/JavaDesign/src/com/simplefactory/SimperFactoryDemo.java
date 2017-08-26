package com.simplefactory;
/**
* @author lxp
*
* @TODO 
* 
*/
//测试类
public class SimperFactoryDemo {
	public static void main(String[] args) {
		
		//加法操作
		OperationFactory opFactory=new AddOperation();
		opFactory.setOperator(10.0, 20.0);
		System.out.println("加法结果是："+opFactory.getResult());
		//减法操作
		opFactory=new SubOperation();
		opFactory.setOperator(10.0, 20.0);
		System.out.println("减法结果是："+opFactory.getResult());
		//乘法操作
		opFactory=new MulOperation();
		opFactory.setOperator(10.0, 20.0);
		System.out.println("乘法结果是："+opFactory.getResult());
		//除法操作(除数为零情况)
		opFactory=new DivOperation();
//		opFactory.setOperator(10.0, 0.0);
//		System.out.println("除法结果是："+opFactory.getResult());
		//除法操作(除数不为零)
		opFactory.setOperator(10.0, 20.0);
		System.out.println("除法结果是："+opFactory.getResult());
	}
}
