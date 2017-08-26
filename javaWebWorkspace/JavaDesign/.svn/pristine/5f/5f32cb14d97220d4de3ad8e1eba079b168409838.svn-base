package com.error.inter;
/*
	看程序写结果
*/
class SwitchTest {
	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		switch(x){
			default:    //先走case，没有匹配才走default，遇到break后退出
				y++;
				break;
			case 3:
				y++;
			case 4:
				y++;
		}
		System.out.println("y="+y);    //4
		System.out.println("---------------");
		
		int a = 2;
		int b = 3;
		switch(a){
			default:   //先匹配case，没有匹配再走default，若无break依次往下执行到末尾结束
				b++;
			case 3:
				b++;
			case 4:
				b++;
		}
		System.out.println("b="+b);   //6
	}
}