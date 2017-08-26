package com.java;

/*
 * 题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 * 
 * 		互不相同、无重复数字
 * 
 */
public class Test03_1234 {
	public static void main(String[] args) {
		int count = 0;
		int num = 0;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == j) {
					continue;
				}
				for (int k = 1; k <= 5; k++) {
					if (k != i && k != j) {
						num = i * 100 + j * 10 + k;
						count++;
						System.out.println(num+" ");
					}
				}
			}
		}
		System.out.println("能组成"+count+"个数");
	}
}
