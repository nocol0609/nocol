package com.java;

import java.util.Date;

/*
 * super.getClass()方法调用
 */

public class super_getClass extends Date {

	public static void main(String[] args) {
		new super_getClass().test();
	}

	public void test() {
		// 返回super_getClass类名
		System.out.println(super.getClass().getName());// com.java.super_getClass(若无包名会直接打印类名)

		// 获取父类名称
		System.out.println(getClass().getSuperclass().getName());
		// java.util.Date
	}
}
