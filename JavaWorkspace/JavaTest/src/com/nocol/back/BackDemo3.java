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
 *                ��:���ص��Ǹ���Ķ��� 
 *                ������:���ص��Ǹó�������������
 *                �ӿ�:���ص��Ǹýӿڵ�ʵ����Ķ���
 */
// ����һ�����õĽӿ�
interface Love {
	public abstract void love();
}

class LoveDemo {
	public Love getLove() {
		// Love l = new Star();
		// return l;

		return new Star();
	}
}

// ���������ʵ�ֽӿ�
class Star implements Love {
	public void love() {
		System.out.println("���ǰ�ˣ����");
	}
}

class BackDemo3 {
	public static void main(String[] args) {
		//����
		LoveDemo ld = new LoveDemo();
		//ԭ������ ld.getLove();���ɣ������з���ֵ�����ýӿ�Love�Ķ���l���գ�ʵ��Ϊ��ʵ����Ķ���
		Love l = ld.getLove(); // new Star(); Love l = new Star(); //��̬
		l.love();
	}
}
