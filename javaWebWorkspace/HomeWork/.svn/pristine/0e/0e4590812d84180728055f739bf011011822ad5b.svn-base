package com.test_12;

public class Test
{
	public static void main(String[] args) 
	{
		Storage data = new Storage();
		Thread count = new Counter(data);
		Thread print = new Printer(data);
		count.start();
		print.start();
	}
};