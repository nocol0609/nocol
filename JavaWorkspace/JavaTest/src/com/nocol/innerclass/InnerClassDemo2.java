package com.nocol.innerclass;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 *
 *   	  ��Աλ��:�ڳ�Աλ�ö�����࣬����Ϊ��Ա�ڲ��ࡣ(�ڲ��౻private����)
 *            
 *    ע����Ա�ڲ��� ���Կ������ⲿ���һ�� ��Ա���� �������ⲿ��ķ����������ֱ�����ڲ��ഴ�������ʹ�ã�
 *       ��ʹ�ڲ�����private����ͬ�����ԡ�      
 * 
 */
class Outer1 {
	private int num = 200;

	 private class Inner {         //�ڲ��౻Private����
		public void show() {
			System.out.println(num);//�ڲ���ֱ�ӷ����ⲿ��˽�г�Ա
		}
	}

	public void method() {
		// �Ҳ�������
		// show();

		Inner i = new Inner();     //�����ڲ�����󣬲���ʱ��ͨ�������ⲿ��Outer�������method()�����Ӷ�
		                           //ʵ�ֶ��ڲ����ж���ķ����ĵ���
		i.show();
	}

}

class InnerClassDemo2 {
	public static void main(String[] args) {
      //����
	  //���󣺷���Inner���show()����
		Outer1 o=new Outer1();
		o.method();   //��ӡ10
	}
}