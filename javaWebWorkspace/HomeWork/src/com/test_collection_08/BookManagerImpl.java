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

	// ����
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		list.add(book);
	}

	// ɾ��
	@Override
	public void deleteBook(int id) {
		// TODO Auto-generated method stub
		Book book = findBookById(id);
		if (book != null) {
			list.remove(book);
		}else {
			System.out.println("Ҫɾ�����鲻����");
		}
	}

	// �޸�
	@Override
	public void updateBook(int id, Book book) {
		// TODO Auto-generated method stub
		// ����id�ҵ�Ҫ�޸ĵ�����
		Book oldBook = findBookById(id);
		if (oldBook != null) {
			oldBook.setId(book.getId());
			oldBook.setName(book.getName());
			oldBook.setPrice(book.getPrice());
		}else {
			System.out.println("Ҫ�޸ĵ��鲻����");
		}
	}
	// ��ѯ����ͼ��
	@Override
	public List<Book> findAllBook() {
		// TODO Auto-generated method stub
		return list;
	}

	// ����id��ѯͼ��
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
