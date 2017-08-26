package com.test_05;

public class TestAnimals {
	public static void main(String[] args) {
		Fish f = new Fish();
		Cat c = new Cat("Fluffy");
		
		Animal a = new Fish();
		Animal e = new Spider();
		Pet p = new Cat();

		f.play();
		c.play();

		e.eat();
		e.walk();

  		a.walk();
	}
}
