package com.xml.doom4j.write;

import java.io.File;
import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
public class WriteXml {
	public static void main(String[] args) throws Exception {
		// ��ȡҪ�����xml��document����
		Document document = new SAXReader().read(new File("./src/contact.xml"));
		// ����������ļ�
		FileOutputStream out = new FileOutputStream("out.xml");
		/**
		 * 1.ָ��д���ĸ�ʽ
		 */
		OutputFormat format = OutputFormat.createCompactFormat(); //���յĸ�ʽ.ȥ���ո���.��Ŀ���ߵ�ʱ��
		//OutputFormat format = OutputFormat.createPrettyPrint(); //Ư���ĸ�ʽ.�пո�ͻ���.�������Ե�ʱ��
		/**
		 * 2.ָ�����ɵ�xml�ĵ��ı���
		 *    ͬʱӰ����xml�ĵ�����ʱ�ı���  ��  xml�ĵ�������encoding�ı��루xml����ʱ�ı��룩
		 *    ���ۣ� ʹ�ø÷������ɵ�xml�ĵ����������������⡣
		 */
		format.setEncoding("utf-8");
		
		// ����д������
		XMLWriter writer = new XMLWriter(out);
		// ��document����д��
		writer.write(document);
		// �ر���
		writer.close();

	}
}
