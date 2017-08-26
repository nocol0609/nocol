package com.component;
/**
* @author lxp
*
* @TODO 
* 
*/
//定义组合对象的子对象类
public class Leaf extends Component{

	public Leaf(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
//	//子对象无需实现
//	@Override
//	public void Add(Component c) {
//		// TODO Auto-generated method stub
//		System.out.println("子类对象没有添加功能");
//	}
//	//子类对象无需实现
//	@Override
//	public void Remove(Component c) {
//		// TODO Auto-generated method stub
//		System.out.println("子类对象没有移除功能");
//	}
	//展现子类对象
	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println(name);
	}

}
