package com.test_10;

/*
 * 
 * 实现龟兔赛跑
提示：可以采用Math.random()取得0~1之间的随机数模拟比赛进程，
如总距离为100米，在随机数0~0.3之间代表兔子跑，
每次跑2米，在0.3~1之间代表乌龟跑，每次跑1米，
先跑完100米者为胜利者

Race类：产生RabbitAndTurtle的两个实例，分别代表兔子和乌龟

RabbitAndTurtle类：继承Thread类，实现赛跑的逻辑
 */

public class Race {

	static double num;
	int count = 0;

	public static double CreateNum() {

			num = Math.random();
			return num;

	}

	private class Rabbit extends Thread {
		@Override
		public void run() {
			// TODO Auto-generated method stub
//		 while(count<=100){
//			RabbitRace();
	//		 }
//			do {
//				RabbitRace();
//			} while (count <= 100);
			for (int i = 1; i < 50; i++) {
				RabbitRace();
			}
		}
	}

	private class Turtle extends Thread {
		@Override
		public void run() {
			// TODO Auto-generated method stub

//		  while(count<=100){
//			 TurtleRace();
//			 }
//			do {
//				TurtleRace();
//			} while (count <= 100);
			
			for (int i = 1; i < 100; i++) {
				TurtleRace();
			}
		}
	}

	private synchronized void RabbitRace() {
		if (CreateNum() > 0 && CreateNum() < 0.3) {
			count += 2;
		}
		Thread.currentThread().setName("Rabbit");
		System.out.println(Thread.currentThread().getName() + "跑了" + count + "米");
	}

	private synchronized void TurtleRace() {
		if (CreateNum() > 0.3 && CreateNum() < 1) {
			count += 1;
		}
		Thread.currentThread().setName("Turtle");
		System.out.println(Thread.currentThread().getName() + "跑了" + count + "米");
	}

	public static void main(String[] args) {

		Race race = new Race();
		Rabbit rabbit = race.new Rabbit();
		Turtle turtle = race.new Turtle();

		rabbit.start();
		turtle.start();

	}
}
