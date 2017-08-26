package com.mediator;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
// 定义具体中介者
public class ConcreteMediator implements Mediator {

	private ConcreteColleagueOne colleagueOne;
	private ConcreteColleagueTwo colleagueTwo;

	public void setColleagueOne(ConcreteColleagueOne colleagueOne) {
		this.colleagueOne = colleagueOne;
	}

	public void setColleagueTwo(ConcreteColleagueTwo colleagueTwo) {
		this.colleagueTwo = colleagueTwo;
	}

	@Override
	public void sendMess(String mess, Colleague colleague) {
		// TODO Auto-generated method stub
		if (colleague == colleagueOne) {
			System.out.println("colleagueOne发送消息："+mess);
			colleagueTwo.reciveMess(mess);
		} else if (colleague == colleagueTwo){
			System.out.println("colleagueTwo发送消息："+mess);
			colleagueOne.reciveMess(mess);
		}
	}
}
