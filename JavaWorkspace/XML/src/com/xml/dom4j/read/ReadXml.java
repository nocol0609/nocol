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
* @TODO ���ĵ���Ϣ��װ������
*
* 
*/
public class ReadXml {
	public static void main(String[] args) throws Exception {
		//�������ϴ洢���ڵ��µ��ӽڵ�
		List<Contact> list=new ArrayList<Contact>();
		//��ȡxml�ļ�����װ����
		SAXReader reader=new SAXReader();
		Document document=reader.read(new File("./src/Contact.xml"));
		
		//��ȡ����contact��ǩ
		Iterator<Element> iterator=document.getRootElement().elementIterator("contact");
		//����contact��ǩ�µ��ӱ�ǩ
		while (iterator.hasNext()) {
			Element element = iterator.next();
			//����Contact����
			Contact contact=new Contact();
			contact.setId(element.attributeValue("id"));
			contact.setName(element.elementText("name"));
			contact.setAge(element.elementText("age"));
			contact.setPhone(element.elementText("phone"));
			contact.setEmail(element.elementText("email"));
			contact.setQq(element.elementText("qq"));
			//��contact��ӵ�����
			list.add(contact);
		}
		//��������Ԫ��
		for(Contact contact:list){
			System.out.println(contact);
		}
	}
}
