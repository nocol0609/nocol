package com.nocol.extend;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
������д�����
	A:һ����ľ�̬�����,��������,���췽����ִ������
		��̬����� > �������� > ���췽��
	B:��̬��������������ļ��ض�����
		��̬���������ݻ�����ִ��
	C:�����ʼ��֮ǰ�Ȼ���и���ĳ�ʼ��
	
����ǣ�
	��̬�����Fu
	��̬�����Zi
	��������Fu
	���췽��Fu
	��������Zi
	���췽��Zi
*/
class Fu {
	static {
		System.out.println("��̬�����Fu");
	}

	{
		System.out.println("��������Fu");
	}

	public Fu() {
		System.out.println("���췽��Fu");
	}
}

class Zi extends Fu {
	static {
		System.out.println("��̬�����Zi");
	}

	{
		System.out.println("��������Zi");
	}

	public Zi() {
		System.out.println("���췽��Zi");
	}
}

class ExtendsDemo2 {
	public static void main(String[] args) {
		Zi z = new Zi();
	}
}
