package com.nocol.pattern.structure.Adapter.Class;

//类Source和接口Targetable因为不兼容，导致不能在一起工�?
//适配器Adapter则可以在不改变源代码的基�?上解决这个问�?
//这样Targetable接口的实现类Adapter的对象即使Targetable类型,也能访问到Source中的方法
public class Adapter extends Source implements Targetable {  
	public void method2() {  
	    System.out.println("this is the targetable method!");  
	}
	
} 
