package com.test_03;

/*дShape�࣬Ҫ�����£�
1.int��������x��y���ֱ��ʾͼ�ε����ĵ�����
2.�޲ι�����
3.����������x��y���г�ʼ��
4.draw()���������"Shape draw"*/
public class Shape {
	private int x;
	private int y;

	public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void draw() {
		System.out.println("Shape draw");
	}
}
