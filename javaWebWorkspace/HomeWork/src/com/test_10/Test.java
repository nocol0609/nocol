package com.test_10;

public class Test {
	public static void main(String[] args) {
		
		Storage s=new Storage();
		
		SetStorage set=new SetStorage(s);
		getStorage get=new getStorage(s);
		
		Thread t1=new Thread(set);
		Thread t2=new Thread(get);
		
		t1.start();
		t2.start();
		
	}
}
