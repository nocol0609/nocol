package com.test_03;

/*дRectangle�࣬�̳�Shape�࣬Ҫ������
1.double��������height��width����ʾ���εĸߺͿ�
2.�޲ι���������height��width����ʼ��Ϊ1.0
3.����������height��width���г�ʼ��
4.����������x��y��height��width���г�ʼ��
5.draw()���������"draw in rectangle"��x,y,height,width��ֵ*/
public class Rectangle extends Shape {
	private double heigth;// ��
	private double width;// ��

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
