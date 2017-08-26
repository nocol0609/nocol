package com.strategy;
/**
* @author lxp
*
* @TODO 
* 
*/
//测试类
public class StrategyDemo {
	public static void main(String[] args) {
		double[] a={9,8,10,9,8,9,8,7,10};
		Game game=new Game();
		//使用StrategyOne
		game.setStrategy(new StrategyOne());
		System.out.println("使用策略一得到的分数是："+"\r"+game.getScore(a));
		System.out.println("----------------");
		
		game.setStrategy(new StrategyTwo());
		System.out.println("使用策略二得到的分数是："+"\r"+game.getScore(a));
		System.out.println("----------------");
		
		game.setStrategy(new StrategyThree());
		System.out.println("使用策略三得到的分数是："+"\r"+game.getScore(a));
		System.out.println("----------------");
	}
}
