package com.nocol.test1;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 静态代码块、构造代码块和构造方法的执行顺序？
 * 
 * 静态代码块-->构造代码块-->构造方法    (***静态代码块只执行一次***)
 * 
 * 大帅比-->大帅比nocol-->静态代码块-->构造代码块-->构造方法-->构造代码块-->构造方法
 * (先加载class CodeDemo到内存，此时不用调方法，执行静态代码块，再执行main方法)
 */
class Code{
	static{
		System.out.println("静态代码块");
	}
	
	{
		System.out.println("构造代码块");
	}
	
	public Code(){
		System.out.println("构造方法");
	}
}
public class CodeDemo {
	static{
		System.out.println("大帅比");
	}
	public static void main(String[] args){
		
		System.out.println("大帅比nocol");
		
		Code c1=new Code();
		Code c2=new Code();
		
	}
}
