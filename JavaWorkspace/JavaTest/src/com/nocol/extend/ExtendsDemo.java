package com.nocol.extend;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * java中继承的特点
 * 1、只支持单继承，不支持多继承
 * 2、支持多层继承
 * 
 */
class GrandFather{
	public void show() {
		System.out.println("我是祖父类");
	}
}

class Father extends GrandFather{
	public void method(){
		System.out.println("我是父类");
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
