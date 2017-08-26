package com.simplefactory;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
// 定义操作基类
public class OperationFactory {

	double numbera, numberb;

	public void setOperator(double numbera ,double numberb ){
		this.numbera=numbera;
		this.numberb=numberb;
	}
	
	public double getResult(){
		double result=0;
		return result;
	}
}
