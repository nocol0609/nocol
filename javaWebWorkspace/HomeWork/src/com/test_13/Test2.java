package com.test_13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * 写PropertiesFile类
要求：
在message文件中存放prop_name=prop_value格式的属性，
每行存放一个属性。输入一个属性名，找出其对应的属性值并输出。

 */
public class Test2 {
	public static void main(String[] args) throws Exception {
		// 读取源文件
		BufferedReader br = new BufferedReader(new FileReader("message.txt"));
		String line = null;
		Map<String, String> map = new HashMap<String, String>();
		String[] str = null;

		System.out.println("请输入属性名：");
		Scanner sc = new Scanner(System.in);
		String k = sc.nextLine();
		sc.close();

		while ((line = br.readLine()) != null) { // line:name=nocol
			str = line.split("=");
			map.put(str[0], str[1]);
			System.out.println(str[0] + "---" + str[1]);
		}
		br.close();
		// 遍历map集合
		Set<String> set = map.keySet();
		for (String s : set) {
			String value = map.get(s);
			if (s.equals(k)) {
				System.out.println(k + "对应的属性值为：" + value);
			} else {
				System.out.println("找不到对应属性的值！");
			}
		}
	}
}
