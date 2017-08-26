package com.test_03;

/*写Rectangle类，继承Shape类，要求如下
1.double类型属性height和width，表示矩形的高和宽
2.无参构造器，将height和width都初始化为1.0
3.构造器，对height和width进行初始化
4.构造器，对x、y、height、width进行初始化
5.draw()方法，输出"draw in rectangle"和x,y,height,width的值*/
public class Rectangle extends Shape {
	private double heigth;// 高
	private double width;// 宽

	public Rectangle() {
		heigth = 1.0;
		width = 1.0;
	}

	public Rectangle(int x, int y, double heigth, double width) {
		super(x, y);
		this.heigth = heigth;
		this.width = width;
	}

	public void draw(int x, int y, double heigth, double width) {
		System.out.println("draw in rectangle:" + "x=" + x + " y=" + y + " height=" + heigth + " width=" + width);
	}
}
