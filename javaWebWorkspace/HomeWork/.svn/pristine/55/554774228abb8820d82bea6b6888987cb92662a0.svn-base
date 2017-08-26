package com.test_collection_08;

import java.util.ArrayList;
import java.util.List;

public class BookManagerImpl implements IBookManageer {

	private List<Book> list;
	private Book book;

	public BookManagerImpl() {
		// TODO Auto-generated constructor stub
		list = new ArrayList<Book>();
	}

	// 增加
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		list.add(book);
	}

	// 删除
	@Override
	public void deleteBook(int id) {
		// TODO Auto-generated method stub
		Book book = findBookById(id);
		if (book != null) {
			list.remove(book);
		}else {
			System.out.println("要删除的书不存在");
		}
	}

	// 修改
	@Override
	public void updateBook(int id, Book book) {
		// TODO Auto-generated method stub
		// 根据id找到要修改的书名
		Book oldBook = findBookById(id);
		if (oldBook != null) {
			oldBook.setId(book.getId());
			oldBook.setName(book.getName());
			oldBook.setPrice(book.getPrice());
		}else {
			System.out.println("要修改的书不存在");
		}
	}
	// 查询所有图书
	@Override
	public List<Book> findAllBook() {
		// TODO Auto-generated method stub
		return list;
	}

	// 根据id查询图书
	@Override
	public Book findBookById(int id) {
		// TODO Auto-generated method stub
		for (Book book : list) {
			if (book.getId() == id) {
				return book;
			} else {
				return null;
			}
		}
		return book;
	}

}
