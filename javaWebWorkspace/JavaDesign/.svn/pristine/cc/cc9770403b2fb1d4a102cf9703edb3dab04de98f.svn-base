package test;

public class test2 {

	public int test(int i, int j, int k) {

		int count = 0;
		if (i > 0) {
			test(i - 1, j, k * 2);
		}

		if (j > 1) {
			test(i, j - 1, k - 1);
		}

		if (i == 0 && j == 1 && k == 1) {
			count++;
		}
		return count;
	}

	public static void main(String[] args) {

		test2 t = new test2();
		int num = t.test(5, 10, 2);
		System.out.println(num);
	}
}
