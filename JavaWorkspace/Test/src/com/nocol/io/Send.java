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
			PipedOutputStream pos = new PipedOutputStream(pis);//�ܵ�������͹ܵ���������������
			new Sender(pos, "���ͷ�").start();
			new Fecher(pis, "���շ�").start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
//������
class Sender extends Thread {
	//�ܵ������
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
			ObjectOutputStream oos = new ObjectOutputStream(pos);//�����������װ�ܵ������
			oos.writeObject(list);
			oos.flush();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

//������
class Fecher extends Thread {
	//�ܵ�������
	PipedInputStream pis = null;

	public Fecher(PipedInputStream pis, String name) {
		this.pis = pis;
		setName(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			// ������
			ObjectInputStream ois = new ObjectInputStream(pis);//������������װ�ܵ�������
			List<Student> list = (List<Student>) ois.readObject();
			System.out.println("������ϣ���ӡ���");
			for (Student student : list) {
				System.out.println(student);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}