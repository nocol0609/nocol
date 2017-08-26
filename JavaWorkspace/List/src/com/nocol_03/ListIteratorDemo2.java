package com.nocol_03;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 问题?
 * 		我有一个集合，如下，请问，我想判断里面有没有"world"这个元素，如果有，我就添加一个"javaee"元素，请写代码实现。
 * 
 * ConcurrentModificationException:当方法检测到对象的并发修改，但不允许这种修改时，抛出此异常。 
 * 产生的原因：
 * 		迭代器是依赖于集合而存在的，在判断成功后，集合的中新添加了元素，而迭代器却不知道，所以就报错了，这个错叫并发修改异常。
 * 		其实这个问题描述的是：迭代器遍历元素的时候，通过集合是不能修改元素的。
 * 如何解决呢?
 * 		A:迭代器迭代元素，迭代器修改元素
 * 			元素是跟在刚才迭代的元素后面的。
 * 		B:集合遍历元素，集合修改元素(普通for)
 * 			元素在最后添加的。
 */
public class ListIteratorDemo2 {
	public static void main(String[] args) {
		//创建集合对象
		List list=new ArrayList();
		//添加于素
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//遍历集合元素
		// 迭代器遍历
		// Iterator it = list.iterator();
		// while (it.hasNext()) {
		// String s = (String) it.next();
		// if ("world".equals(s)) {
		// list.add("javaee");
		// }
		// }	
		
		// 方式1：迭代器迭代元素，迭代器修改元素
		// 而Iterator迭代器却没有添加功能，所以我们使用其子接口ListIterator
		
		/*ListIterator lis=list.listIterator();
		while(lis.hasNext()){
			String s1=(String)lis.next();
			if("world".equals(s1)){
				lis.add("javaee");
			}
		}*/
		
		//方式：普通for循环
		for(int x=0;x<list.size();x++){
			String s2=(String)list.get(x);
			if("world".equals(s2)){
				list.add("javaee");
			}
		}
			
		System.out.println(list);
	} 
}
