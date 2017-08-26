package com.xml.sax_dom;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Myhander extends DefaultHandler {
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		System.out.print("<"+qName);
		for(int i=0;i<attributes.getLength();i++){
			//得到属性名称
			String attrName = attributes.getQName(i);
			//得到属性值
			String attrValue = attributes.getValue(i);
			System.out.print(" "+attrName+"=\""+attrValue+"\"");
		}
		System.out.print(">");
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		String str=new String(ch, start, length);
		System.out.print(str);
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		System.out.print("</"+qName+">");
	}

}
