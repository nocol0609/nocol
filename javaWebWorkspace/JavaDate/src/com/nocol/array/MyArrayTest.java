package com.nocol.array;

/**
 * 测试自定义封装数组
 * 
 * @author Nocol 下午1:24:52
 */
public class MyArrayTest {
	public static void main(String[] args) {
		MyArray array = new MyArray(10);  //给定长度为10
		array.insert(13);
		array.insert(7);
		array.insert(17);

		array.display();

		System.out.println(array.search(7));
		System.out.println(array.get(2));

		// array.delete(0);
		// array.display();

		array.change(1, 14);
		array.display();
	}
}
