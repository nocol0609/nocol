package com.nocol.test1;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * �̳еĴ�������
 * 
 * ���ڼ̳��з�����һ�����󣺷�����д�� ���ԣ�����Ĺ��ܣ��ͻᱻ��������ǵ���
 * ��Щʱ�����ǲ���������ȥ���ǵ�����Ĺ��ܣ�ֻ������ʹ�á�
 * ���ʱ��������������Java���ṩ��һ���ؼ��֣�final
 * 
 * final:���յ���˼���������������������࣬������������
 */
class Fu {
	public final void show() {
		System.out.println("�����Ǿ�����Դ,�κ��˶������޸�");
	}
}

class Zi extends Fu {
	// Zi�е�show()�޷�����Fu�е�show()
	//public void show() {
	//	System.out.println("����һ������");
	//}
}

class FinalDemo {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.show();
	}
}
