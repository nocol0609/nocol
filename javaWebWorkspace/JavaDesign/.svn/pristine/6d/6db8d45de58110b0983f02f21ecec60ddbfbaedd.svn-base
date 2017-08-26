 package com.observer;

import java.util.ArrayList;
import java.util.List;

/**
* @author lxp
*
* @TODO 
* 
*/
//定义具体被观察者(通知者)类
public class ConcreteSubject extends Subject {
	
	//定义集合存储观察者
	List<Observer> list=new ArrayList<Observer>();
	
	//增加观察者
	@Override
	public void Attach(Observer observer) {
		// TODO Auto-generated method stub
		list.add(observer);
	}

	@Override
	public void Detach(Observer observer) {
		// TODO Auto-generated method stub
		list.add(observer);
	}

	@Override
	public void Notify() {
		// TODO Auto-generated method stub
		//遍历集合观察者对象
		for(Observer observer:list){
			observer.Update();
		}
	}
}
