package com.nocol_01;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 异常：程序出现了不正常的情况。
 *  
 * 程序的异常：Throwable
 * 		严重问题：Error 我们不处理。这种问题一般都是很严重的，比如说内存溢出。
 * 		问题：Exception
 * 			编译期问题:不是RuntimeException的异常
 *                // 必须进行处理的，因为你不处理，编译就不能通过。
 * 			运行期问题:RuntimeException	
 *  //这种问题我们也不处理，因为是你的问题，而且这个问题出现肯定是我们的代码不够严谨，需要修正代码的。
 * 
 * 如何程序出现了问题，我们没有做任何处理，最终jvm会做出默认的处理。
 * 把异常的名称，原因及出现的问题等信息输出在控制台。
 * 同时会结束程序。14768944896  DTsSe4hc
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		//第一阶段
		int a = 10;
		// int b = 2;
		int b = 0;
		System.out.println(a / b);
		
		//第二阶段
		System.out.println("over");
	}
}