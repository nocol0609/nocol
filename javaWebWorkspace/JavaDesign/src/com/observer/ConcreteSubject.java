 package com.observer;

import java.util.ArrayList;
import java.util.List;

/**
* @author lxp
*
* @TODO 
* 
*/
//������屻�۲���(֪ͨ��)��
public class ConcreteSubject extends Subject {
	
	//���弯�ϴ洢�۲���
	List<Observer> list=new ArrayList<Observer>();
	
	//���ӹ۲���
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
		//�������Ϲ۲��߶���
		for(Observer observer:list){
			observer.Update();
		}
	}
}
