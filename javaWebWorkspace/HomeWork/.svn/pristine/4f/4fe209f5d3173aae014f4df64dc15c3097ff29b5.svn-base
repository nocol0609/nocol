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
 * 1.使用IO流读取a.txt文件中的内容
2.文件中的每行数据表示一个学生的信息 例如:1:tom:20  表示id是1 名字是tom 年龄是20
3.每读一行就创建一个学生对象，把拿到的值放到相应的属性里面
4.把创建出的所有学生对象放到一个List类型的集合中
5.把这个集合对象序列化到一个文件里面 比如 list.bak文件
6.再写一个类测试读取出list.bak文件的中的集合对象，并且遍历输出每个集合中的对象的属性值 
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
