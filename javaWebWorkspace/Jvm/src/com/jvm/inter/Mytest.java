package com.jvm.inter;

/**
 * 静态成员初始化从上到下
 * @author Nocol
 *
 */
class Singleton {
	
	private static Singleton singleton=new Singleton();  //遇到new，对类进行初始化并执行构造方法
	                                                     // counter1=1; counter2=1;
	public static int counter1;       //依次初始化静态成员变量  counter1=1;不变
	public static int counter2=0;     //再对counter2进行初始化,将0赋给counter2，因此此时counter2=0;
	
	private Singleton() {
		counter1++;
		counter2++;
	}
	public static Singleton getInstance(){
		return singleton;
	}
}

public class Mytest{
	public static void main(String[] args) {
		
		Singleton singleton=Singleton.getInstance();
		
		/**
		 * 若private static Singleton singleton=new Singleton(); 在两个静态成员变量counter1和counter2之后
		 * 结果为：counter1=1; counter2=1;
		 */
		
		System.out.println("counter1="+singleton.counter1); //1
		System.out.println("counter2="+singleton.counter2);  //0
		
		
		
	}
}