package com.nocol.extend;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
class A {
	public String show(D obj) {
		return ("A and D");
	}

	public String show(A obj) {
		return ("A and A");
	}

}

class B extends A {
	public String show(B obj) {
		return ("B and B");
	}

	public String show(A obj) {
		return ("B and A");
	}
}

class C extends B {

}

class D extends B {

}

public class Test_DuoTai {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B();
		B b = new B();
		C c = new C();
		D d = new D();

		System.out.println("1--" + a1.show(b)); // 1--A and A
		System.out.println("2--" + a1.show(c)); // 2--A and A
		System.out.println("3--" + a1.show(d)); // 3--A and D
		System.out.println("4--" + a2.show(b)); // 4--B and A
		System.out.println("5--" + a2.show(c)); // 5--B and A
		System.out.println("6--" + a2.show(d)); // 6--A and D
		System.out.println("7--" + b.show(b)); // 7--B and B
		System.out.println("8--" + b.show(c)); // 8--B and B
		System.out.println("9--" + b.show(d)); // 9--A and D
	}
}
/*
 * 1.���������ȿ�һ�仰��������������ñ��������������ʱ�������ö�������Ͷ��������ñ��������;����˵���˭�ĳ�Ա������
 *   ������������õķ����������ڳ����ж�����ģ�Ҳ����˵�����า�ǵķ�����
 *   ��仰�Զ�̬������һ����������ʵ�ڼ̳����ж��󷽷��ĵ��ô���һ�����ȼ���
 *   this.show(O)��super.show(O)��this.show((super)O)��super.show((super)O)��
 *   
 * 2.�������Ƿ���5��a2.show(c)��a2��A���͵����ñ���������this�ʹ�����A��a2.show(c),����A�����ҷ���û���ҵ���
 *   ���ǵ�A�ĳ�������(super)������Aû�г��ࣨObject���⣩������������������Ҳ����this.show((super)O)��
 *   C�ĳ�����B��A������(super)OΪB��A��thisͬ����A��������A���ҵ���show(A obj)��
 *   ͬʱ����a2��B���һ��������B����д��show(A obj)��������ջ��������B���show(A obj)���������Ҳ����B and A��
 * 
 * 3.�����Ѿ��ҵ��˵����������ﻹ�Ǵ���һ�����ʣ����ǻ���������仰��������������ñ��������������ʱ��
 * �����ö�������Ͷ��������ñ��������;����˵���˭�ĳ�Ա������������������õķ����������ڳ����ж�����ģ�
 * Ҳ����˵�����า�ǵķ�������������һ��������˵����仰������ĺ��壺a2.show(b)��
 * 
 * 4.����a2�����ñ�����ΪA���ͣ������õ���B������˰��������Ǿ仰����˼��˵��B����������˭�ķ���,
 * ����a2.show(b)Ӧ��Ҫ����B�е�show(B obj)�������Ľ��Ӧ���ǡ�B and B��������Ϊʲô����ǰ������н�����������أ�
 * �������Ǻ����˺����Ǿ仰��������������õķ����������ڳ����ж�����ġ�����ôshow(B obj)��A���д����𣿸����Ͳ����ڣ�
 * ������仰�����ﲻ���ã���ô�ѵ�����仰�����ˣ���Ҳ����ʵ��仰����������仰������ȻҪ���ռ̳����е��÷��������ȼ���ȷ�ϡ�
 * �������Ż���A�����ҵ�show(A obj)��ͬʱ����B��д�˸÷������ԲŻ����B���еķ���������ͻ����A���еķ�����
 * 
 * 5.���Զ�̬������ѭ��ԭ�����Ϊ��������������ñ��������������ʱ�������ö�������Ͷ��������ñ��������;����˵���˭�ĳ�Ա������
 * ������������õķ����������ڳ����ж�����ģ�Ҳ����˵�����า�ǵķ�������������ȻҪ���ݼ̳����з������õ����ȼ���ȷ�Ϸ�����
 * �����ȼ�Ϊ��this.show(O)��super.show(O)��this.show((super)O)��super.show((super)O)��
 * 
 */
