package com.nocol.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
class Student1 implements Serializable {
	private String name;
	private int age;

	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}

public class ObjectTest {
	public static void main(String[] args) {
		//write("test.txt");
		read("test.txt");
	}

	public static void write(String path) {
		try {
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
			Student1 student = new Student1();
			oos.writeObject(student);
			oos.flush();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void read(String path) {
		try {
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream(path));
			Student1 s=(Student1)ois.readObject();		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
