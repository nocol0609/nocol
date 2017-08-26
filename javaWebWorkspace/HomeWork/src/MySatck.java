
public class MySatck {
	private long[] arr;
	private int top;

	public MySatck() {
		// TODO Auto-generated constructor stub
		arr = new long[10];
		top = -1;
	}

	public MySatck(int maxsize) {
		arr = new long[maxsize];
		top = -1;
	}

	public void push(long value) {
		arr[++top] = value;
	}

	public long pop() {
		return arr[top--];
	}

	public long peek() {
		return arr[top];
	}
}
