package com.nocol.duotai;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * ������д���:���ж���û�����⣬���û�У�д�����
 * 
 * ��̬�ĳ�Ա�����ص㣺 ���������뿴��ߣ����п��ұߡ�
 * 
 * �̳е�ʱ�� �������к͸�����һ���ķ���������д�� ������û�и����г��ֹ��ķ����������ͱ��̳й����ˡ�
 * 
 * ��ӡ����� �� ��
 */
class A {
	public void show() {
		show2();
	}

	public void show2() {
		System.out.println("��");
	}
}

class B extends A {
	/*
	 * public void show() { show2(); } //����������Ȼ������ �����Ǳ��̳й����ˣ���ʵ�ʴ��ڵ�
	 */

	public void show2() {
		System.out.println("��");
	}
}

class C extends B {
	public void show() {
		super.show(); // super�����ʸ���show()��������B�е�show()����
	}

	public void show2() {
		System.out.println("��");
	}
}

public class DuoTaiDemo3 {
	public static void main(String[] args) {
		A a = new B();
		a.show(); // ����A��show()����������B��show()������д�ˣ����Դ�ӡ����show()�е�����,����show()�ǴӸ���
					// �м̳й����ģ���Ȼ����������ʵ�ʴ��ڣ����Կɿ�����show()����
		B b = new C();
		b.show(); // ����B��show2()����������C��show2()������д����˴�ӡC��show2()�е�����
	}
}
