package com.nocol.array;

/**
 * �����Զ����װ����
 * 
 * @author Nocol ����1:24:52
 */
public class MyArrayTest {
	public static void main(String[] args) {
		MyArray array = new MyArray(10);  //��������Ϊ10
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
