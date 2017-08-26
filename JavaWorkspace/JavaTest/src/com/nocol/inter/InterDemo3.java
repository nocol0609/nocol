package com.nocol.inter;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
��ʦ��ѧ������,������̵Ķ��⹦��

�������Ӿ��嵽����
	��ʦ�����������䣬�Է���˯��
	ѧ�������������䣬�Է���˯��
	
	�����й��Թ��ܣ�������ȡ��һ�����࣬���ࡣ
	
	���ࣺ
		����������
		�Է�();
		˯��(){}
		
	���̵Ķ��⹦�ܲ����˻�����ʦ������ѧ��һ��ʼ��Ӧ�þ߱��ģ����ԣ����ǰ�������Ϊ�ӿ�
	
	���̽ӿڡ�

	������ʦ���̣�ʵ�ֳ��̽ӿ�
	����ѧ�����̣�ʵ�ֳ��̽ӿ�
	
ʵ�֣��ӳ��󵽾���
	
ʹ�ã�����
*/
//������̽ӿ�
interface Smoking{
	//������̵ķ���
	public abstract void smoke();
}
//�����������
abstract class Person{
	private String name;
	private int age;
	//�޲ι���
	public Person(){}
	//���ι���
	public Person(String name,int age){
		this.age=age;
		this.name=name;
	}
	//��Ա����
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
	//���󷽷�
	public abstract void eat();
	//�ǳ��󷽷�
	public void sleep(){
		System.out.println("sleep");
	}
}
//������ʦ��
class Teacher extends Person{
	//�����޲ι���
	public Teacher(){}
	//������ι���
	public Teacher(String name,int age){
		super(name,age);
	}
	//����Ҫ����д���෽��
	public void eat(){
		System.out.println("eat mice");
	}
}
//����ѧ����
class Student extends Person{
	//�����޲ι���
	public Student(){}
	//������ι���
	public Student(String name,int age){
		super(name,age);
	}
	//����Ҫ����д���෽��
	public void eat(){
		System.out.println("eat meet");
	}
}
//�������̵���ʦ��
class SmokeTeacher extends Teacher implements Smoking{
	//�����޲ι���
	public SmokeTeacher(){}
	//������ι���
	public SmokeTeacher(String name,int age){
		super(name,age);
	}
	//��д�ӿڷ���
	public void smoke(){
		System.out.println("SmokeTeacher");
	}
}
//�������̵�ѧ����
class SmokeStudent extends Student implements Smoking{
	//�����޲ι���
	public SmokeStudent(){}
	//������ι���
	public SmokeStudent(String name,int age){
		super(name,age);
	}
	//��д�ӿڷ���
	public void smoke(){
		System.out.println("SmokeStudent");
	}
}
//���������
public class InterDemo3 {
	public static void main(String[] args){
		//���Ի���̵�ѧ����
		//��ʽһ
		SmokeStudent ss = new SmokeStudent();  //������ʵ��
		ss.setName("��˧��");
		ss.setAge(30);
		System.out.println(ss.getName()+"---"+ss.getAge());
		ss.eat();
		ss.sleep();
		ss.smoke();
		System.out.println("--------------------------------");
		
		//��ʽ��
		SmokeStudent ss2 = new SmokeStudent("��˧��",30);
		System.out.println(ss2.getName()+"---"+ss2.getAge());
		ss2.eat();
		ss2.sleep();
		ss2.smoke();
		
	}
}
