package com.spring.aspectJ_xml;

/**
 * Ä¿±êÀà
 * 
 * @author Nocol
 *
 */
public class UserService {
	public int add() {
		System.out.println("add....");
		return 1;
	}

	public void delete() {
		System.out.println("delete....");
		int a=10/0;
	}

	public void update() {
		System.out.println("update....");
	}
}
