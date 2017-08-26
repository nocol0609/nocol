package com.nocol_02;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * StringBuffer的添加功能：
 * public StringBuffer append(String str):可以把任意类型数据添加到字符串缓冲区里面,并返回字符串缓冲区本身
 * 
 * public StringBuffer insert(int offset,String str):在指定位置把任意类型的数据插入到字符串缓冲区里面,
 *                                                    并返回字符串缓冲区本身
 *                                                    
 *      //注意：StringBuffer本身当做返回值，均返回其本身对象（字符缓冲区本身）
 *        怎么理解：
 *             如一个水杯往里面加水，每次加完水都返回水杯本身，后面可以在前面的基础上再加，直至加满。
 *                                                    （若水杯无线大即可无限次往水杯添加水，每次返回水杯本身）。                                         
 */
public class StringBufferAdd {
	public static void main(String[] args) {
		//创建字符缓冲区对象
		StringBuffer sb=new StringBuffer();
		
		// public StringBuffer append(String str)
		// StringBuffer sb2 = sb.append("hello");
		// System.out.println("sb:" + sb);
		// System.out.println("sb2:" + sb2);
		// System.out.println(sb == sb2); // true，即sb和sb2两对象的地址值相同

		// 一步一步的添加数据
		// sb.append("hello");
		// sb.append(true);
		// sb.append(12);
		// sb.append(34.56);
		//System.out.println(sb); //sb:hellotrue1234.56

		// 链式编程
		sb.append("hello").append(true).append(12).append(34.56);
		System.out.println("sb:" + sb);//sb:hellotrue1234.56
		
		// public StringBuffer insert(int offset,String
		// str):在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身
		sb.insert(5, "world");
		System.out.println("sb:" + sb);//sb:helloworldtrue1234.56
	}
}
