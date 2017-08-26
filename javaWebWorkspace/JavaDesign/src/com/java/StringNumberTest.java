package com.java;

import java.util.HashMap;
import java.util.Set;

public class StringNumberTest {
	public static void main(String[] args) {
		String s = "�й�aadf��111��bbb�Ƶ�zz����";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			Integer number = map.get(c);
			if (number == null) {
				number = 1;
			} else {
				number = number + 1;
				map.put(c, number);
			}
		}

		/*
		 * Set<Entry<Character, Integer>> entries = map.entrySet();
		 * 
		 * for (Entry<Character, Integer> entry : entries) {
		 * System.out.println("�ַ�" + entry.getKey() + "�����ˣ�" +
		 * entry.getValue()); }
		 */

		Set<Character> keySet = map.keySet();
		for (Character c : keySet) {
			System.out.println("�ַ�" + c + "������" + map.get(c) + "��");
		}

	}
}