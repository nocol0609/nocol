package com.nocol_05;

import java.util.Scanner;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * �Զ����쳣������
 */
public class StudentDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ���ɼ���");
		int score = sc.nextInt();

		Teacher t = new Teacher();
		try {
			t.check(score);
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
}
