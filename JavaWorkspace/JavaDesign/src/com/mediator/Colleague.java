package com.mediator;
/**
* @author lxp
*
* @TODO 
* 
*/
//定义抽象同事接口
public interface Colleague {
	//发送消息
	public  abstract void giveMess(String mess);
	//接收消息
	public abstract void reciveMess(String mess);
}
