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
		//���µ���
		int number=(int)(Math.random()*100)+1;
		
		while(true){
			//�µ���
			Scanner sc=new Scanner(System.in);
			System.out.println("��������Ҫ�µ�����");
			int guessnumber=sc.nextInt();
			//�߼��ж�
			if(guessnumber>number){
				System.out.println("��µ���"+guessnumber+"����");
			}else if(guessnumber<number){
				System.out.println("��µ���"+guessnumber+"С��");
			}else{
				System.out.println("��ϲ�������");
			}
		}	
	}
}
