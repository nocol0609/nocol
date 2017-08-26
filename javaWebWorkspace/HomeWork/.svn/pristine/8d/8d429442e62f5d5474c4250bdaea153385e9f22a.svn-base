package com.test_collection_08;

import java.util.List;

public class Test5 {
	public static void main(String[] args) {
		IBookManageer manageer=new 	BookManagerImpl();
		manageer.addBook(new Book(1,"java",30.0));
		manageer.addBook(new Book(2,"oracle",30.0));
		manageer.addBook(new Book(3,"mybatis",30.0));
		manageer.addBook(new Book(4,"xml",30.0));
		
//		Book book = manageer.findBookById(8);
//		System.out.println(book);
		
//		List<Book> list = manageer.findAllBook();
//		for (Book book1 : list) {
//			System.out.println(book1);
//		}
		
//		manageer.deleteBook(1);
		
//		List<Book> list2 = manageer.findAllBook();
//		for (Book book1 : list2) {
//			System.out.println(book1);
//		}
		
		manageer.updateBook(4, new Book(5,"jsp",40.0));
		
		List<Book> list2 = manageer.findAllBook();
		for (Book book1 : list2) {
			System.out.println(book1);
		}
		
	}
}
