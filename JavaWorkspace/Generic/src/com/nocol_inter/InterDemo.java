package com.nocol_inter;
/**
* @author lxp
*
* @TODO 
* 
*/
public class InterDemo {
	public static void main(String[] args) {
		// ��һ������Ĳ���
		// Inter<String> i = new InterImpl();
		// i.show("hello");

		// // �ڶ�������Ĳ���,Ҫʲô���;͸�ʲô����
		Inter<String> i = new InterImpl<String>();
		i.show("hello");

		Inter<Integer> ii = new InterImpl<Integer>();
		ii.show(100);
	}
}
