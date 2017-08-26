import java.util.Arrays;

public class MyList {
	private long[] arr;
	private int elements;

	public MyList() {
		// TODO Auto-generated constructor stub
		arr = new long[10];
	}

	public MyList(int maxsize) {
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

	public void display() {
		System.out.print("[");
		for (int i = 0; i < elements; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}

	public int binarySearch(long value) {
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

	private void ensureCapacity() {
		// TODO Auto-generated method stub
		if (elements == arr.length - 1) {
			arr = Arrays.copyOf(arr, 2 * arr.length);
		}
	}
	
	public static void main(String[] args) {
		MyList list=new MyList(10);
		list.add(6);
		list.add(5);
		list.add(1);
		list.add(7);
		
		list.display();
		
		System.out.println(list.binarySearch(7));
	}
}
