package com.observer;
/**
* @author lxp
*
* @TODO 
* 
*/
//定义抽象被观察者(通知者)类
public  abstract class Subject {
	//增加
	public abstract void Attach(Observer observer);
	//移除
	public abstract void Detach(Observer observer);
	//通知
	public abstract void Notify();
}
