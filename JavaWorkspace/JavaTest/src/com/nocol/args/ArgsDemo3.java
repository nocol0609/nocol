package com.nocol.args;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * ��ʽ������
 *        ��������(̫�򵥣������ҽ���Ҫ�����) 
 *        �������� 
 *              ����:(���������ʱ����ʵ�����Ѿ�������)��Ҫ���Ǹ���Ķ���
 *              ������:��Ҫ���Ǹó����������Ķ��� 
 *              �ӿ�:��Ҫ���Ǹýӿڵ�ʵ����Ķ���
 */
// ����һ�����õĽӿ�
interface Love {
	public abstract void love();
}

class LoveDemo {
	public void method(Love l) {    //�ӿڵ�������
		                            // l; l = new Teacher(); Love l = new
									// Teacher(); ��̬
		l.love();
	}
}

// ���������ʵ�ֽӿ�
class Star implements Love {
	public void love() {
		System.out.println("���ǰ�ˣ����");
	}
}

class ArgsDemo {
	public static void main(String[] args) {
		
		// ������Ҫ����LoveDemo���е�love()����
		LoveDemo ld = new LoveDemo();
		Love l = new Star();
		ld.method(l);
	}
}