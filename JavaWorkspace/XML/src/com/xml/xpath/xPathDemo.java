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
		 * 需求：删除标签为2的学生标签
		 */
		//读取xml文件
		SAXReader reader=new SAXReader();
		Document document=reader.read("student.xml");
		
		//利用xPath查询id为2的标签
		Element StuEle=(Element)document.selectSingleNode("//Student[@id='2']");
		
		//删除该标签
		StuEle.detach();
		 
		//输出修改后的xml文件
		FileOutputStream out = new FileOutputStream("student.xml");
		// 指定格式
		OutputFormat format = OutputFormat.createPrettyPrint();
		//设置编码
		format.setEncoding("utf-8");
		XMLWriter writer = new XMLWriter(out,format);
		//写出内容
		writer.write(document);
		//关闭资源
		writer.close();
	}
}
