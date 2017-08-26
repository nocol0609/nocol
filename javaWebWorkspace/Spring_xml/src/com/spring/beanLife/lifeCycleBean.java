package com.spring.beanLife;

/**
 * bean对象，初始化和销毁方法（无返回值，无参数，非静态）
 * @author Nocol
 *
 */
public class lifeCycleBean implements ProxyInterface {
	public lifeCycleBean() {
		// TODO Auto-generated constructor stub
		System.out.println("bean 创建..........");
	}
	
	public void create(){
		System.out.println("bean 初始化............");
	}
	
	public void destroy(){
		System.out.println("bean 销毁............");
	}

}
