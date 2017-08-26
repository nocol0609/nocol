package com.test;

class RabbitAndTurtle extends Thread
{
	private int num;
	private static boolean end = false;

	public RabbitAndTurtle(String name){
		super(name);
	}

	public void run(){
		while(num<100){
			if(end)
				break;
			if(Thread.currentThread().getName().equals("rabbit")){
				if(Math.random()<=0.3){
					num+=2;
					System.out.println("rabbit:" + num);
					if(num==100)
						break;
				}
				Thread.yield();
			}
			else if(Thread.currentThread().getName().equals("turtle")){
				if(Math.random()>0.3){
					num++;
					System.out.println("turtle:" + num);
					if(num==100)
						break;
				}
				Thread.yield();
			}			
		}
		if(!end){
			System.out.println(Thread.currentThread().getName() + " win!!!");
			end = true; 
		}
	}
};
 