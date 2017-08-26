package com.mediator;
/**
* @author lxp
*
* @TODO 
* 
*/
public class ConcreteColleagueOne implements Colleague {
	
	private ConcreteMediator mediotor;
	
	public ConcreteColleagueOne( ConcreteMediator mediator) {
		// TODO Auto-generated constructor stub
		this.mediotor=mediator;
	}
	
	@Override
	public void giveMess(String mess) {
		// TODO Auto-generated method stub
		
		mediotor.sendMess(mess, this);
	}

	@Override
	public void reciveMess(String mess) {
		// TODO Auto-generated method stub
		System.out.println("colleagueOne收到消息："+mess);
	}

}
