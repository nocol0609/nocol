package com.nocol_01;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * �ַ����������ɶ���ַ���ɵ�һ�����ݡ�Ҳ���Կ�����һ���ַ����顣
 * ͨ���鿴API�����ǿ���֪��
 * 		A:�ַ�������ֵ"abc"Ҳ���Կ�����һ���ַ�������
 * 		B:�ַ����ǳ�����һ������ֵ���Ͳ��ܱ��ı䡣
 * 
 * ���췽����
 * 		public String():�չ���
 *		public String(byte[] bytes):���ֽ�����ת���ַ���
 *		public String(byte[] bytes,int index,int length):���ֽ������һ����ת���ַ���
 *		public String(char[] value):���ַ�����ת���ַ���
 *		public String(char[] value,int index,int count):���ַ������һ����ת���ַ���
 *		public String(String original):���ַ�������ֵת���ַ���
 *
 * �ַ����ķ�����
 * 		public int length()�����ش��ַ����ĳ��ȡ�
 */
public class StringMethod {
	public static void main(String[] args) {
		//public String():�չ���
		String s1=new String();
		System.out.println("s1:"+s1);  //δ��ʼ������ӡ��
		System.out.println("---------------------");
		
		//public String(byte[] bytes):���ֽ�����ת���ַ���
		 byte[] bys={97,98,99,100,101};
		 String s2=new String(bys);
		 System.out.println("s2:"+s2);
		 System.out.println("-----------------------");
		 
		 //public String(byte[] bytes,int index,int length):���ֽ������һ����ת���ַ���
		 byte[] bys1={97,98,99,100,101,102};
		 String s3=new String(bys1,4,2);
		 System.out.println("s3:"+s3);
		 System.out.println("-------------------------");
		 
		 //public String(char[] value):���ַ�����ת���ַ���
		char[] ch={'a','b','c','d','��','˧','��'};
		String s4=new String(ch);
		System.out.println("s4:"+s4);
		System.out.println("--------------------------");
		
		//public String(char[] value,int index,int count):���ַ������һ����ת���ַ���
		char[] ch1={'a','b','c','d','��','��','˧','��'};
		String s5=new String(ch1,4,4);
		System.out.println("s5:"+s5);
		System.out.println("--------------------------");
		
		//public String(String original):���ַ�������ֵת���ַ���
		String s6 = new String("abcde");
		System.out.println("s6:" + s6);
		System.out.println("s6.length():" + s6.length());
		System.out.println("--------------------------");
				
		//�ַ�������ֵ"abc"Ҳ���Կ�����һ���ַ�������
		String s7 = "abcde";
		System.out.println("s7:"+s7);
		System.out.println("s7.length():"+s7.length());
	}

}
