package com.nocol.bean;

public class s_dept {
	private int id;
	private String name;
	private int region_id;
	public s_dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public s_dept(int id, String name, int region_id) {
		super();
		this.id = id;
		this.name = name;
		this.region_id = region_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRegion_id() {
		return region_id;
	}
	public void setRegion_id(int region_id) {
		this.region_id = region_id;
	}
	@Override
	public String toString() {
		return "s_dept [id=" + id + ", name=" + name + ", region_id=" + region_id + "]";
	}
	
	
}
