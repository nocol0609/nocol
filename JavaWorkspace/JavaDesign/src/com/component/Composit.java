package com.component;

import java.util.ArrayList;
import java.util.List;

/**
* @author lxp
*
* @TODO 
* 
*/
//定义具体的组合类(根节点)
public class Composit extends Component {
	
    //定义集合对象存储组合对象的子对象
	List<Component> list=new ArrayList<Component>();
		
	public Composit(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
//	//添加子对象
//	@Override
//	public void Add(Component c) {
//		// TODO Auto-generated method stub
//		list.add(c);
//		
//	}
//	//删除自对象
//	@Override
//	public void Remove(Component c) {
//		// TODO Auto-generated method stub
//		list.remove(c);
//	}
	//展示子对象
	@Override
	public void Display() {
		// TODO Auto-generated method stub
		//输出添加的组合对象
		System.out.println(name);
		//遍历组合对象的子对象
		for(Component c:list){
			c.Display();
		}
	}
	
	/*
	 * 
	 * 更佳的方案：将添加和移除方法定义为接口，创建有具体组合类的时候实现Add接口和Remove接口即可
	 * 
	 */
	//定义添加子对象的方法
	public void Add(Component c){
		list.add(c);
	}
	//定义移除子对象的方法
	public void Remove(Component c){
		list.remove(c);
	}
	
}
