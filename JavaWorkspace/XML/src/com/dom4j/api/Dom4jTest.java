package com.dom4j.api;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Test;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
public class Dom4jTest {
	/**
	 * �õ��ڵ���Ϣ
	 * 
	 * @throws Exception
	 */
	@Test
	public void test() throws Exception {
		// ����xml������
		SAXReader reader = new SAXReader();
		// ��ȡxml�ļ�������xml�ĵ�����(document)
		Document document = reader.read(new File("./src/contact.xml"));
		// �����ĵ������ȡ�ӽڵ�
		Iterator<Node> iterator = document.nodeIterator();// ��������ڵ�
		while (iterator.hasNext()) {// �ж��Ƿ�����һ��Ԫ��
			// ȡ���ڵ�
			Node node = iterator.next();// Node�����нڵ�ĳ���
			// ��ȡ�ڵ�����
			String name = node.getName();
			System.out.println(name);
			// ����ȡ����������ӽڵ�
			// ֻ�б�ǩ�ڵ�����ӽڵ�
			// �жϵ�ǰ�ڵ��Ƿ��Ǳ�ǩ�ڵ�
			if (node instanceof Element) {
				// ��Node����ڵ�nodeǿתΪElement��ǩ�ڵ�
				Element element = (Element) node;
				Iterator<Node> iterator2 = element.nodeIterator();
				while (iterator2.hasNext()) {
					Node node2 = iterator2.next();
					System.out.println(node2.getName());
				}
			}
		}
	}

	/**
	 * ����xml�����нڵ�
	 * 
	 * @throws Exception
	 */
	@Test
	public void test2() throws Exception {
		// ����xml������
		SAXReader reader = new SAXReader();
		// ��ȡxml�ļ�������xml�ĵ�����(document)
		Document document = reader.read(new File("./src/contact.xml"));
		// ��ȡ���ڵ�
		Element rootElement = document.getRootElement();
		// ���û�ȡ��ǩ���������ӽڵ�
		getChildNode(rootElement);
	}

	/**
	 * ��ȡ����ı�ǩ�������ӽڵ�
	 * 
	 * @param element
	 */
	private void getChildNode(Element element) {
		System.out.println(element.getName());
		// ����ı�ǩ���ܻ����ӽڵ�
		Iterator<Node> iterator = element.nodeIterator();
		// �����ڵ�
		while (iterator.hasNext()) {
			Node node = iterator.next();
			// �ж��Ƿ�Ϊ��ǩ�ڵ�
			if (node instanceof Element) {
				// ǿתΪ��ǩ�ڵ�
				Element element2 = (Element) node;
				// ��ȡ���ñ�ǩ�ڵ��µ������ӽڵ�(�ݹ�)
				getChildNode(element2);
			}
		}
	}

	/**
	 * ��ȡ��ǩ
	 * 
	 * @throws Exception
	 */
	@Test
	public void test3() throws Exception {
		// ����xml������
		SAXReader reader = new SAXReader();
		// ��ȡxml�ļ�������xml�ĵ�����(document)
		Document document = reader.read(new File("./src/contact.xml"));

		// 1��ȡ����ǩ
		Element rootElement = document.getRootElement();
		System.out.println(rootElement.getName());

		// // 2��ȡ��ǰ��ǩ��ָ���ĵ�һ����ǩ
		// Element contactEle = rootElement.element("contact");
		// System.out.println(contactEle.getName());

		// // 3��ȡ��ǰ��ǩ��ָ�����Ƶ����б�ǩ
		// Iterator<Element> iterator = rootElement.elementIterator();
		// while (iterator.hasNext()) {
		// Element element = iterator.next();
		// System.out.println(element.getName());
		// }

		// 4��ȡ��ǰ��ǩ�µ������ӱ�ǩ
		List<Element> list = rootElement.elements();
		// ��������
		/*
		 * //��һ�ַ�ʽ����ͨfor for (int i = 0; i < list.size(); i++) { Element
		 * element=list.get(i); System.out.println(element.getName()); }
		 */
		/*
		 * //�ڶ��ַ�ʽ����ǿfor for(Element element:list){
		 * System.out.println(element.getName()); }
		 */
		/*
		 * //�����ַ�ʽ�������� Iterator<Element> iterator = list.iterator(); while
		 * (iterator.hasNext()) { Element element = (Element) iterator.next();
		 * System.out.println(element.getName()); }
		 */

		// 5�����ε�ȡ��ǩ
		Element nameElement = rootElement.element("contact").element("name");
		System.out.println(nameElement.getName());
	}

	/**
	 * ��ȡ����
	 * 
	 * @throws Exception
	 */
	@Test
	public void test4() throws Exception {
		// ����xml������
		SAXReader reader = new SAXReader();
		// ��ȡxml�ļ�������xml�ĵ�����(document)
		Document document = reader.read(new File("./src/contact.xml"));

		// ��ȡ��ǩ����(�Ȼ���������ڵı�ǩ�����ٻ�ȡ����)
		Element contactElement = document.getRootElement().element("contact");
		// 2�õ�����
		// //2.1�õ�ָ�����Ƶ�����ֵ
		// String idValue=contactElement.attributeValue("id");
		// System.out.println(idValue);

		// //2.2�õ�ָ���������Ƶ����Զ���
		// Attribute attribute=contactElement.attribute("id");
		// System.out.println(attribute.getName()+"="+attribute.getValue());

		// 2.3�õ����е�����
		List<Attribute> list = contactElement.attributes();
		for (Attribute attribute : list) {
			System.out.println(attribute.getName() + "=" + attribute.getValue());
		}
	}

	/**
	 * ��ȡ�ı�
	 * 
	 * @throws Exception
	 */
	@Test
	public void test5() throws Exception {
		// ����xml������
		SAXReader reader = new SAXReader();
		// ��ȡxml�ļ�������xml�ĵ�����(document)
		Document document = reader.read(new File("./src/contact.xml"));
		
		//1��ȡ�ı����Ȼ�ȡ��ǩ���ٻ�ȡ��ǩ�ϵ��ı���
		Element nameElement=document.getRootElement().element("contact").element("name");
		String text=nameElement.getText();
		System.out.println(text);//����
		
		//1.2. �õ�ָ���ӱ�ǩ�����ı�����
		String text2=document.getRootElement().element("contact").elementText("name");
		System.out.println(text2);//����
	}
}