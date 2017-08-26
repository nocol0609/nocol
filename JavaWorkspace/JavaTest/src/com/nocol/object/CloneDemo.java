package com.nocol.object;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*  Object类的方法：
 *     E:    protected void finalize()：当垃圾回收器确定不存在对该对象的更多引用时，
 *                            由对象的垃圾回收器调用此方法。用于垃圾回收，但是什么时候回收不确定。
 *                            
 *     F:	 protected Object clone():创建并返回此对象的一个副本,所以需要重写该方法，实现对object子类对象的克隆
 *		    
 *
 *       Cloneable:此类实现了 Cloneable 接口，以指示 Object.clone() 方法可以合法地对该类实例进行按字段复制。 
 *  	   这个接口是标记接口，告诉我们实现该接口的类就可以实现对象的复制了。
 *       //该接口无抽象方法
 */
// 定义学生类
class Student4 implements Cloneable { // 实现带接口以指示 Object.clone()方法可以合法地对该类实例进行按字段复制
										
	private String name;
	private int age;

	public Student4() {
		super();
	}

	public Student4(String name, int age) {
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

	// 重写Object类的clong()方法
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
//定义测试类
public class CloneDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		// 创建学生对象
		Student4 s = new Student4();
		s.setName("大帅比");
		s.setAge(30);

		// 克隆学生对象
		Object obj = s.clone(); // protected Object clone();类名当做返回值，返回该类对象，所以用 Object obj接收
		Student4 s2 = (Student4) obj;  // 克隆完学生对象还原成学生
		System.out.println("---------");

		System.out.println(s.getName() + "---" + s.getAge());
		System.out.println(s2.getName() + "---" + s2.getAge());

		// 以前的做法
		Student4 s3 = s;
		System.out.println(s3.getName() + "---" + s3.getAge());
		System.out.println("---------");

		// 其实是有区别的，克隆后的对象与原对象无关联了，对原对象的修改不会对克隆后的对象产生影响
		s3.setName("小帅比");
		s3.setAge(20);
		System.out.println(s.getName() + "---" + s.getAge());
		System.out.println(s2.getName() + "---" + s2.getAge());
		System.out.println(s3.getName() + "---" + s3.getAge());

	}
}
