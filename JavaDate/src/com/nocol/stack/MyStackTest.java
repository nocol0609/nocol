package com.nocol.stack;

/**
 * �����Զ���ջ
 * 
 * @author Nocol ����6:15:40
 */
public class MyStackTest {
	public static void main(String[] args) {

		MyStack stack = new MyStack(4);

		stack.push(12);
		stack.push(3);
		stack.push(21);
		stack.push(15);

		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
		
		//System.out.println(stack.peek());
		//System.out.println(stack.peek());
		
		while(!stack.isEmpty()){
			System.out.print(stack.pop()+" ");
		}
		
		System.out.println(" ");
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
	}
}
