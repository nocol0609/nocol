package com.nocol_inter;
/**
* @author lxp
*
* @TODO 
* 
*/
//ʵ������ʵ�ֽӿڵ�ʱ��
//��һ��������Ѿ�֪������ʲô���͵���

//public class InterImpl implements Inter<String> {  //�Ѿ�֪����String����
//
//	@Override
//	public void show(String t) {
//		System.out.println(t);
//	}
//}

//�ڶ������������֪����ʲô���͵�
public class InterImpl<T> implements Inter<T> {

	@Override
	public void show(T t) {
		System.out.println(t);
	}
}