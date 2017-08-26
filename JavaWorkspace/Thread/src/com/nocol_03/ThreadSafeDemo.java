package com.nocol_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

/**
* @author lxp
*
* @TODO 
* 
*/
public class ThreadSafeDemo {
	public static void main(String[] args) {
		// 线程安全的类
		StringBuffer sb = new StringBuffer();
		Vector<String> v = new Vector<String>();
		Hashtable<String, String> h = new Hashtable<String, String>();

		// Vector是线程安全的时候才去考虑使用的，但是我还说过即使要安全，我也不用你
		// 那么到底用谁呢?
		// public static <T> List<T> synchronizedList(List<T> list)
		List<String> list1 = new ArrayList<String>();// 线程不安全的list集合
		List<String> list2 = Collections.synchronizedList(new ArrayList<String>()); // 线程安全的List集合
	}
}
