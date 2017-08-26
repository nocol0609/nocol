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
		oos.writeObject(student);//�Ѷ�����Ķ���״̬�־û��ˣ������ٸı�
		student.setName("jack");
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Object"));
		
		Object object = ois.readObject();//δִ�й����������ڴ��з����л�������	
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
