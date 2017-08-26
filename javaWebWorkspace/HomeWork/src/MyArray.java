import java.util.Arrays;

public class MyArray {
	private long[] arr;
	private int elements;// 有效数据的长度,初始值为0

	public MyArray() {
		// TODO Auto-generated constructor stub
		arr = new long[50];
	}

	public MyArray(int maxsize) {
		arr = new long[maxsize];
	}

	public void insert(long value) {
		ensureCapacity();
		arr[elements] = value;
		elements++;
	}

	public void display() {
		System.out.print("[");
		for (int i = 0; i < elements; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}

	public int search(long value) {

		int i;

		for (i = 0; i < elements; i++) {
			if (arr[i] == value) {
				break;
			}
		}

		if (i == elements) {
			return -1;
		} else {
			return i;
		}
	}

	public long get(int index) {
		if (index == elements || index < 0) {
			throw new IndexOutOfBoundsException();
		} else {
			return arr[index];
		}
	}

	public void delete(int index) {
		if (index == elements || index < 0) {
			throw new IndexOutOfBoundsException();
		} else {
			for (int i = index; i > 0; i--) {
				arr[i] = arr[i + 1];
			}

			elements--;
		}
	}

	public void change(int index, long newValue) {
		if (index == elements || index < 0) {
			throw new IndexOutOfBoundsException();
		} else {
			arr[index] = newValue;
		}
	}

	private void ensureCapacity() {
		// TODO Auto-generated method stub
		if (elements == arr.length - 1) {
			arr = Arrays.copyOf(arr, arr.length * 2);
		}
	}

	public static void main(String[] args) {
		MyArray array = new MyArray(50);
		array.insert(7);
		array.insert(5);
		array.insert(26);
		array.insert(15);

		array.display();
		
		System.out.println(array.search(26));
		System.out.println(array.get(3));
	}
}
