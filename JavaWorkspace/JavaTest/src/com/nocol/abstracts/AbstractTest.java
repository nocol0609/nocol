package com.nocol.abstracts;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
// 定义接口
interface Jumpping {
	public abstract void jump();
}

// 定义抽象
abstract class Animal {
	public abstract void eat();
}

// 定义具体子类
class Dog extends Animal implements Jumpping {

	public void jump() {   //实现类（Dog）重写接口的抽象方法
		System.out.println("jumpping dog");
	}

	public void eat() {    //子类（Dog）重写抽象父类的抽象方法
		System.out.println("dog eat");
	}
}

// 测试类
public class AbstractTest {
	public static void main(String[] args) {
		Animal a = new Dog(); // 向上转型，多态
		a.eat(); // 打印子类重写抽象父类后的方法
		System.out.println("------------------------");
		// 实现跳高的方法
		// 还原Dog
		Dog d = (Dog) a;
		d.eat();
		d.jump();                  
	}
}
