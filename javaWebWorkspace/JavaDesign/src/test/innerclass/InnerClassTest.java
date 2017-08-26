package test.innerclass;

/**
 * @author Nocol
 *
 * @TODO
 * 
 */
/*
 * 面试题： 要求请填空分别输出30，20，10。
 * 
 * 注意： 
 *     1:内部类和外部类没有继承关系。
 *     2:通过外部类名限定this对象 Outer.this
 */
class Outer5 {
	
	public int num = 10;

	class Inner {                  //成员内部类
		public int num = 20;

		public void show() {
			int num = 30;
			
			System.out.println(num);
			System.out.println(this.num);             //this表示本类的num
		   // System.out.println(new Outer5().num);      //也可以
			System.out.println(Outer5.this.num);      //Outer5.this 表示是外部类的东西
		} 
	}
}

class InnerClassTest {
	public static void main(String[] args) {
		Outer5.Inner oi = new Outer5().new Inner();
		oi.show();
	}
}