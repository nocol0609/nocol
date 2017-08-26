package com.nocol.array;

/**
 * 测试自定义有序数组
 *	
 * @author Nocol 下午2:45:30
 */
public class OrderArrayTest {
	public static void main(String[] args) {
		OrderArray orderArray=new OrderArray(10);  //给定数组初始化长度为10
		
		orderArray.insert(32);
		orderArray.insert(12);
		orderArray.insert(38);
		orderArray.insert(18);
		
		orderArray.display();   //与插入的顺序无关，插入时即时有序插入
		
		System.out.println(orderArray.binarySearch(38));
	}
}
