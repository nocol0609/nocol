package com.test;

public class forTest {
	public static void main(String[] args) {
		int a=0;
		for(a++;a++<10;a++){
			//System.out.println(a);
			System.out.println(++a);
			System.out.println("------------------");
		}
		System.out.println("enda:"+a);
		
		for(a++;++a<20;a++){
			System.out.println(a++);
		}
		System.out.println("enda:"+a);
	}
}
