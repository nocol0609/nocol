package com.mediator;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
public class MediatorDemo {
	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();
		
		ConcreteColleagueOne colleagueOne = new ConcreteColleagueOne(mediator);
		ConcreteColleagueTwo colleagueTwo = new ConcreteColleagueTwo(mediator);
		
		mediator.setColleagueOne(colleagueOne);
		mediator.setColleagueTwo(colleagueTwo);
				
		colleagueOne.giveMess("你好colleagueTwo，很高兴认识你！");
		colleagueTwo.giveMess("你好colleagueOne，我也很高兴认识你!");
		
	}
}
