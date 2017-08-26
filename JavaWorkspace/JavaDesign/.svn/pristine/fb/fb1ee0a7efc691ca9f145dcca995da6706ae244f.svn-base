package com.component;
/**
* @author lxp
*
* @TODO 
* 
*/
//测试类
public class CompnentDemo {
	public static void main(String[] args) {
		//创建组合对象
		Composit rootComposit=new Composit("组合对象");
		
		//创建组合对象的子对象A
		Composit CompositA=new Composit("组合对象添加子对象A");
		
		//创建组合对象的子对象B
		Composit CompositB=new Composit("组合对象添加子对象B");
		
		//创建子对象B的子对象a和b并加入到子对象B
		CompositB.Add(new Leaf("子对象B添加子对象a"));
		CompositB.Add(new Leaf("子对象B添加子对象b"));
		
		//组合对象的子对象加入到组合对象内
		rootComposit.Add(CompositA);
		rootComposit.Add(CompositB);
		//rootComposit.Remove(CompositA);
		
		//展示所有的对象
		rootComposit.Display();
		
		
	}
}
