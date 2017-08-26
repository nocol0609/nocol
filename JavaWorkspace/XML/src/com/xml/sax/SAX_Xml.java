package com.xml.sax;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/*DefaultHandler类的API:
	void startDocument()  :  在读到文档开始时调用
	void endDocument()  ：在读到文档结束时调用
	void startElement(String uri, String localName, String qName, Attributes attributes)  ：读到开始标签时调用				
	void endElement(String uri, String localName, String qName)   ：读到结束标签时调用
	void characters(char[] ch, int start, int length)  ： 读到文本内容时调用 
 */
//定义DefaultHander子类
class MyHander extends DefaultHandler{
	/**
	 * 开始文档是调用
	 */
	@Override
	public void startDocument() throws SAXException {
		
		System.out.println("MyHander.startDocument()"); 
	}
	/**
	 * 开始标签是调用
	 * @param qName 开始标签的标签名'
	 * @param attributes 开始标签的属性列表
	 */
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		
		System.out.println("MyHander.startElement()----->"+qName);
	}
	/**
	 * 读到文本内容时调用
	 * @param ch 表示当前读完的所有文本内容
	 * @param start 表示当前文本内容的开始位置
	 * @param length  表示当前文本的长度
	 */
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		
		String Content=new String(ch, start, length);
		System.out.println("MyHander.characters()---->"+Content);
	}
	/**
	 * 结束标签是调用
	 * @param qName 结束标签的名字
	 */
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		
		System.out.println("MyHander.endElement()---->"+qName);
	}
	
	/**
	 * 结束文档时 调用
	 * 
	 */
	@Override
	public void endDocument() throws SAXException {
		
		System.out.println("MyHander.endDocument()");
	} 
	
	
}

public class SAX_Xml {
	public static void main(String[] args) throws Exception{
		//创建SAXPaser对象
		SAXParser parser=SAXParserFactory.newInstance().newSAXParser();
		
		//调用paser方法
		/**
		 * 参数一：xml文档
		 * 参数二：DefaultHander的子类
		 */
		parser.parse(new File("out.xml"), new MyHander()); 
		
	}
	
	
}
