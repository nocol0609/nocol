package com.template;
/**
* @author lxp
*
* @TODO 
* 
*/
public class TemplateDemo {
	public static void main(String[] args) {
		//ѧ��
		System.out.println("ѧ��ȥѧУ�ϿΣ�"+"\r");
		Student student=new Student();
		student.goToSchool();
		System.out.println("----------------");
		
		//��ʦ
		System.out.println("��ʦȥѧУ�ϿΣ�"+"\r");
		Teacher teacher=new Teacher();
		teacher.goToSchool();
	}
}
