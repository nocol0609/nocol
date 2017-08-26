package com.nocol_02;
/**
* @author lxp
*
* @TODO 
* 
*/
/*面试题一：
 * 
 * String s = new String(“hello”) 和 String s = “hello”;的区别?
 * 有。前者会创建2个对象（堆内存一个，方法区一个），后者创建1个对象（方法区）。
 * 
 * ==:比较引用类型比较的是地址值是否相同，比较基本类型时比较的是值是否相同
 * 
 * equals:比较引用类型默认也是比较地址值是否相同，而String类重写了equals()方法，比较的是内容是否相同。
 */
public class StringTest {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";

		System.out.println(s1 == s2);// false
		System.out.println(s1.equals(s2));// true
	}
}
