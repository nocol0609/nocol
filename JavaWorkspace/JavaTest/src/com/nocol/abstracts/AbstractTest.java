package com.nocol.abstracts;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
// ����ӿ�
interface Jumpping {
	public abstract void jump();
}

// �������
abstract class Animal {
	public abstract void eat();
}

// �����������
class Dog extends Animal implements Jumpping {

	public void jump() {   //ʵ���ࣨDog����д�ӿڵĳ��󷽷�
		System.out.println("jumpping dog");
	}

	public void eat() {    //���ࣨDog����д������ĳ��󷽷�
		System.out.println("dog eat");
	}
}

// ������
public class AbstractTest {
	public static void main(String[] args) {
		Animal a = new Dog(); // ����ת�ͣ���̬
		a.eat(); // ��ӡ������д�������ķ���
		System.out.println("------------------------");
		// ʵ�����ߵķ���
		// ��ԭDog
		Dog d = (Dog) a;
		d.eat();
		d.jump();                  
	}
}
