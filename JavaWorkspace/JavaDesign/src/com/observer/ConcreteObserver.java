package com.observer;
/**
* @author lxp
*
* @TODO 
* 
*/
//定义具体的观察者
public class ConcreteObserver  extends Observer{

	@Override
	public void Update() {
		// TODO Auto-generated method stub
		System.out.println("被观察者状态改变,立即更新状态");
	}
}
