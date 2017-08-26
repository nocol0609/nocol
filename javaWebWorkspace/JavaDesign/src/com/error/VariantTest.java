package com.error;

/**
 * 
 * 实例变量和静态变量的区别？
 * 
 * 首先，静态变量有static修饰而实例变量没有。
 * 实例变量属于某个对象的属性，只有实例对象被创建了才能被分配空间，才能使用这个实例变量。
 * 而静态变量不属于某个实例对象，而是属于类因此也叫类变量。只要程序加载了类的字节码，不用创建任何实例对象，
 * 静态变量就能够被分配空间。
 * 
 * 对于下面的程序，无论创建多少个实例对象，永远都只分配了一个staticVar变量，
 * 并且每创建一个实例对象，这个staticVar就会加1；
 * 但是，每创建一个实例对象，就会分配一个instanceVar，
 * 即可能分配多个instanceVar，并且每个instanceVar的值都只自加了1次。
 *
 * @author Nocol
 *
 */
public class VariantTest {
	
	//静态变量
	public static int staticVar = 0;
	
	//实例变量
	public int instanceVar = 0;
	
	public  VariantTest(){
		
		staticVar++;

		instanceVar++;

		System.out.println("staticVar=" + staticVar + ",instanceVar=" + instanceVar);

	}
	public static void main(String[] args) {
		
		VariantTest variantTest=new VariantTest();//staticVar=1,instanceVar=1
		
		VariantTest variantTest2=new VariantTest();//staticVar=2,instanceVar=1
		
		VariantTest variantTest3=new VariantTest();//staticVar=3,instanceVar=1
		
	}
}
