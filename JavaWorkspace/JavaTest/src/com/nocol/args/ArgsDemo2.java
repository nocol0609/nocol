package com.nocol.args;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
形式参数：
	基本类型(太简单，不是我今天要讲解的)
	引用类型
		类名:(匿名对象的时候其实我们已经讲过了)需要的是该类的对象
		抽象类:需要的是该抽象的类子类对象
		接口
*/
//定义抽象Person类
abstract class Person{
	public abstract void teach();
}
//定义Person Demo类
class PersonDemo{
	public void method(Person p){//抽象类当做形式参数
		                         //p; p = new Teacher();  Person p = new Teacher(); 
		                         //多态
		p.teach();
	}
}
//定义抽象Person类的子类       作用：通过抽象类的子类对象实现方法调用
class Teacher extends Person{
	public void teach(){   //子类实现父类的抽象方法
		System.out.println("teach");
	}
} 

public class ArgsDemo2 {
	public static void main(String[] args){
		//目前是没有办法的使用的
		//因为抽象类没有对应的具体类
		//那么，我们就应该先定义一个具体类
		
		//需求：我要使用PersonDemo类中的method()方法
		PersonDemo pd=new PersonDemo();
		Person p=new Teacher();
		pd.method(p);
	}
}
