package com.nocol.sendtest;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.List;

import com.briup.gather.Gather;
import com.nocol.bean.BIDR;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
public class SendTest {
	public static void main(String[] args) {
		PipedInputStream pis = new PipedInputStream();
		try {
			PipedOutputStream pos = new PipedOutputStream(pis);
			new Sender(pos, "发送方").start();
			new Fecher(pis, "接收方").start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

// 发送者
class Sender extends Thread {

	PipedOutputStream pos = null;

	public Sender(PipedOutputStream pos, String name) {
		this.pos = pos;
		setName(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		List<BIDR> list = null;
		try {
			//list = (List<BIDR>) new Gather().gather("radwtmp_test");
			ObjectOutputStream oos = new ObjectOutputStream(pos);
			oos.writeObject(list);
			oos.flush();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

// 接收者
class Fecher extends Thread {
	PipedInputStream pis = null;

	public Fecher(PipedInputStream pis, String name) {
		this.pis = pis;
		setName(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			// 对象流
			ObjectInputStream ois = new ObjectInputStream(pis);
			List<BIDR> list = (List<BIDR>) ois.readObject();
			System.out.println("接收完毕！打印输出");
			for (BIDR bidr : list) {
				System.out.println(bidr);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}