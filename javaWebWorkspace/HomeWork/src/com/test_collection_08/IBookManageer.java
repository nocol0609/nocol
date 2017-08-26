package com.test_collection_08;

import java.util.List;

public interface IBookManageer {
	void addBook(Book book);
	void deleteBook(int id);
	void updateBook(int id,Book book);
	List<Book> findAllBook();
	Book findBookById(int id);
	
}
