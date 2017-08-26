package com.nocol.object;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * Object��ķ�����
 * 
 *            C�� public String toString():���ظö�����ַ�����ʾ��
 * 
 * Integer���µ�һ����̬������ 
 *          public static String toHexString(int i)����һ������ת��һ��ʮ�����Ʊ�ʾ���ַ���
 * 
 *          ���������Ϣ��û���κ�����ġ����ԣ������������඼��д�÷����� 
 *          
 *          ��ô��д��?
 *                  �Ѹ�������г�Ա����ֵ��ɷ��ؼ��ɡ� ��д�����հ淽�������Զ�����toString()������
 *          
 * ע�⣺ ֱ�����һ����������ƣ���ʵ���ǵ��øö����toString()������
 */
// ����ѧ����
class Student2 {     //StudentDemo���Ѿ���Student��
	private String name;
	private int age;

	public Student2() {
		super();
	}

	public Student2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

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

	// ��дObject���toString()�������Զ����ɣ�
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	// ��дObject���toString()�������ֶ����ɣ�
	/*
	 * public String toString() { 
	 *	//return super.toString();          //����Object�����toString()
	 *  //return "hello";
	 * return "����:" + name + ",����:" + age; }
	 */
}
//������
public class ToStringDemo {
	public static void main(String[] args) {
		Student2 s = new Student2();
	
		System.out.println(s.toString());// δ��дtoString()ʱ��ӡcom.nocol.object.Student2@659e0bfd
		System.out.println("--------------------");
		
		// toString()������ֵ�ȼ�����
		// getClass().getName() + '@' + Integer.toHexString(hashCode())
		
		// this.getClass().getName()+'@'+Integer.toHexString(this.hashCode())

		// com.nocol.object.Student2@659e0bfd

		System.out.println(s.getClass().getName() + '@'
				+ Integer.toHexString(s.hashCode()));  //��ӡ�ʼ��toString��������������δ��д��

		System.out.println(s.toString());  //��ӡ��д���toString()����

		// ֱ��������������
		System.out.println(s);   //ֱ�����һ����������ƣ���ʵ���ǵ��øö����toString()�����������Ϊ��д���
	}
}
