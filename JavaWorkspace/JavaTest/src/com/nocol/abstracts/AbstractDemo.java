package com.nocol.abstracts;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
假如我们在开发一个系统时需要对员工类进行设计，员工包含3个属性：姓名、工号以及年龄。
经理也是员工，除了含有员工的属性外，另为还有一个奖金属性。
请使用继承的思想设计出员工类和经理类。要求类中提供必要的方法进行属性访问。

分析：
	普通员工类
		成员变量：姓名、工号以及工资。
		成员方法：工作
	经理类：
		成员变量：姓名、工号以及工资，奖金属性
		成员方法：工作
		
实现：
	员工类：
	普通员工类：
	经理类：
*/
//定义员工类
abstract class Employee{
	private String name;
	private String id;
	private int age;
	
	public Employee(){};
	public Employee(String name,String id,int age){
		this.name=name;
		this.id=id;
		this.age=age;
	}
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		this.id=id;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	//定义员工抽象方法
	public abstract void work();
}

//定义普通员工类
class Programer extends Employee{
	
	public Programer(){}
	
	public Programer(String name,String id,int age){
		  super(name,id,age);
	}
	
	public void work(){
		System.out.println("员工按要求工作");
	}
}

//定义经理类 （多加了奖金属性）
class Manager extends Employee{
	
	private int money;
	
	public Manager(){}
	
	public Manager(String name,String id,int age,int money){
		  super(name,id,age);
		  this.money=money;
	}
	
	public int getMoney(){
		return money;
	}
	
	public void setMoney(int money){
		this.money=money;
	}
	
	public void work(){
		System.out.println("经理领取奖金");
	}
}
//定义测试类
public class AbstractDemo {
	public static void main(String [] args){
		//测试员工类
		//方式一(getXxx和setXxx)
		Employee em=new Programer();
		em.setName("大帅比");
		em.setId("ecjtu001");
		em.setAge(30);
		System.out.println(em.getName()+"---"+em.getId()+"---"+em.getAge());
		em.work();
		System.out.println("-------------------------------");
		//方式二(通过构造方法赋值)
		em=new Programer("大帅比","ecjtu001",30);
		System.out.println(em.getName()+"---"+em.getId()+"---"+em.getAge());
		em.work();	
		System.out.println("-------------------------------");
		
		//测试经理类
		
		/*
		em = new Manager();
		em.setName("小帅比");
		em.setId("ecjtu002");
		em.setMoney(2000);    //运行报错，因为抽象员工类没有setMoney()方法
		*/
		//由于子类有特有的内容，所以我们用子类来测试
		//方式一(getXxx和setXxx)
		Manager m = new Manager();
		m.setName("小帅比");
		m.setId("ecjtu002");
		m.setAge(30);
		m.setMoney(2000);
		System.out.println(m.getName()+"---"+m.getId()+"---"+m.getMoney());
		m.work();
		System.out.println("-------------------------------");
		//方式二(通过构造方法赋值)
		m = new Manager("小帅比","ecjtu002",30,2000);
		System.out.println(m.getName()+"---"+m.getId()+"---"+m.getMoney());
		m.work();
	}
	
}
