package com.nocol.extend;
/**
* @author lxp
*
* @TODO 
* 
*/
/*   
 * ���н����
 *   Father1() before show()
 *   Son.show(),result=0
 *   Father1() after show()
 *   Son1.Son1(),result=5
 *   
 *   ע�⣺�����ʼ�����ȷ��ʸ�����޲ι���
 */
class Father1{
	 void show(){
		System.out.println("Father1.show");
	}
	 Father1(){
		System.out.println("Father1() before show()");
		show();
		System.out.println("Father1() after show()");
	}
} 
class Son1 extends Father1{
	private int result=1;
	
	 Son1(int x){
		result=x;
		System.err.println("Son1.Son1(),result="+result);
	}
	 void show(){    //��д����show()����
		System.out.println("Son.show(),result="+result);
	}
}
public class Test {
	public static void main(String[] args) {
		new Son1(5);
	}
}
