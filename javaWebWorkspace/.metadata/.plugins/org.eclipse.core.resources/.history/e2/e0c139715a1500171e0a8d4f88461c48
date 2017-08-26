package gz.itcast.contact;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * xml操作的工具类
 * @author APPle
 *
 */
public class XMLUtil {
	
	/**
	 * 用于读取xml文件
	 * @return
	 */
	public static Document getDocument(){
		try {
			Document doc = new SAXReader().read(new File("e:/contact.xml"));
			return doc;
		} catch (DocumentException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	

	/**
	 * 写出xml文件
	 */
	public static void write2xml(Document doc){
		try {
			FileOutputStream out = new FileOutputStream("e:/contact.xml");
			OutputFormat format = OutputFormat.createPrettyPrint();
			format.setEncoding("utf-8");
			XMLWriter writer = new XMLWriter(out,format);
			writer.write(doc);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
