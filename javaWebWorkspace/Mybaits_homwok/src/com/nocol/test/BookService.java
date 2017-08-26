package com.nocol.test;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.nocol.pojo.Book;
import com.nocol.pojo.BookMapper;
import com.nocol.utils.MyBatisSqlSessionFactory;

public class BookService {
	@Test
	public void addBook() throws Exception {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		Book book = new Book(3, "oracle", "jack", new Date(), 30.0);
		mapper.addBook(book);
		session.commit();
	}

	@Test
	public void removeBook() throws Exception {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		BookMapper mapper = session.getMapper(BookMapper.class);

		mapper.removeBook(2);
		session.commit();
	}

	@Test
	public void findBookByName() throws Exception {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		BookMapper mapper = session.getMapper(BookMapper.class);

		Book book = mapper.findBookByName("mybatis");
		System.out.println(book);
	}

	@Test
	public void findBookById() throws Exception {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		BookMapper mapper = session.getMapper(BookMapper.class);

		mapper.findBookById(1);
	}

	@Test
	public void findAllBooks() throws Exception {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		BookMapper mapper = session.getMapper(BookMapper.class);

		List<Book> list = mapper.findAllBooks();
		for (Book book : list) {
			System.out.println(book);
		}
	}

	@Test
	public void findAllBooksName() throws Exception {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		BookMapper mapper = session.getMapper(BookMapper.class);

		List<String> list = mapper.findAllBooksName();
		for (String string : list) {
			System.out.println(string);
		}
	}

	@Test
	public void findCountOfBook() throws Exception {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		BookMapper mapper = session.getMapper(BookMapper.class);

		int countOfBook = mapper.findCountOfBook();
		System.out.println(countOfBook);
	}
	@Test
	public void updateBook() throws Exception {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		
		Book book = new Book(3, "corejava", "nocol", new Date(), 30.0);
		mapper.updateBook(book);
		session.commit();
	}
	
	@Test
	public void findBookNameAndAuthor() throws Exception {
		SqlSession session = MyBatisSqlSessionFactory.openSession();
		BookMapper mapper = session.getMapper(BookMapper.class);

		List<Map<String, Object>> list = mapper.findBookNameAndAuthor();

		// for (Map<String, Object> map : list) {
		// Set<Entry<String, Object>> set = map.entrySet();
		// for (Entry<String, Object> entry : set) {
		// System.out.println(entry.getKey() + "---" + entry.getValue());
		// }
		// }

		for (Map<String, Object> map : list) {
			Set<String> set = map.keySet();
			for (String s : set) {
				String value = (String) map.get(s);
				System.out.println(s + "---" + value);
			}
		}
	}

}