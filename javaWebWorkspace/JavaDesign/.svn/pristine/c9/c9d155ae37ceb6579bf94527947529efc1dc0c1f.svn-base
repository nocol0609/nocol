package com.error.inter;


class A{
	
	private int i=Integer.MAX_VALUE;   //int的最大取值范围就是i（2的32次方-1），加1之后就变成负数了
	
	public void test(){
		if(i+1<i){
			System.out.println("存在！");
		}
	}
}

public class intTest {
	public static void main(String[] args) {
		A a=new A();
		System.out.println(Integer.MAX_VALUE);   //2147483647
		System.out.println(Integer.MAX_VALUE+1); //-2147483648
		a.test();   //打印存在
		
		System.out.println("--------------------------------------");
		
		boolean b=(2.0-1.7==0.3);
		System.out.println(b);
		
		System.out.println(2.0-1.5);
		System.out.println(2.0-1.7);
		
		System.out.println("-------------------------------------");
		
		byte by=(byte) 128;
		System.out.println(by+1);
		
	}
}
