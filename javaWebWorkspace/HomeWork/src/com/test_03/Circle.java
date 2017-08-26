package com.test_03;

/*дCircle�࣬�̳�Shape�࣬Ҫ������
1.double��������r����ʾԲ�İ뾶
2.�޲ι���������r��ʼ��Ϊ1.0
3.����������r���г�ʼ��
4.����������x��y��r���г�ʼ��
5.draw()���������"draw in circle"��x,y,r��ֵ
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
