package com.nocol.scanner;

import java.util.Scanner;

/**
* @author lxp
*
* @TODO 
* 
*/
/*Scanner类常用方法：
 * 
 * 基本格式：
 * 		public boolean hasNextXxx():判断是否是某种类型的元素
 * 		public Xxx nextXxx():获取该元素
 * 
 * 举例：用int类型的方法举例
 * 		public boolean hasNextInt()
 * 		public int nextInt()
 * 
 * 注意：
 * 		InputMismatchException：输入的和你想要的不匹配
 */
public class ScannerDemo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个整型数值：");
		//判断该数值是否为整型
		if(sc.hasNextInt()){
			//键盘获取该整型数值
			int a=sc.nextInt();
			System.out.println("输入的整型数值为："+a);
		}else{
			System.out.println("你输入的值不是整型");
		}
	}
}
