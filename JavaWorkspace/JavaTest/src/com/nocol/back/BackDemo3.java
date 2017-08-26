 package com.nocol.back;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * 返回值类型
 *         基本类型: 
 *         引用类型： 
 *                类:返回的是该类的对象 
 *                抽象类:返回的是该抽象类的子类对象
 *                接口:返回的是该接口的实现类的对象
 */
// 定义一个爱好的接口
interface Love {
	public abstract void love();
}

class LoveDemo {
	public Love getLove() {
		// Love l = new Star();
		// return l;

		return new Star();
	}
}

// 定义具体类实现接口
class Star implements Love {
	public void love() {
		System.out.println("明星爱耍大牌");
	}
}

class BackDemo3 {
	public static void main(String[] args) {
		//测试
		LoveDemo ld = new LoveDemo();
		//原本就是 ld.getLove();即可，但是有返回值，即用接口Love的对象l接收，实际为其实现类的对象
		Love l = ld.getLove(); // new Star(); Love l = new Star(); //多态
		l.love();
	}
}
