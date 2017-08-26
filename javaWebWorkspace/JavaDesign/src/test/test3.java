package test;

import org.junit.Test;

public class test3 {
	
	@Test
	public void test1(){
		
		int a=3;
		int b=4;
		
		int c=a++;
		int d=b--;
		
		//4 3 3 4
		
		System.out.println("a:"+a+" b:"+b+" c:"+c+" d:"+d);
		
		int x=4;
		
		System.out.println((x++)+(++x)+(x*10));
		                    
	}
	
}
