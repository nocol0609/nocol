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
		// 读取要输出的xml的document对象
		Document document = new SAXReader().read(new File("./src/contact.xml"));
		// 创建输出的文件
		FileOutputStream out = new FileOutputStream("out.xml");
		/**
		 * 1.指定写出的格式
		 */
		OutputFormat format = OutputFormat.createCompactFormat(); //紧凑的格式.去除空格换行.项目上线的时候
		//OutputFormat format = OutputFormat.createPrettyPrint(); //漂亮的格式.有空格和换行.开发调试的时候
		/**
		 * 2.指定生成的xml文档的编码
		 *    同时影响了xml文档保存时的编码  和  xml文档声明的encoding的编码（xml解析时的编码）
		 *    结论： 使用该方法生成的xml文档避免中文乱码问题。
		 */
		format.setEncoding("utf-8");
		
		// 创建写出对象
		XMLWriter writer = new XMLWriter(out);
		// 将document对象写出
		writer.write(document);
		// 关闭流
		writer.close();

	}
}
