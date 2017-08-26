package com.test_collection_07;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTestInner {

	static class Inner {

		public TreeSet<String> shunxu(String[] s) {

			TreeSet<String> t1 = new TreeSet<String>();

			for (int i = 0; i < 6; i++) {
				t1.add(s[i]);
			}
			return t1;
		}

		public TreeSet<String> daoxu(String[] s) {
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
				t2.add(s[i]);
			}
			return t2;
		}

	}

	public static void main(String[] args) {

		String[] s = { "HashSet", "ArrayList", "TreeMap", "HashMap", "TreeSet", "LinkedList" };
		Inner inner = new Inner();
		inner.shunxu(s);
		inner.daoxu(s);

		System.out.println("Ë³Ðò£º" + inner.shunxu(s));
		System.out.println("µ¹Ðò£º" + inner.daoxu(s));
	}
}
