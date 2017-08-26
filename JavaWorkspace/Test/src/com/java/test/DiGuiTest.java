package com.java.test;

public class DiGuiTest {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += JieCheng(i);
		}
		System.out.println("1!+2!+3!+...10!=" + sum);
	}

	private static int JieCheng(int i) {
		if (i == 1) {
			return i;
		} else {
			return i * JieCheng(i - 1);
		}
	}
}
