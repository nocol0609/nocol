package com.nocol.back;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * ����ֵ����
 *         ��������:
 *         �������ͣ� 
 *               ��:���ص��Ǹ���Ķ��� 
 *               ������:���ص��Ǹó����������Ķ��� 
 *               �ӿ�:
 */
abstract class Person {
	public abstract void study();
}

class PersonDemo {
	public Person getPerson() {
		
		// Person p = new Teacher();
		// return p;

		return new Teacher();
	}
}
//�������������
class Teacher extends Person {
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
}

class BackDemo2 {
	public static void main(String[] args) {
		// ������Ҫ����Person���е�study()����
		PersonDemo pd = new PersonDemo();
		//ԭ������ pd.getPerson();���ɣ������з���ֵ�����ó�����Person�Ķ���p���գ�ʵ��Ϊ���������
		
		Person p = pd.getPerson(); // new Teacher(); Person p = new Teacher();// ��̬							
		p.study();
	}
}