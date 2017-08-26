package com.observer;
/**
* @author lxp
*
* @TODO 
* 
*/
//测试类
public class ObserverDemo {
	public static void main(String[] args) {
		//创建被观察者对象
		ConcreteSubject csb=new ConcreteSubject();
		//创建观察者对象
		ConcreteObserver cob=new ConcreteObserver();
		
		//将观察者添加到被观察者的通知名单内
		csb.Attach(cob);
		
		//被观察者发出通知，观察者接受通知更新状态
	    csb.Notify();
	}
}
