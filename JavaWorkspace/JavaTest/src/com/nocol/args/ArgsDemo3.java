package com.nocol.args;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * 形式参数：
 *        基本类型(太简单，不是我今天要讲解的) 
 *        引用类型 
 *              类名:(匿名对象的时候其实我们已经讲过了)需要的是该类的对象
 *              抽象类:需要的是该抽象的类子类的对象 
 *              接口:需要的是该接口的实现类的对象
 */
// 定义一个爱好的接口
interface Love {
	public abstract void love();
}

class LoveDemo {
	public void method(Love l) {    //接口当做参数
		                            // l; l = new Teacher(); Love l = new
									// Teacher(); 多态
		l.love();
	}
}

// 定义具体类实现接口
class Star implements Love {
	public void love() {
		System.out.println("明星爱耍大牌");
	}
}

class ArgsDemo {
	public static void main(String[] args) {
		
		// 需求：我要测试LoveDemo类中的love()方法
		LoveDemo ld = new LoveDemo();
		Love l = new Star();
		ld.method(l);
	}
}