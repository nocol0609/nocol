package com.test_collection_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 集合和数组的区别有哪些？
（1)数组是大小固定的，并且同一个数组只能存放类型一样的数据（基本类型/引用类型）
(2)JAVA集合可以存储和操作数目不固定的一组数据。 
(3)若程序时不知道究竟需要多少对象，需要在空间不足时自动扩增容量，则需要使用容器类库，array不适用。

举例说明集合和数组之间如何相互转换
 */
public class Test4 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		//将数组转换成集合
		List list = Arrays.asList(arr);
		//将集合转换成数组
		List<Integer> list2=new ArrayList<>();
		list2.add(1);
		list2.add(2);
		Object[] array = list2.toArray();
	}
}
