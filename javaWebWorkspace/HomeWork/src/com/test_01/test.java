package com.test_01;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����룺");
		String s = scanner.nextLine();

		String string = reverse(s);

		System.out.println(string);
		
		/*
		 * char[] ch = s.toCharArray(); 
		 * print(ch); 
		 * scanner.close();
		 */
	}

	private static String reverse(String s) {
		// TODO Auto-generated method stub

		if (s.length() <= 1 || s == null) {
			return s;
		} else {
			return reverse(s.substring(1) + s.charAt(0));
		}
	}

	private static void print(char[] ch) {
		// TODO Auto-generated method stub
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i] + "");
		}
	}
}
