package com.nocol.test1;

import java.util.Scanner;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
public class CurrentTimeDemo {
	static long start;
	static long end;

	public static void main(String[] args) {
		 start = System.currentTimeMillis();
		ScannerTest();
		 end = System.currentTimeMillis();
		 System.out.println("����ʱ:"+(end-start)/1000+"��");
	}

	private static void ScannerTest() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���Դ�����a-z:");
		String ch = sc.nextLine();
//		while(ch.equals("z")) {
//			//System.out.println("����ʱ:" + (end - start) + "��");
//			break;
//		}
	}
}