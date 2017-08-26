package com.test_09;

public class TestException {

	public void SystemOut(String[] s) {
		
		for (int index = 0; index < s.length; index++) {
			if (index >2) {
				throw new ArrayIndexOutOfBoundsException("数组索引越界");
			} else {
				System.out.println(s[index]);
			}
		}
	}

	public static void main(String[] args) {
		
		args=new String[10];
		
		TestException te=new TestException();
		te.SystemOut(args);
		
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
	}
}
