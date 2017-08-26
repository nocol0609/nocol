package com.xml.xpath;

import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
* @author lxp
*
* @TODO 
* 
*/
public class xPathDemo {
	public static void main(String[] args) throws Exception{
		/**
		 * ����ɾ����ǩΪ2��ѧ����ǩ
		 */
		//��ȡxml�ļ�
		SAXReader reader=new SAXReader();
		Document document=reader.read("student.xml");
		
		//����xPath��ѯidΪ2�ı�ǩ
		Element StuEle=(Element)document.selectSingleNode("//Student[@id='2']");
		
		//ɾ���ñ�ǩ
		StuEle.detach();
		 
		//����޸ĺ��xml�ļ�
		FileOutputStream out = new FileOutputStream("student.xml");
		// ָ����ʽ
		OutputFormat format = OutputFormat.createPrettyPrint();
		//���ñ���
		format.setEncoding("utf-8");
		XMLWriter writer = new XMLWriter(out,format);
		//д������
		writer.write(document);
		//�ر���Դ
		writer.close();
	}
}