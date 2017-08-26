package com.nocol.pattern.structure.Decorator;

public class Test {
	public static void main(String[] args) {
		
		/*用户可以根据�?�? 任意给go方法添加听音乐或者休息的功能*/
	//Action a = new Person();
		//Action a = new ListenDecorator(new ListenDecorator(new Person()));
//		Action a = new RelaxDecorator(new Person());
//		Action a1 = new RelaxDecorator(new ListenDecorator(new Person()));
//		Action a2=new RelaxDecorator(a1);
//		Action a3=new RelaxDecorator(a2);
//		Action a=new RelaxDecorator(a3);
		Action a = new ListenDecorator(new RelaxDecorator(new Person()));
		a.go();
		
	}
}
