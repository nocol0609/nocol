package com.spring.yilai;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * ����ע��
 * @author Nocol
 *
 */
public class CollectionBean {
	private List<String> list;
	private Set<String> set;
	private Map<String, Integer> map;
	private Properties properties;

	public void setList(List<String> list) {
		this.list = list;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "CollectionBean [list=" + list + ", set=" + set + ", map=" + map + ", properties=" + properties + "]";
	}

}
