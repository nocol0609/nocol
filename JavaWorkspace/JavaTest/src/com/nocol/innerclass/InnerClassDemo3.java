package com.nocol.innerclass;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 成员内部类的修饰符：
 *      private 为了保证数据的安全性
 *	    static 为了方便访问数据
 *		注意：静态内部类访问的 外部类数据必须用静态修饰。
 *			
 *	          成员内部类（被静态修饰符static修饰符修饰）：如何直接访问内部类的成员？
 * 	          格式：外部类名.内部类名 对象名 = new 外部类名.内部类名();
 */
class Outer3{
    //private  int num=300;     //非静态
      private static int num2=400;   //静态
      
    //内部类用静态修饰是因为内部类可以看出是外部类的成员
      public static class Inner{
    	  public void show(){
    		 // System.out.println(num); 报错， 静态内部类访问的 外部类成员变量必须是static静态修饰的。
    		  System.out.println(num2);  
    	  }
    	  
    	  public static void show2(){
    		 //System.out.println(num); 报错
    		  System.out.println(num2);//静态方法访问静态成员变量
    	  }
      }
}

public class InnerClassDemo3 {
	public static void main(String[] args){
		        //使用内部类
				//Outer.Inner oi = new Outer().new Inner();  报错，限定的新静态类
				//oi.show();
				//oi.show2();
				
				//成员内部类被静态修饰后的访问方式是:
				//格式：外部类名.内部类名 对象名 = new 外部类名.内部类名();
		
				Outer3.Inner oi = new Outer3.Inner();
				oi.show();   //400
				oi.show2();  //400   //Inner.show2();
				
				//show2()的另一种调用方式
				//由于内部类被static静态修饰，可直接【类名.方法名调用】
				Outer3.Inner.show2(); //外部类Outer3下的Inner内部类
		
	}
}
