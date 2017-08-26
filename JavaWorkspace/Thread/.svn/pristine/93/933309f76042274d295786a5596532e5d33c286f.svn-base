package com.test;

class A {
}

class B {
}

class DeadLockThread extends Thread {
	private A a;
	private B b;

	public DeadLockThread(A a, B b) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (a) {
			System.out.println(getName()+"拿到了a资源");
			try {
				sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (b) {
				System.out.println(getName()+"拿到了b资源");
			}
		}
	}
}


class DeadLockThread1 extends Thread {
	private A a;
	private B b;

	public DeadLockThread1(A a, B b) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (b) {
			System.out.println(getName()+"拿到了b资源");
			try {
				sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (a) {
				System.out.println(getName()+"拿到了a资源");
			}
		}
	}
}

public class DeadLock {
	public static void main(String[] args) {

		A a = new A();
		B b = new B();

		DeadLockThread t1 = new DeadLockThread(a,b);
		DeadLockThread1 t2 = new DeadLockThread1(a,b);

		t1.start(); 
		t2.start();
	}
}
