package com.nocol_01;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * �쳣����������˲������������
 *  
 * ������쳣��Throwable
 * 		�������⣺Error ���ǲ�������������һ�㶼�Ǻ����صģ�����˵�ڴ������
 * 		���⣺Exception
 * 			����������:����RuntimeException���쳣
 *                // ������д���ģ���Ϊ�㲻��������Ͳ���ͨ����
 * 			����������:RuntimeException	
 *  //������������Ҳ��������Ϊ��������⣬�������������ֿ϶������ǵĴ��벻���Ͻ�����Ҫ��������ġ�
 * 
 * ��γ�����������⣬����û�����κδ�������jvm������Ĭ�ϵĴ���
 * ���쳣�����ƣ�ԭ�򼰳��ֵ��������Ϣ����ڿ���̨��
 * ͬʱ���������14768944896  DTsSe4hc
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		//��һ�׶�
		int a = 10;
		// int b = 2;
		int b = 0;
		System.out.println(a / b);
		
		//�ڶ��׶�
		System.out.println("over");
	}
}