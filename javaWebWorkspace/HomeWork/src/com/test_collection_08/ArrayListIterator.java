package com.test_collection_08;

import java.util.NoSuchElementException;

public class ArrayListIterator implements Iterator<String>{
	
	private int current = 0;
	private ArrayList<String> list;
	private int size;// 数组大小
	private Object[] items;
	
	public ArrayListIterator(Object[] items, ArrayList<String> list, int size) {
		// TODO Auto-generated constructor stub
		this.list=list;
		this.items=items;
		this.size=size;
	}
	
	@Override
	public boolean hasNext() {
		
		// TODO Auto-generated method stub
		return current<size;
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		 if(!hasNext()){
             throw new NoSuchElementException();
         }
         return (String)items[current++];
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		list.remove(--current);
	}

}
