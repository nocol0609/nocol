package com.error.inter;

/**
 * 测试byte
 * @author Nocol
 *
 */
public class byteTest {
	public static void main(String[] args) {
		
		
		byte b1=3,b2=4,b;
		
		//b=b1+b2;  //需要强转：b1+b2结果是int类型,若赋给byte类型b则爆错.需要强制类型转换   b=(byte)(b1+b2)
		
		b=3+4;  //不报错：两个常量相加，先计算，若在byte范围内则不报错
		
	    //byte b3=130;  //爆错,byte范围在-128 到127   ，130超出了byte访问，需要强制类型转换     byte b3=(byte)130;
		
		byte b3=(byte) 130;
		byte b4=(byte) 129;
		byte b5=(byte) 128;
		
		System.out.println(b3);  //-126
		System.out.println(b4);  //-127
		System.out.println(b5);  //-128
		
		/*
		分析过程：
			我们要想知道结果是什么，就应该知道是如何进行计算的。
			而我们又知道计算机中数据的运算都是补码进行的。
			而要得到补码，首先要计算出数据的二进制。
			
			A:获取130这个数据的二进制。
				00000000 00000000 00000000 10000010    (四个字节)
				这是130的原码，也是反码，还是补码。
			B:做截取操作，截成byte类型的了。 （byte b3=(byte) 130;）
				10000010 
				这个结果是补码。
			C:已知补码求原码。
						符号位		数值位
				补码：	1			0000010
				
				反码：	1			0000001    （在补码基础上减1）
				 
				原码：	1			1111110    （在反码基础上取反）
	*/

	}
}
