package com.template;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
public abstract class Person {
	//����
	public abstract void dressUp();
	//�����
	public abstract void eatBreakfast();
	//������
	public abstract void takeThing();

	// ����ģ�巽��(ȥѧУ)
	public void goToSchool() {
		dressUp();
		eatBreakfast();
		takeThing();
	}
}
