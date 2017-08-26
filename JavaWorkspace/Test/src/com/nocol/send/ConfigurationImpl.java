package com.nocol.send;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.briup.gather.Gather;

public class ConfigurationImpl implements Configuration {

	private Map<String, WossModuleInit> map;

	public static void main(String[] args) {
		ConfigurationImpl con = new ConfigurationImpl();
	}

	public ConfigurationImpl() {
		this("src.xml");
	}

	public ConfigurationImpl(String path) {
		/**
		 * 解析配置文件 读取内容放入map对象中，按照key为标签名值为wossMouduleInit放置，
		 * 同时将各自类中的子标签放置到properties中
		 */
		map = new HashMap<String, WossModuleInit>();
		SAXReader reader = new SAXReader();
		File file = new File(path);
		try {
			Document document = reader.read(file);
			Element rootElement = document.getRootElement();
			List<Element> list = rootElement.elements();
			for (Element e : list) {
				String tagName = e.getName();
				String clsName = e.attributeValue("class");
				WossModuleInit cls = (WossModuleInit) Class.forName(clsName).newInstance();
				map.put(tagName, cls);
				Properties properties = new Properties();
				List<Element> list2 = e.elements();
				for (Element element : list2) {
					String name = element.getName();
					String value = element.getText();
					properties.put(name, value);
				}
				cls.init(properties);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ServerImpl getServer() throws Exception {
		// TODO Auto-generated method stub
		return (ServerImpl) map.get("server");
	}

	@Override
	public DBImpl getDbStore() throws Exception {
		// TODO Auto-generated method stub
		return (DBImpl) map.get("dbstore");
	}

	@Override
	public ClientImpl getClient() throws Exception {
		// TODO Auto-generated method stub
		return (ClientImpl) map.get("client");
	}

	@Override
	public Gather getGather() throws Exception {
		// TODO Auto-generated method stub
		return (Gather) map.get("gather");
	}

}
