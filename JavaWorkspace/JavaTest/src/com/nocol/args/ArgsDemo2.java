package com.nocol.args;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
��ʽ������
	��������(̫�򵥣������ҽ���Ҫ�����)
	��������
		����:(���������ʱ����ʵ�����Ѿ�������)��Ҫ���Ǹ���Ķ���
		������:��Ҫ���Ǹó�������������
		�ӿ�
*/
//�������Person��
abstract class Person{
	public abstract void teach();
}
//����Person Demo��
class PersonDemo{
	public void method(Person p){//�����൱����ʽ����
		                         //p; p = new Teacher();  Person p = new Teacher(); 
		                         //��̬
		p.teach();
	}
}
//�������Person�������       ���ã�ͨ����������������ʵ�ַ�������
class Teacher extends Person{
	public void teach(){   //����ʵ�ָ���ĳ��󷽷�
		System.out.println("teach");
	}
} 

public class ArgsDemo2 {
	public static void main(String[] args){
		//Ŀǰ��û�а취��ʹ�õ�
		//��Ϊ������û�ж�Ӧ�ľ�����
		//��ô�����Ǿ�Ӧ���ȶ���һ��������
		
		//������Ҫʹ��PersonDemo���е�method()����
		PersonDemo pd=new PersonDemo();
		Person p=new Teacher();
		pd.method(p);
	}
}
