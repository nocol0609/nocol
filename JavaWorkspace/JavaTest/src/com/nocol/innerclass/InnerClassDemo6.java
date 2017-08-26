package com.nocol.innerclass;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * �����ڲ����ڿ����е�ʹ��
 */
interface Person {
	public abstract void study();
}

class PersonDemo {
	
	public void method(Person p) {// �ӿ�����Ϊ��ʽ����,��ʵ������Ҫ�Ĳ��ǽӿڣ����Ǹýӿڵ�ʵ����Ķ���
	                     
		p.study();
	}
}

// ����ӿ�ʵ����
class Student implements Person {
	public void study() {
		System.out.println("study");
	}
}

class InnerClassDemo6 {
	public static void main(String[] args) {
		// ����
		PersonDemo pd = new PersonDemo();
		Person p = new Student();
		pd.method(p);
		System.out.println("-------------------------");

		// �����ڲ����ڿ����е�ʹ��
		// �����ڲ���ı����� �̳������ʵ���˽ӿڵ����������������Խ������������������Person��������󴫽�ȥ
		                                                         //�൱�ڣ�new Student();
		pd.method(new Person() {
			public void study() {
				System.out.println("study");
			}
		});
	}
}