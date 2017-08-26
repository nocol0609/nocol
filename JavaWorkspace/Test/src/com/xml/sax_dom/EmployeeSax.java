package com.xml.sax_dom;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

//Ω‚Œˆ¿‡
class EmployeeHander extends DefaultHandler {

	private List<Employee> list;
	private Employee employee;
	private String tagName;

	public List<Employee> getList() {
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}

	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		list = new ArrayList<Employee>();
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		if ("employee".equals(qName)) {
			employee = new Employee();
			employee.setId(Integer.parseInt(attributes.getValue("id")));
			employee.setDepName(attributes.getValue("depName"));
		} else {
			tagName = qName;
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		String str = new String(ch, start, length);
		if ("name".equals(tagName)) {
			employee.setName(str);
		} else if ("age".equals(tagName)) {
			employee.setAge(Integer.parseInt(str));
		} else if ("gender".equals(tagName)) {
			employee.setGender(str);
		} else if ("salary".equals(tagName)) {
			employee.setSalary(Integer.parseInt(str));
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		if ("employee".equals(qName)) {
			list.add(employee);
		} else {
			tagName = null;
		}
	}
}

public class EmployeeSax {
	public static void main(String[] args) throws Exception {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		EmployeeHander hander = new EmployeeHander();
		parser.parse(new File("employee.xml"), hander);

		List<Employee> list = hander.getList();
		for (Employee e : list) {
			System.out.println(e);
		}

	}
}
