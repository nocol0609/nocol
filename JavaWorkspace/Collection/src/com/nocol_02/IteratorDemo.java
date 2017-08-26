package com.nocol_02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * Iterator iterator():迭代器，集合的专用遍历方式，Iterator接口下有以下两个抽象方法
 * 		Object next():获取元素,并移动到下一个位置。
 *      boolean hasNext():如果仍有元素可以迭代，则返回 true。
 *      
 * 		NoSuchElementException：没有这样的元素，因为你已经找到最后了。
 * 		   
 */
public class IteratorDemo {
	public static void main(String[] args) { 
		//创建集合对象
		Collection c=new ArrayList();
		//添加元素
		c.add("hello");
		c.add("world");
		c.add("java");
		//用集合专用的遍历方式遍历集合
		//Iterator iterator():迭代器，集合的专用遍历方式
		Iterator it=c.iterator();//Iterrator是一个接口，接口做返回值实际返回实现类对象
		
		//Object next():获取元素,并移动到下一个位置。
 //		Object obj=it.next();
//		System.out.println(obj);
		
		while(it.hasNext()){  //判断是否仍有元素
			//System.out.println(it.next());//此时还是Object类型
			//因此要转换成String类型，向下转型
			String str=(String)it.next();
			System.out.println(str);//此时集合元素为字符串类型
		} 
	}
}
