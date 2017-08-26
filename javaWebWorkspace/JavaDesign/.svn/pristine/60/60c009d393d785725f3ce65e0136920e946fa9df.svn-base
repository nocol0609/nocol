package com.nocol.pattern.structure.Facade;

//外观�?/门面�?
public class Facade {
	private ServiceA a;
	private ServiceB b;
	private ServiceC c;
	public Facade() {
		a = new ServiceA();
		b = new ServiceB();
		c = new ServiceC();
	}
	
	public void start(){
		a.start();
	}
	public void run(){
		b.run();
	}
	public void end(){
		c.end();
	}
	
	public void service(){
		a.start();
		b.run();
		c.end();
	}
	
}
