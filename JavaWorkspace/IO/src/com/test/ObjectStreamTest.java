package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//15062465004
public class ObjectStreamTest {
	public static void main(String[] args) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Object"));
		Student student = new Student(1, "Tom", "F");
		oos.writeObject(student);//已对输出的对象状态持久化了，不会再改变
		student.setName("jack");
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Object"));
		
		Object object = ois.readObject();//未执行构造器，在内存中方序列化读出来	
		System.out.println(object);
		
		System.out.println(object==student);//false
		
		if (object instanceof Student) {
			Student student2 = (Student) object;
			System.out.println(student2);
			System.out.println(object==student2);//true
		}
		
		ois.close();
	}
}
