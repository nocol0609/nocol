package com.nocol.pattern.structure.Decorator;
//被装饰的�?  就是�?要我们装饰的目标
public class Person implements Action{

	@Override
	public void go() {
		System.out.println("我在走路");
	}

}
