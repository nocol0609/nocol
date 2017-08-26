package com.xml.sax_dom;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class EmployeeDom {
	public static void main(String[] args) throws Exception {
		DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document document = builder.parse(new File("employee.xml"));
		List<Employee> list = new ArrayList<Employee>();
		
		NodeList nodeList = document.getElementsByTagName("employee");
		for (int i = 0; i < nodeList.getLength(); i++) {
			Element element = (Element) nodeList.item(i);
			Employee employee = new Employee();
			employee.setId(Integer.parseInt(element.getAttribute("id")));
			employee.setDepName(element.getAttribute("depName"));
			employee.setName(document.getElementsByTagName("name").item(i).getFirstChild().getNodeValue());
			employee.setAge(
					Integer.parseInt(document.getElementsByTagName("age").item(i).getFirstChild().getNodeValue()));
			employee.setGender(document.getElementsByTagName("gender").item(i).getFirstChild().getNodeValue());
			employee.setSalary(
					Integer.parseInt(document.getElementsByTagName("salary").item(i).getFirstChild().getNodeValue()));

			list.add(employee);//17351208171
		}
		for(Employee e:list){
			System.out.println(e);
		}
	}
}
