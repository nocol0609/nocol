package com.nocol.json;

import java.util.LinkedList;
import java.util.List;

public class Province2 {
	private String name;
	private List<City2> cityList = new LinkedList<City2>();

	public Province2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Province2(String name, List<City2> cityList) {
		super();
		this.name = name;
		this.cityList = cityList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<City2> getCityList() {
		return cityList;
	}

	public void setCityList(List<City2> cityList) {
		this.cityList = cityList;
	}

	@Override
	public String toString() {
		return "Province2 [name=" + name + ", cityList=" + cityList + "]";
	}

}
