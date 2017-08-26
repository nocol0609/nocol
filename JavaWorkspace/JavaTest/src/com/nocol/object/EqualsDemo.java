package com.nocol.object;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*  Object类的方法：
 * 
 *    D：public boolean equals(Object obj):指示其他某个对象是否与此对象“相等”。 
 *       这个方法，默认情况下比较的是地址值 。 //   指equals()方法未重写时
 *       比较地址值一般来说意义不大，所以我们要重写该方法。
 *       怎么重写呢?
 * 		              一般都是用来比较对象的成员变量值是否相同。
 * 
 *            重写的代码优化：提高效率，提高程序的健壮性。
 *       最终版：
 * 		               其实还是自动生成。
 *
 * 看源码：
 * 		public boolean equals(Object obj) {
 * 			//this - s1
 * 			//obj - s2 
 *       	return (this == obj);
 *   	}
 * 
 * ==:
 * 		基本类型：比较的就是值是否相同
 * 		引用类型：比较的就是地址值是否相同
 * equals:
 * 		引用类型：默认情况下，比较的是地址值。
 * 		不过，我们可以根据情况自己重写该方法。一般重写都是自动生成，比较对象的成员变量值是否相同
 */
//定义学生类
class Student3 {
	private String name;
	private int age;

	public Student3() {
		super();
	}

	public Student3(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

   //重写父类Object的equals()方法，（自动生成）
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student3 other = (Student3) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
//  重写父类Object的equals()方法，（手动简化版）

//	public boolean equals(Object obj) {
//		// return true;
//		//这里要改进，根据这里比较的成员变量来决定返回true还是false
//		//这里其实要比价的就是name和age
//		//但是，name是String类型的，而String是引用类型的，所以，在这里不能直接用==比较，应该用equals()比较
//		//String的equals()方法是重写自Object类的，比较的是字符串的内容是否相同
//		//this -- s1
//		//obj -- s2
//		//我们要使用的是学生类的特有成员变量,所以要向下转型
//		Student3 s = (Student3)obj;  //s -- obj -- s2;
//		if(this.name.equals(s.name) && this.age == s.age) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//  重写父类Object的equals()方法，（手动最终版）

//	public boolean equals(Object obj) {
//		//为了提高效率
//		if(this == obj){
//			return true;
//		}
//		
//		//为了提供程序的健壮性
//		//我先判断一下，obj是不是学生的一个对象，如果是，再做向下转型，如果不是，直接返回false。
//		//这个时候，我们要判断的是对象是否是某个类的对象?
//		//记住一个格式：对象名 instanceof 类名
//		//表示：判断该对象名是否是该类名一个对象
//		if(!(obj instanceof Student3)){
//			return false;
//		}
//		//如果是就继续
//		
//		Student3 s = (Student3)obj;
//		//System.out.println("同一个对象，还需要向下转型并比较吗?");
//		return this.name.equals(s.name) && this.age == s.age;
//	}
	
}
//定义测试类
public class EqualsDemo {
	public static void main(String[] args) {
		Student3 s1 = new Student3("大帅比", 27);
		Student3 s2 = new Student3("大帅比", 27);
		System.out.println(s1 == s2); //  比较两对象的地址值，所以返回false
		Student3 s3 = s1;
		System.out.println(s1 == s3);// true
		System.out.println("---------------");

		System.out.println(s1.equals(s2)); // obj = s2; // 当equals()方法未重写时打印false，重写后未true
		System.out.println(s1.equals(s1)); // true
		System.out.println(s1.equals(s3)); // true
		Student3 s4 = new Student3("风清扬",30);
		System.out.println(s1.equals(s4)); //false   //s1与s4的成员变量值不一样
		
		Demo d = new Demo();
		System.out.println(s1.equals(d)); //ClassCastException  Demo类对象d不属于Student3 的对象，经判断后
                                          //返回false
	}
}
class Demo {}
