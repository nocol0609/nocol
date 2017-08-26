package com.test_collection_07;

import java.util.Comparator;
import java.util.TreeSet;

public class Anonymous {

	public static void main(String[] args) {

		String[] s = { "HashSet", "ArrayList", "TreeMap", "HashMap", "TreeSet", "LinkedList" };

		TreeSet<String> t1 = new TreeSet<String>();
		TreeSet<String> t2 = new TreeSet<String>(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				if (s1.compareTo(s2) > 0) {
					return -1;
				} else if (s1.compareTo(s2) == 0) {
					return 0;
				} else {
					return 1;
				}
			}
		});

		for (int i = 0; i < 6; i++) {
			t1.add(s[i]);
		}
		
		for (int i = 0; i < 6; i++) {
			t2.add(s[i]);
		}

		System.out.println("ÉýÐò" + t1);
		System.out.println("½µÐò" + t2);
	}
}
