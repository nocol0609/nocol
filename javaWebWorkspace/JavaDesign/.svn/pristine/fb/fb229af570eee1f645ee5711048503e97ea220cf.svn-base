package com.java;

/*
 *  1、静态代码块>构造代码块>构造方法
 *  2、子类初始化先执行（完成）父类初始化
 *  //一个类的初始化过程：
 *  	 先对成员变量初始化(成员变量又分基本类型和引用类型)
 *  			//int a=0;  
 *  			//Object obj=new Object();
 *  		分为默认初始化、显示初始化、构造方法初始化
 *  3、静态代码块随着类加载而加载,加载类时仅执行该类静态代码块，该类的构造代码块和构造方法暂不执行（调构造的时候执行）
 * 
 */ 
public class Test01_Static {
	public static void main(String[] args) {
		System.out.println("运行test1中的main函数，创建D类实例");
		new D();
	}
}
class E{
	E(){
		System.out.println("执行E的构造函数");
	}
	public void funOfE(){
		System.out.println("执行E的函数");
	}
}
class F{
	F(){
		System.out.println("执行F的构造函数");
	}
	public void funOfF(){
		System.out.println("执行F的函数");
	}
}
class B{
	E e=new E();
	static F f=new F();
	public String sb=getSb();
	static{
		System.out.println("执行B的static块（S包含E的成员变量，包含静态F的成员变量）");
		f.funOfF();
	}
	{
		System.out.println("执行B实例的普通初始化块");
	}
	B(){
		System.out.println("执行B的构造函数（S包含E的成员变量，包含静态F的成员变量）");
		e.funOfE();
	}
	public String getSb(){
		System.out.println("初始化B的实例成员变量sb");
		return "sb";
	}
}
class C extends B{
	static{
		System.out.println("执行C的static块（C继承B）");
	}
	{
		System.out.println("执行C的普通初始化块");
	}
	public C() {
		System.out.println("执行C的构造函数（C继承B）");
	}
}
class D extends C{
	public String sd1=getSd1();
	public static String sd=getSd();
	static{
		System.out.println("执行D的static块（D继承C）");
	}
	{
		System.out.println("执行D的普通初始化块");
	}
	D(){
		System.out.println("执行D的构造函数（D继承C）;父类B的实例成员变量sb的值为："+sd+";本类D的static成员变量sd的值为:"+sd+";"
				+ "本类D的static成员变量sd1的值为:"+sd1);
	}
	static public String getSd(){
		System.out.println("初始化D的static成员变量sd");
		return "sd";
	}
	public String getSd1(){
		System.out.println("初始化D的实例成员变量速度sd1");
		return "sd1";
	}
}