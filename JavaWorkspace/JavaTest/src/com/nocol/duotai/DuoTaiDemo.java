package com.nocol.duotai;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
��̬��ͬһ������(����)���ڲ�ͬʱ�����ֳ����Ĳ�ͬ״̬��
������
	è��è��è�Ƕ��
	ˮ(Һ�壬���壬��̬)��
	
��̬��ǰ�᣺
	A:Ҫ�м̳й�ϵ��
	B:Ҫ�з�����д��
		��ʵû��Ҳ�ǿ��Եģ��������û�������û�����塣
			���� d = new è();
			d.show();
			���� d = new ��();
			d.show();
	C:Ҫ�и�������ָ���������
		�� f =  new ��();
		
�ô�������һ�¶�̬��

��̬�еĳ�Ա�����ص㣺
	A:��Ա����
		���뿴��ߣ����п���ߡ�(��Ա�������ᱻ����д���������л����õ���Fu��ĳ�Ա����)
	B:���췽��
		������������ʱ�򣬷��ʸ���Ĺ��췽�����Ը�������ݽ��г�ʼ����
	C:��Ա����
		���뿴��ߣ����п��ұߡ�(Fu�෽����Zi����д����������ʱ�õ��Ǳ�Zi����д��ķ���)
	D:��̬����
		���뿴��ߣ����п���ߡ�(��̬������أ��㲻����д�����ԣ����ʻ�����ߵ�)
		
*/
class Fu {
	public int num = 100;

	public void show() {
		System.out.println("show Fu");
	}
	
	public static void function() {
		System.out.println("function Fu");
	}
}

class Zi extends Fu {
	public int num = 1000;
	public int num2 = 200;

	public void show() {
		System.out.println("show Zi");
	}
	
	public void method() {
		System.out.println("method zi");
	}
	
	public static void function() {
		System.out.println("function Zi");
	}
}

class DuoTaiDemo {
	public static void main(String[] args) {
		//Ҫ�и�������ָ���������
		//�� f =  new ��();
		
		Fu f = new Zi();
		System.out.println(f.num);
		
		//�Ҳ�������,��ΪFu��û��num2�����Ա����(���뿴��ߣ�����Fu��)
		//System.out.println(f.num2);
		
		f.show();
		
		//�Ҳ������ţ���ΪFu��û��method()����(���뿴��ߣ�����Fu��)
		//f.method();
		
		f.function();
	}
}