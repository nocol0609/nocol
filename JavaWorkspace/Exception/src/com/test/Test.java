package com.test;

public class Test {
	
	public static int divide(int a,int b) throws Exception{
		
		try {
			int c = a/b;
			return c;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}catch (Exception e) {
			// TODO: handle exception
			return 0;
		}finally {
			System.out.println("fanaly...");
		}
		//System.out.println("");
		
	}
	
	public static void main(String[] args) {
//		try {
//			divide(3, 0);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//			System.out.println(e.getCause());
//			e.printStackTrace();
//			//System.out.println("除数不能为0");
//		}
		
		
	}
}
