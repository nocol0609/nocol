package test;

import java.util.Arrays;

public class test1 {
	public static void main(String[] args) {
		test t = new test();
		int[] arr = { 7, 3, 4, 6, 1, 2, 5 };
		System.out.println(Arrays.toString(arr));
		// t.heap(arr);
		// t.mege(arr, 0, 6);
		t.quick(arr, 0, 6);
		System.out.println(Arrays.toString(arr));
	}
}