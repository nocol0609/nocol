package com.nocol.pojo;

import java.util.List;
import java.util.Map;

public interface BookMapper {

	void addBook(Book book);// 添加书籍 //书籍的名称不能重复

	void removeBook(Integer id);// 删除书籍//id值不存在则不能删除

	Book findBookByName(String bookName);// 查找书籍//通过名字

	Book findBookById(Integer id);// 查找书籍//通过id

	List<Book> findAllBooks();// 查找所有书籍

	List<String> findAllBooksName();// 查找所有书籍的名字

	int findCountOfBook();// 查找一共有多少本书籍

	void updateBook(Book book);// 修改书籍//通过id确定修改的是那本书

	List<Map<String, Object>> findBookNameAndAuthor();// 查询所有书籍的名字和对应的作者
}
