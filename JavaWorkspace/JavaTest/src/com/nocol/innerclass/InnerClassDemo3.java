package com.nocol.innerclass;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * ��Ա�ڲ�������η���
 *      private Ϊ�˱�֤���ݵİ�ȫ��
 *	    static Ϊ�˷����������
 *		ע�⣺��̬�ڲ�����ʵ� �ⲿ�����ݱ����þ�̬���Ρ�
 *			
 *	          ��Ա�ڲ��ࣨ����̬���η�static���η����Σ������ֱ�ӷ����ڲ���ĳ�Ա��
 * 	          ��ʽ���ⲿ����.�ڲ����� ������ = new �ⲿ����.�ڲ�����();
 */
class Outer3{
    //private  int num=300;     //�Ǿ�̬
      private static int num2=400;   //��̬
      
    //�ڲ����þ�̬��������Ϊ�ڲ�����Կ������ⲿ��ĳ�Ա
      public static class Inner{
    	  public void show(){
    		 // System.out.println(num); ���� ��̬�ڲ�����ʵ� �ⲿ���Ա����������static��̬���εġ�
    		  System.out.println(num2);  
    	  }
    	  
    	  public static void show2(){
    		 //System.out.println(num); ����
    		  System.out.println(num2);//��̬�������ʾ�̬��Ա����
    	  }
      }
}

public class InnerClassDemo3 {
	public static void main(String[] args){
		        //ʹ���ڲ���
				//Outer.Inner oi = new Outer().new Inner();  �����޶����¾�̬��
				//oi.show();
				//oi.show2();
				
				//��Ա�ڲ��౻��̬���κ�ķ��ʷ�ʽ��:
				//��ʽ���ⲿ����.�ڲ����� ������ = new �ⲿ����.�ڲ�����();
		
				Outer3.Inner oi = new Outer3.Inner();
				oi.show();   //400
				oi.show2();  //400   //Inner.show2();
				
				//show2()����һ�ֵ��÷�ʽ
				//�����ڲ��౻static��̬���Σ���ֱ�ӡ�����.���������á�
				Outer3.Inner.show2(); //�ⲿ��Outer3�µ�Inner�ڲ���
		
	}
}
