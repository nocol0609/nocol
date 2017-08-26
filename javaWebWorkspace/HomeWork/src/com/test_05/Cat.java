package com.test_05;

public class Cat extends Animal implements Pet {

	private String name;

	public Cat() {
		// TODO Auto-generated constructor stub
		super(4);
	}

	public Cat(String name) {
		// TODO Auto-generated constructor stub
		super(4);
		this.name=name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println(getName()+" is play");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(getName()+" is eat");
	}

}
