package com.xml.sax;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/*DefaultHandler���API:
	void startDocument()  :  �ڶ����ĵ���ʼʱ����
	void endDocument()  ���ڶ����ĵ�����ʱ����
	void startElement(String uri, String localName, String qName, Attributes attributes)  ��������ʼ��ǩʱ����				
	void endElement(String uri, String localName, String qName)   ������������ǩʱ����
	void characters(char[] ch, int start, int length)  �� �����ı�����ʱ���� 
 */
//����DefaultHander����
class MyHander extends DefaultHandler{
	/**
	 * ��ʼ�ĵ��ǵ���
	 */
	@Override
	public void startDocument() throws SAXException {
		
		System.out.println("MyHander.startDocument()"); 
	}
	/**
	 * ��ʼ��ǩ�ǵ���
	 * @param qName ��ʼ��ǩ�ı�ǩ��'
	 * @param attributes ��ʼ��ǩ�������б�
	 */
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		
		System.out.println("MyHander.startElement()----->"+qName);
	}
	/**
	 * �����ı�����ʱ����
	 * @param ch ��ʾ��ǰ����������ı�����
	 * @param start ��ʾ��ǰ�ı����ݵĿ�ʼλ��
	 * @param length  ��ʾ��ǰ�ı��ĳ���
	 */
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		
		String Content=new String(ch, start, length);
		System.out.println("MyHander.characters()---->"+Content);
	}
	/**
	 * ������ǩ�ǵ���
	 * @param qName ������ǩ������
	 */
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		
		System.out.println("MyHander.endElement()---->"+qName);
	}
	
	/**
	 * �����ĵ�ʱ ����
	 * 
	 */
	@Override
	public void endDocument() throws SAXException {
		
		System.out.println("MyHander.endDocument()");
	} 
	
	
}

public class SAX_Xml {
	public static void main(String[] args) throws Exception{
		//����SAXPaser����
		SAXParser parser=SAXParserFactory.newInstance().newSAXParser();
		
		//����paser����
		/**
		 * ����һ��xml�ĵ�
		 * ��������DefaultHander������
		 */
		parser.parse(new File("out.xml"), new MyHander()); 
		
	}
	
	
}
