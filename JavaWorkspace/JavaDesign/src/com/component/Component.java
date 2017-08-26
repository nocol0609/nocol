package com.component;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
//定义抽象组合类
public abstract class Component {
	String name;
	
	public Component(String name) {
		this.name=name;
	}
//	//添加组合对象的子对象
//	public abstract void Add(Component c);
//	//移除组合对象的子对象
//	public abstract void Remove(Component c);
	
	//展现所有组合对象的子对象
	public abstract void Display();
}
