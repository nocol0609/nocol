package com.test_10;

/*
 * 
 * ʵ�ֹ�������
��ʾ�����Բ���Math.random()ȡ��0~1֮��������ģ��������̣�
���ܾ���Ϊ100�ף��������0~0.3֮����������ܣ�
ÿ����2�ף���0.3~1֮������ڹ��ܣ�ÿ����1�ף�
������100����Ϊʤ����

Race�ࣺ����RabbitAndTurtle������ʵ�����ֱ�������Ӻ��ڹ�

RabbitAndTurtle�ࣺ�̳�Thread�࣬ʵ�����ܵ��߼�
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
		System.out.println(Thread.currentThread().getName() + "����" + count + "��");
	}

	private synchronized void TurtleRace() {
		if (CreateNum() > 0.3 && CreateNum() < 1) {
			count += 1;
		}
		Thread.currentThread().setName("Turtle");
		System.out.println(Thread.currentThread().getName() + "����" + count + "��");
	}

	public static void main(String[] args) {

		Race race = new Race();
		Rabbit rabbit = race.new Rabbit();
		Turtle turtle = race.new Turtle();

		rabbit.start();
		turtle.start();

	}
}