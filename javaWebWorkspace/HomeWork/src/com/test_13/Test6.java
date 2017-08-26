package com.test_13;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
 * 1.ʹ��IO����ȡa.txt�ļ��е�����
2.�ļ��е�ÿ�����ݱ�ʾһ��ѧ������Ϣ ����:1:tom:20  ��ʾid��1 ������tom ������20
3.ÿ��һ�оʹ���һ��ѧ�����󣬰��õ���ֵ�ŵ���Ӧ����������
4.�Ѵ�����������ѧ������ŵ�һ��List���͵ļ�����
5.��������϶������л���һ���ļ����� ���� list.bak�ļ�
6.��дһ������Զ�ȡ��list.bak�ļ����еļ��϶��󣬲��ұ������ÿ�������еĶ��������ֵ 
 */
public class Test6 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("a2.txt"));
		String line = null;
		String[] str = null;
		List<Student> list = new ArrayList<Student>();
		while ((line = br.readLine()) != null) {
			str = line.split(":");
			Student student = new Student();
			student.setId(Integer.parseInt(str[0]));
			student.setName(str[1]);
			student.setAge(Integer.parseInt(str[2]));
			list.add(student);
		}
		br.close();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("list.bak"));
		for (Student student : list) {
			oos.writeObject(student);
		}
		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("list.bak"));

		// List<Student> list2 = (List<Student>) ois.readObject();
		// for (Student student : list2) {
		// System.out.println(student);
		// }

		for (int i = 0; i < list.size(); i++) {
			Object object = ois.readObject();
			System.out.println(object);
		}
		ois.close();
	}
}
