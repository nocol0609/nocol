package com.nocol.duotai;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * ��ͬ�ط���ʳ�Ļ���ͬ�İ���
 * ������ת�����⣺
		����ת�ͣ�
			Fu f = new Zi();
		����ת�ͣ�
			Zi z = (Zi)f; //Ҫ���f�������ܹ�ת��ΪZi�ġ�
 */
class Person {
	public void eat() {
		System.out.println("�Է�");
	}
}

class SouthPerson extends Person {
	public void eat() {
		System.out.println("����,���׷�");
	}

	public void jingShang() {
		System.out.println("����");
	}
}

class NorthPerson extends Person {
	public void eat() {
		System.out.println("����,����ͷ");
	}

	public void yanJiu() {
		System.out.println("�о�");
	}
}

class DuoTaiDemo2 {
	public static void main(String[] args) {
		// ����
		// �Ϸ���
		Person p = new SouthPerson();  //����ת�ͣ������������p����Ϊ �Ϸ��ˣ�SouthPerson��
		p.eat();   //SouthPerson�̳�person��������д����eat()����
		System.out.println("-------------");
		SouthPerson sp = (SouthPerson) p; //����ת�ͣ�����ԭ�Ϸ��ˣ�ʹ�������pӵ���������sp�ķ���Ȩ��
		sp.eat();
		sp.jingShang();
		System.out.println("-------------");

		// ������
		p = new NorthPerson();
		p.eat();
		System.out.println("-------------");
		NorthPerson np = (NorthPerson) p;
		np.eat();
		np.yanJiu();
	}
}