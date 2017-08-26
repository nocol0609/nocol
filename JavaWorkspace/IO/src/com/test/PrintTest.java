package com.test;

import java.io.PrintStream;

public class PrintTest {
	public static void main(String[] args) throws Exception {
//		PrintStream ps = System.out;
//		ps.println("");
		
		PrintStream ps1=new PrintStream("print");
		ps1.println("Tom");
		ps1.println(100);
		ps1.printf("");
	}
}
