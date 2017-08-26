package com.xml.sax_dom;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;


public class DiskDom {
	public static void main(String[] args) throws Exception {
		//获取解析器
		DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		//获取解析文件，返回解析的文档对象
		Document document = builder.parse(new File("student.xml")) ;
		NodeList nodeList = document.getElementsByTagName("Student");
		for (int i = 0; i < nodeList.getLength(); i++) {
			Element element=(Element)nodeList.item(i);
			String id=element.getAttribute("id");
			//System.out.println(id);
			String name = document.getElementsByTagName("name").item(i).getFirstChild().getNodeValue();
			String gender=document.getElementsByTagName("gender").item(i).getFirstChild().getNodeValue();
			String address=document.getElementsByTagName("address").item(i).getFirstChild().getNodeValue();
			
			System.out.println(name+"---"+gender+"---"+address);
		}
	}
}
