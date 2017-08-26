package test.innerclass;
/**
* @author Nocol
*
* @TODO 
* 
*/
/*
             匿名内部类（局部内部类的一种）： 就是内部类的简化写法。

                         前提：存在一个类或者接口
	                          这里的类可以是具体类也可以是抽象类。

                         格式：
	            new 类名或者接口名(){
		                         重写方法;
	            }
	                   注：该整体就是一个对象
	    
               本质是什么呢?
	                          是一个继承了该类或者实现了该接口的子类匿名对象。
*/
//定义接口
interface Inter{
	public abstract void study();
	public abstract void show();
}
//
class Outer6{
	public void method(){
		//一个方法时
		/*
		new Inter(){
			public void study(){
				System.out.println("study");
			}
		}.study();
		*/
		//两个方法时，接口内两个方法都要实现
		/*
		new Inter(){
			public void study() {
				System.out.println("study");
			}
			public void show() {
				System.out.println("show");
			}
		}.study();
		
		new Inter(){
			public void study() {
				System.out.println("study");
			}
			public void show() {
				System.out.println("show");
			}
		}.show();	
		*/
		
		//如果是很多个方法，就很麻烦了,改进
		Inter i=new Inter(){      //多态，向下转型，将实现接口类的对象赋给接口对象，实际为实现类对象
			public void study() {
				System.out.println("study");
			}
			public void show() {
				System.out.println("show");
			}
		};
		
		i.study();
		i.show();	
	}
	
}

public class InnerClassDemo5 {
	public static void main(String[] args){
		Outer6 o=new Outer6();
		o.method();  //打印 study和 show
	}

}
