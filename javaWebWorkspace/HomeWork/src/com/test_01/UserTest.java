package com.test_01;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class UserTest {
	public static void main(String[] args) throws Exception {
		DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document document = builder.parse(new File("user.xml"));
		NodeList nodeList = document.getElementsByTagName("users");
		double sum = 0;
		for (int i = 0; i < nodeList.getLength(); i++) {
			Element element = (Element) nodeList.item(i);
			String user = element.getAttribute("name");
			if ("tom".equals(user)) {
				sum += Double.parseDouble((element.getElementsByTagName("user").item(i).getTextContent()));
			}
			System.out.println(sum);
		}

	}
}
