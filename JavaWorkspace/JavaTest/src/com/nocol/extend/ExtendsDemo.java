package com.nocol.extend;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * java�м̳е��ص�
 * 1��ֻ֧�ֵ��̳У���֧�ֶ�̳�
 * 2��֧�ֶ��̳�
 * 
 */
class GrandFather{
	public void show() {
		System.out.println("�����游��");
	}
}

class Father extends GrandFather{
	public void method(){
		System.out.println("���Ǹ���");
	}
}

class Son extends Father{}
	
public class ExtendsDemo {
	public static void main(String[] args){
		Son s=new Son();
		s.show();
		s.method();
	}
}
