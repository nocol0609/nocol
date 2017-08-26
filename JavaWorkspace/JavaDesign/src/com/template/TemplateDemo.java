package com.template;
/**
* @author lxp
*
* @TODO 
* 
*/
public class TemplateDemo {
	public static void main(String[] args) {
		//学生
		System.out.println("学生去学校上课："+"\r");
		Student student=new Student();
		student.goToSchool();
		System.out.println("----------------");
		
		//老师
		System.out.println("老师去学校上课："+"\r");
		Teacher teacher=new Teacher();
		teacher.goToSchool();
	}
}
