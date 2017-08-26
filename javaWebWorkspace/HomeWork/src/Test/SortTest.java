package Test;

public class SortTest {

	public void sortCore(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int j = i;
			if (j > 0 && arr[i] < arr[j - 1]) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = arr[i];
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 8, 9, 4, 7, 4, 3 };
		SortTest st = new SortTest();
		st.sortCore(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
