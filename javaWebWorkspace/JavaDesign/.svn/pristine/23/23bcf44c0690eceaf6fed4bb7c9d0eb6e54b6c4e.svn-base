package com.nocol.pattern.structure.Bridge.example2;

//抽象的礼物类
public abstract class Gift {
	private Color color;
	private String name;//礼物的名�?
	public Gift(String name,Color color) {
		this.name = name;
		this.color = color;
	}
	public void show(){
		System.out.println("礼物是一�?"+color.getName()+"�?"+name);
	}
}
//鲜花�?
class Flower extends Gift{
	public Flower( Color color) {
		super("鲜花", color);
	}
}
//戒指�?
class Ring extends Gift{
	public Ring(Color color) {
		super("戒指", color);
	}
}
