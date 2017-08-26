package com.error.inter;
/*
	位运算符：
		&,|,^,~
		<<,>>,>>>
		
	注意：
		要做位运算，首先要把数据转换为二进制。
*/
class OperatorDemo {
	public static void main(String[] args) {
		//&,|,^,~
		
		int a = 3;
		int b = 4;
		
		System.out.println(3 & 4);  //0
		System.out.println(3 | 4);  //7
		System.out.println(3 ^ 4);  //7
		System.out.println(3^4^4);  //3    对同一个数据异或两次结果不变
		System.out.println(~3);     //-4
	}
}
/*
	分析：因为是位运算，所以我们必须先把数据换算成二进制。
	
	3的二进制：11
		00000000 00000000 00000000 00000011
	4的二进制：100
		00000000 00000000 00000000 00000100
	
	&位与运算：有0 则 0。
		00000000 00000000 00000000 00000011
	   &00000000 00000000 00000000 00000100
		-----------------------------------
		00000000 00000000 00000000 00000000
		结果是：0
		
	|位或运算：有 1 则 1。
		00000000 00000000 00000000 00000011
	   |00000000 00000000 00000000 00000100
		-----------------------------------
		00000000 00000000 00000000 00000111
		结果是：7
		
	^位异或运算：相同则 0，不同则 1。
		00000000 00000000 00000000 00000011
	   &00000000 00000000 00000000 00000100
		-----------------------------------
		00000000 00000000 00000000 00000111
		结果是：7
		
	~按位取反运算符：0 变 1，1 变 0
		00000000 00000000 00000000 00000011
	   ~11111111 11111111 11111111 11111100 (补码)
	   
	   补码：11111111 11111111 11111111 11111100
	   反码：11111111 11111111 11111111 11111011
	   原码：10000000 00000000 00000000 00000100
		结果是：-4
*/