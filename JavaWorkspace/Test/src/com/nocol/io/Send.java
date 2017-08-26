package com.nocol.io;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.List;

import com.nocol.io.Student;
import com.nocol.io.Gather;


/**
* @author lxp
*
* @TODO 
* 
*/
public class Send {
	public static void main(String[] args) {
		PipedInputStream pis = new PipedInputStream();
		try {
			PipedOutputStream pos = new PipedOutputStream(pis);//管道输出流和管道输入流建立连接
			new Sender(pos, "发送方").start();
			new Fecher(pis, "接收方").start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
//发送者
class Sender extends Thread {
	//管道输出流
	PipedOutputStream pos = null;

	public Sender(PipedOutputStream pos, String name) {
		this.pos = pos;
		setName(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		List<Student> list=null;
		try {
			list = (List<Student>) new Gather().gather("a.txt");
			ObjectOutputStream oos = new ObjectOutputStream(pos);//对象输出流包装管道输出流
			oos.writeObject(list);
			oos.flush();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

//接收者
class Fecher extends Thread {
	//管道输入流
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
			ObjectInputStream ois = new ObjectInputStream(pis);//对象输入流包装管道输入流
			List<Student> list = (List<Student>) ois.readObject();
			System.out.println("接收完毕！打印输出");
			for (Student student : list) {
				System.out.println(student);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}