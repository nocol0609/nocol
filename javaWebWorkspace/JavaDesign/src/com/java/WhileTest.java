package com.java;

/**
 * 
 * @author Nocol
 *
 */
public class WhileTest {
	public static void main(String[] args) {
		/*int n=(int) (0.01*100);
		int count=0;
		while(n<8848*100){
			n=n*2;
			count++;
		}
		System.out.println("折叠"+count+"次后为"+n+"米 ");*/
		
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+j*i+" ");
			}
			System.out.println();
		}
		
	}
}
