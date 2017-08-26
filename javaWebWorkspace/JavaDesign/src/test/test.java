package test;

public class test {

	public void quick(int[] arr, int l, int r) {
		if (l < r) {
			int i = l;
			int j = r;
			int key = arr[l];

			while (i < j) {

				while (i < j && arr[j] >= key) {
					j--;
				}
				arr[i] = arr[j];

				while (i < j && arr[i] <= key) {
					i++;
				}
				arr[j] = arr[i];
			}
			arr[i] = key;

			quick(arr, l, i - 1);
			quick(arr, i + 1, r);
		}
	}

	public void mege(int[] arr, int l, int r) {
		if (l < r) {
			int mid = (l + r) / 2;
			mege(arr, l, mid);
			mege(arr, mid + 1, r);

			megeArray(arr, l, mid, r);
		}
	}

	private void megeArray(int[] arr, int l, int mid, int r) {
		// TODO Auto-generated method stub
		int i = l;
		int j = mid + 1;
		int temp[] = new int[arr.length];
		int k = 0;

		while (i <= mid && j <= r) {
			if (arr[i] < arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}
		}

		while (i <= mid) {
			temp[k++] = arr[i++];
		}

		while (j <= r) {
			temp[k++] = arr[j++];
		}

		for (i = l, k = 0; i <= r; k++, i++) {
			arr[i] = temp[k];
		}

	}

	public void heap(int[] arr) {
		for (int i = arr.length / 2; i >= 0; i--) {
			heapAdjust(arr, i, arr.length);
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;

			heapAdjust(arr, 0, i);
		}

	}

	private void heapAdjust(int[] arr, int parent, int length) {
		// TODO Auto-generated method stub
		int temp = arr[parent];
		int child = 2 * parent + 1;
		while (child < length) {
			if (child + 1 < length && arr[child + 1] > arr[child]) {
				child++;
			}
			if (arr[child] < temp) {
				break;
			} else {
				arr[parent] = arr[child];
			}

			parent = child;
			child = 2 * child + 1;
		}
		arr[parent] = temp;
	}
}
