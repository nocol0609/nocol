package com.spring.beanLife;

/**
 * bean���󣬳�ʼ�������ٷ������޷���ֵ���޲������Ǿ�̬��
 * @author Nocol
 *
 */
public class lifeCycleBean implements ProxyInterface {
	public lifeCycleBean() {
		// TODO Auto-generated constructor stub
		System.out.println("bean ����..........");
	}
	
	public void create(){
		System.out.println("bean ��ʼ��............");
	}
	
	public void destroy(){
		System.out.println("bean ����............");
	}

}
