import java.util.Arrays;

import javax.print.attribute.standard.MediaName;

public class MyList2 {
	private long[] arr;
	private int elements;

	public MyList2() {
		arr = new long[10];
	}

	public MyList2(int maxsize) {
		arr = new long[maxsize];
	}

	public void add(long value) {

		ensureCapacity();

		int i;
		for (i = 0; i < elements; i++) {
			if (arr[i] > value) {
				break;
			}
		}

		for (int j = elements; j > i; j--) {
			arr[j] = arr[j - 1];
		}

		arr[i] = value;
		elements++;

	}

	private void ensureCapacity() {
		// TODO Auto-generated method stub
		if (elements == arr.length - 1) {
			arr = Arrays.copyOf(arr, arr.length * 2);
		}
	}

	public void display() {
		System.out.print("[");
		for (int i = 0; i < elements; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("]");
	}

	public int binarySeach(long value) {

		int low = 0;
		int pow = elements;
		int mid = 0;

		while (true) {
			mid = (low + pow) / 2;
			if (arr[mid] == value) {
				return mid;
			} else if (low > pow) {
				return -1;
			} else {
				if (arr[mid] > value) {
					pow = mid - 1;
				} else {
					low = mid + 1;
				}
			}
		}

	}

	public int Search(long value) {
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
		if (index == elements && index < elements) {
			throw new IndexOutOfBoundsException();
		} else {
			return arr[index];
		}

	}

	public void remove(int index) {
		if (index == elements && index < elements) {
			throw new IndexOutOfBoundsException();
		} else {
			for (int i = index; i > 0; i--) {
				arr[i] = arr[i + 1];
			}
			elements--;
		}
	}

	public void change(int index, long newValue) {
		if (index == elements && index < elements) {
			throw new IndexOutOfBoundsException();
		} else {
			arr[index] = newValue;
		}
	}

	public static void main(String[] args) {
		MyList2 list2 = new MyList2();

		list2.add(8);
		list2.add(1);
		list2.add(6);
		list2.add(2);
		list2.add(5);
		list2.add(1);
		list2.add(9);

		list2.display();
		
		System.out.println(list2.get(5));

	}
}
