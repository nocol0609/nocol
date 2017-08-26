package com.nocol.test1;
/**
* @author lxp
*
* @TODO 
* 
*/
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args){
		//被猜的数
		int number=(int)(Math.random()*100)+1;
		
		while(true){
			//猜的数
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入你要猜的数：");
			int guessnumber=sc.nextInt();
			//逻辑判断
			if(guessnumber>number){
				System.out.println("你猜的数"+guessnumber+"大了");
			}else if(guessnumber<number){
				System.out.println("你猜的数"+guessnumber+"小了");
			}else{
				System.out.println("恭喜你猜中了");
			}
		}	
	}
}
