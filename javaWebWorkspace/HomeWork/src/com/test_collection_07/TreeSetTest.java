package com.test_collection_07;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});

		for (int i = 1; i <= 10; i++) {
			treeSet.add(i);
		}

		System.out.println(treeSet);
	}
}
