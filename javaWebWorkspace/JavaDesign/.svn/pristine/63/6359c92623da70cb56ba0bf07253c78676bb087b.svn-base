package com.nocol.pattern.structure.Decorator;
//具体的装饰类 可以添加�?个听音乐的功�?
public class ListenDecorator extends Decorator{

	public ListenDecorator(Action action) {
		super(action);
	}
	
	@Override
	public void go() {
		listen();//可以在go方法【前】添加一个听音乐的功�?
		super.go();
	}
	
	public void listen(){
		System.out.println("我在听音�?");
	}
	
}
