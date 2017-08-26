package com.xml.dom4j.read;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
* @author lxp
*
* @TODO 将文档信息封装到对象
*
* 
*/
public class ReadXml {
	public static void main(String[] args) throws Exception {
		//创建集合存储根节点下的子节点
		List<Contact> list=new ArrayList<Contact>();
		//读取xml文件，封装对象
		SAXReader reader=new SAXReader();
		Document document=reader.read(new File("./src/Contact.xml"));
		
		//读取所有contact标签
		Iterator<Element> iterator=document.getRootElement().elementIterator("contact");
		//遍历contact标签下的子标签
		while (iterator.hasNext()) {
			Element element = iterator.next();
			//创建Contact对象
			Contact contact=new Contact();
			contact.setId(element.attributeValue("id"));
			contact.setName(element.elementText("name"));
			contact.setAge(element.elementText("age"));
			contact.setPhone(element.elementText("phone"));
			contact.setEmail(element.elementText("email"));
			contact.setQq(element.elementText("qq"));
			//将contact添加到集合
			list.add(contact);
		}
		//遍历集合元素
		for(Contact contact:list){
			System.out.println(contact);
		}
	}
}
