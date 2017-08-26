package com.mediator;
/**
* @author lxp
*
* @TODO 
* 
*/
public class ConcreteColleagueTwo implements Colleague {
	
    private ConcreteMediator mediotor;
	
	public ConcreteColleagueTwo( ConcreteMediator mediator) {
		// TODO Auto-generated constructor stub
		this.mediotor=mediator;
	}
	
	@Override
	public void giveMess(String mess) {
		// TODO Auto-generated method stub
		//System.out.println("ColleagueTwo发送消息："+mess);
		mediotor.sendMess(mess, this);
	}

	@Override
	public void reciveMess(String mess) {
		// TODO Auto-generated method stub
		System.out.println("colleagueTwo收到消息："+mess);
	}

}
