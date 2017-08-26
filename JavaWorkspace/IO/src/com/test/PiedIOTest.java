package com.test;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

//取
class Print extends Thread {

	private PipedInputStream pis;

	public Print(PipedInputStream pis) {
		// TODO Auto-generated constructor stub
		this.pis = pis;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			int val = pis.read();
			System.out.println("1--100之间所有数的和为：" + val);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
//造
class Caculate extends Thread {

	private PipedOutputStream pos;

	public Caculate(PipedOutputStream pos) {
		// TODO Auto-generated constructor stub
		this.pos = pos;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}

		try {
			pos.write(sum);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

public class PiedIOTest {
	public static void main(String[] args) throws IOException {
		
		PipedInputStream pis=new PipedInputStream();
		PipedOutputStream pos=new PipedOutputStream(pis);
		
		Print print=new Print(pis);
		Caculate caculate=new Caculate(pos);
		
		print.start();
		caculate.start();
	}
}
