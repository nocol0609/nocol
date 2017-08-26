package com.xml.sax_dom;


import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class DiskSax {
	public static void main(String[] args) throws Exception {
		SAXParserFactory factor = SAXParserFactory.newInstance();
		SAXParser parser = factor.newSAXParser();
		//解析的文件
		File file=new File("student.xml");
		parser.parse(file,new Myhander());
	}
}
