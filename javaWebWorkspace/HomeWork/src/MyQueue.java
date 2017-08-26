
public class MyQueue {
	private long[] arr;
	private int elements;
	private int front;
	private int end;

	public MyQueue() {
		// TODO Auto-generated constructor stub
		arr = new long[10];
		elements = 0;
		front = 0;
		end = -1;
	}

	public MyQueue(int maxsize) {
		arr = new long[maxsize];
		elements = 0;
		front = 0;
		end = -1;
	}

	// 从对尾插入
	public void insert(long value) {
		arr[++end] = value;
		elements++;
	}

	// 从对头移除
	public long remove() {
		elements--;
		return arr[front++];
	}
	
	//查看数据，从对头查看
	public long peek(){
		return arr[front];
	}
	
	public boolean isEmpty(){
		return elements==0;
	}
	
	public boolean isFull(){
		return elements==arr.length;
	}
	
	public static void main(String[] args) {
		MyQueue queue=new MyQueue(5);
		queue.insert(5);
		queue.insert(2);
		queue.insert(9);
		queue.insert(1);
		queue.insert(11);
		
		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());
		
		while(!queue.isEmpty()){
			System.out.println(queue.remove());
		}
		
		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());
	}
}
