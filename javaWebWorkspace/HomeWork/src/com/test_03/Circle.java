package com.test_03;

/*写Circle类，继承Shape类，要求如下
1.double类型属性r，表示圆的半径
2.无参构造器，将r初始化为1.0
3.构造器，对r进行初始化
4.构造器，对x、y、r进行初始化
5.draw()方法，输出"draw in circle"和x,y,r的值
*/
public class Circle extends Shape {
	private double r;

	public Circle() {
		r = 1.0;
	}

	public Circle(double r) {
		this.r = r;
	}

	public Circle(int x, int y, double r) {
		super(x, y);
		this.r = r;
	}

	public void draw(int x, int y, double r) {
		// TODO Auto-generated method stub
		System.out.println("draw in circle:" + "x=" + x + " y=" + y + " r=" + r);
	}
}
