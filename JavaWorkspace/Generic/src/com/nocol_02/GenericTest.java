package com.nocol_02;

import java.util.ArrayList;
import java.util.Iterator;



/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 泛型在哪些地方使用呢?
 * 		看API，如果类，接口，抽象类后面跟的有<E>就说要使用泛型。一般来说就是在集合中使用。
 */
public class GenericTest {
	public static void main(String[] args) {
		//创建集合对象
		ArrayList<String> array=new ArrayList<String>();
		//添加元素
		array.add("hello");
		array.add("world");
		array.add("java");
		//遍历集合
		//方式一
		Iterator<String> it=array.iterator();
		while(it.hasNext()){
			String s=it.next();
			System.out.println(s);
		}
		System.out.println("---------------");
		//方式二
		for(int x=0;x<array.size();x++){
			String s2=array.get(x);
			System.out.println(s2);
		}
	}
}
