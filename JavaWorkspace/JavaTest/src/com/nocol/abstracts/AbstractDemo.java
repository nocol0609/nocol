package com.nocol.abstracts;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
���������ڿ���һ��ϵͳʱ��Ҫ��Ա���������ƣ�Ա������3�����ԣ������������Լ����䡣
����Ҳ��Ա�������˺���Ա���������⣬��Ϊ����һ���������ԡ�
��ʹ�ü̳е�˼����Ƴ�Ա����;����ࡣҪ�������ṩ��Ҫ�ķ����������Է��ʡ�

������
	��ͨԱ����
		��Ա�����������������Լ����ʡ�
		��Ա����������
	�����ࣺ
		��Ա�����������������Լ����ʣ���������
		��Ա����������
		
ʵ�֣�
	Ա���ࣺ
	��ͨԱ���ࣺ
	�����ࣺ
*/
//����Ա����
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
	//����Ա�����󷽷�
	public abstract void work();
}

//������ͨԱ����
class Programer extends Employee{
	
	public Programer(){}
	
	public Programer(String name,String id,int age){
		  super(name,id,age);
	}
	
	public void work(){
		System.out.println("Ա����Ҫ����");
	}
}

//���徭���� ������˽������ԣ�
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
		System.out.println("������ȡ����");
	}
}
//���������
public class AbstractDemo {
	public static void main(String [] args){
		//����Ա����
		//��ʽһ(getXxx��setXxx)
		Employee em=new Programer();
		em.setName("��˧��");
		em.setId("ecjtu001");
		em.setAge(30);
		System.out.println(em.getName()+"---"+em.getId()+"---"+em.getAge());
		em.work();
		System.out.println("-------------------------------");
		//��ʽ��(ͨ�����췽����ֵ)
		em=new Programer("��˧��","ecjtu001",30);
		System.out.println(em.getName()+"---"+em.getId()+"---"+em.getAge());
		em.work();	
		System.out.println("-------------------------------");
		
		//���Ծ�����
		
		/*
		em = new Manager();
		em.setName("С˧��");
		em.setId("ecjtu002");
		em.setMoney(2000);    //���б�����Ϊ����Ա����û��setMoney()����
		*/
		//�������������е����ݣ���������������������
		//��ʽһ(getXxx��setXxx)
		Manager m = new Manager();
		m.setName("С˧��");
		m.setId("ecjtu002");
		m.setAge(30);
		m.setMoney(2000);
		System.out.println(m.getName()+"---"+m.getId()+"---"+m.getMoney());
		m.work();
		System.out.println("-------------------------------");
		//��ʽ��(ͨ�����췽����ֵ)
		m = new Manager("С˧��","ecjtu002",30,2000);
		System.out.println(m.getName()+"---"+m.getId()+"---"+m.getMoney());
		m.work();
	}
	
}
