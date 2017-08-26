package com.test_01;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class BookDom {
	public static void main(String[] args) throws Exception{
		DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document document = builder.parse(new File("book.xml"));
		List<Book> list=new ArrayList<Book>();
		NodeList nodeList = document.getElementsByTagName("book");
		for (int i = 0; i <nodeList.getLength(); i++) {
			Element element=(Element)nodeList.item(i);
			Book book=new Book();
			book.setId(Integer.parseInt(element.getAttribute("id")));
			book.setName(document.getElementsByTagName("name").item(i).getFirstChild().getNodeValue());
			book.setPrice(Integer.parseInt(document.getElementsByTagName("price").item(i).getFirstChild().getNodeValue()));
			book.setAuthor(document.getElementsByTagName("author").item(i).getFirstChild().getNodeValue());
			list.add(book);
		}
		for(Book book:list){
			System.out.println(book);
		}
	}
}
