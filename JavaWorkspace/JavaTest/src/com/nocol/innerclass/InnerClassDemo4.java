package com.nocol.innerclass;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * �ֲ��ڲ��� 
 *        A:����ֱ�ӷ����ⲿ��ĳ�Ա 
 *        B:�ھֲ�λ�ã����Դ����ڲ������ͨ����������ڲ��෽������ʹ�þֲ��ڲ��๦��
 * 
 *    �����⣺ 
 *          �ֲ��ڲ�����ʾֲ�������ע������? 
 *          A:�ֲ��ڲ�����ʵľֲ�����������final����
 *          B:Ϊʲô��?
 *         �ֲ����������ŷ����ĵ��ö����ã����ŵ�����϶���ʧ�� �����ڴ�����ݲ�����������ʧ�����ԣ����Ǽ�final���Ρ�
 *         ����final���κ���������ͳ��˳�������Ȼ�ǳ���������ʧ�ˡ� �����ڴ��д洢��������20�����ԣ��һ�����������ʹ�á�
 */
class Outer4 {
	
	private int num = 10;
   
	public void method() {
		// int num = 20;             
	    final int num2 = 20;         //��Ҫ���ֲ��ڲ�����ʣ��þֲ��ڲ���ľֲ�����������final����
	    
		class Inner {                //�ֲ��ڲ���
			public void show() {
				System.out.println(num);    //���ʵ� ��Ա���� ����Ҫ��final����
				
				System.out.println(num2);  //20 //���ڲ����з��ʱ��ر���(�ֲ�����)num2; ��Ҫ������Ϊ��������
			}
		}
		
		Inner i = new Inner();   //�ھֲ��ڲ����ⴴ������󣬷���ʵ�ֶ��ڲ����ڷ����ĵ���
		i.show();
	}
}

class InnerClassDemo4 {
	public static void main(String[] args) {
		Outer4 o = new Outer4();
		o.method();
	}
}
