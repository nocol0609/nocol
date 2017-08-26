package com.nocol.object;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * Object:类 Object 是类层次结构的根类。每个类都使用 Object 作为超类。
 * 每个类都直接或者间接的继承自Object类。
 * 
 * Object类的方法：
 * 		A:public int hashCode():返回该对象的哈希码值。
 * 			注意：哈希值是根据哈希算法计算出来的一个值，这个值和地址值有关，但是不是实际地址值。
 * 			           你可以理解为地址值。
 * 
 *		B:public final Class getClass():返回此 Object 的运行时类   ,指Class类是什么类就返回什么类  
 *                                      //类名当做返回值，实际返回该类对象
 *			Class类的方法：
 *				public String getName()：        //以 String 的形式返回此 Class 对象所表示的实体
 */
//定义学生类

class Student extends Object{
	//Student继承超类Object，不写默认 
}
//Student的测试类
public class StudentDemo{  
	public static void main(String[] args) {
		Student s1=new Student();
		//hashCose()为父类的方法，子类可直接调用
		System.out.println(s1.hashCode());   //1704856573
		
		Student s2=new Student();
		System.out.println(s2.hashCode());    //705927765
		
		Student s3=s1;
		System.out.println(s3.hashCode());     //1704856573
		
		System.out.println("--------------------------------");
		
		Student s=new Student();
		Class c=s.getClass();     //public final Class getClass()；类名当做返回值，实际返回该类对象，所以接收
		
		String str=c.getName();
		System.out.println(str);   //打印com.nocol.object.Student  ，返回包名及类名
		
		//链式编程
       String str2=s.getClass().getName();
       System.out.println(str2);    //打印com.nocol.object.Student  ，返回包名及类名
	}
}
