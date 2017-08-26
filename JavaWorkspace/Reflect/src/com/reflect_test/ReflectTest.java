package com.reflect_test;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 我给你ArrayList<Integer>的一个对象，我想在这个集合中添加一个字符串数据，如何实现呢？
 * 
 * 		用以前学过的不能实现，因为该泛型指定是Integer类型，传字符串类型时编译就会报错
 * 
 */
public class ReflectTest {
	public static void main(String[] args) throws Exception  {
		//创建集合
		ArrayList<Integer> array=new ArrayList<Integer>();
		
		//获取class文件对象(已经知道类对象是array，所以不用再通过c获取类对象)
		Class c=array.getClass();
		
		//获取方法对象
        //Method m=c.getMethod("add", String.class);  //错误
		//ArrayList的add()方法中，底层就是默认添加Object类型add(E e),泛型只是为了给编译看的，但是运行还是看class文件
		Method m=c.getMethod("add", Object.class);
		m.invoke(array, "hello"); //字符型
		m.invoke(array, "100");//整型
		m.invoke(array, 13.14f);//浮点型
       //利用反射可向集合添加各种类型数据，并不局限于它所指定的类型
		System.out.println(array);
	}
}
