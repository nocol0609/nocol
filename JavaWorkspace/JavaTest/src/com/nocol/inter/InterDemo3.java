package com.nocol.inter;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
老师和学生案例,加入抽烟的额外功能

分析：从具体到抽象
	老师：姓名，年龄，吃饭，睡觉
	学生：姓名，年龄，吃饭，睡觉
	
	由于有共性功能，我们提取出一个父类，人类。
	
	人类：
		姓名，年龄
		吃饭();
		睡觉(){}
		
	抽烟的额外功能不是人或者老师，或者学生一开始就应该具备的，所以，我们把它定义为接口
	
	抽烟接口。

	部分老师抽烟：实现抽烟接口
	部分学生抽烟：实现抽烟接口
	
实现：从抽象到具体
	
使用：具体
*/
//定义抽烟接口
interface Smoking{
	//定义抽烟的方法
	public abstract void smoke();
}
//定义抽象人类
abstract class Person{
	private String name;
	private int age;
	//无参构造
	public Person(){}
	//带参构造
	public Person(String name,int age){
		this.age=age;
		this.name=name;
	}
	//成员方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//抽象方法
	public abstract void eat();
	//非抽象方法
	public void sleep(){
		System.out.println("sleep");
	}
}
//定义老师类
class Teacher extends Person{
	//定义无参构造
	public Teacher(){}
	//定义带参构造
	public Teacher(String name,int age){
		super(name,age);
	}
	//子类要求重写父类方法
	public void eat(){
		System.out.println("eat mice");
	}
}
//定义学生类
class Student extends Person{
	//定义无参构造
	public Student(){}
	//定义带参构造
	public Student(String name,int age){
		super(name,age);
	}
	//子类要求重写父类方法
	public void eat(){
		System.out.println("eat meet");
	}
}
//定义会抽烟的老师类
class SmokeTeacher extends Teacher implements Smoking{
	//定义无参构造
	public SmokeTeacher(){}
	//定义带参构造
	public SmokeTeacher(String name,int age){
		super(name,age);
	}
	//重写接口方法
	public void smoke(){
		System.out.println("SmokeTeacher");
	}
}
//定义会抽烟的学生类
class SmokeStudent extends Student implements Smoking{
	//定义无参构造
	public SmokeStudent(){}
	//定义带参构造
	public SmokeStudent(String name,int age){
		super(name,age);
	}
	//重写接口方法
	public void smoke(){
		System.out.println("SmokeStudent");
	}
}
//定义测试类
public class InterDemo3 {
	public static void main(String[] args){
		//测试会抽烟的学生类
		//方式一
		SmokeStudent ss = new SmokeStudent();  //具体类实现
		ss.setName("大帅比");
		ss.setAge(30);
		System.out.println(ss.getName()+"---"+ss.getAge());
		ss.eat();
		ss.sleep();
		ss.smoke();
		System.out.println("--------------------------------");
		
		//方式二
		SmokeStudent ss2 = new SmokeStudent("大帅比",30);
		System.out.println(ss2.getName()+"---"+ss2.getAge());
		ss2.eat();
		ss2.sleep();
		ss2.smoke();
		
	}
}
