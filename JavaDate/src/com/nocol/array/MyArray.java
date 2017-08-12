package com.nocol.array;

/**
 * ʹ���Զ������������з�װ��ʵ�����ݵ���ɾ�Ĳ�  --------------��������
 * 
 * @author Nocol ����1:14:35
 */
public class MyArray {

	// �Զ�������
	private long[] arr;
	// ������Ч���ݵĳ���
	private int elements; // ��ʼΪ0

	public MyArray() {
		arr = new long[50]; // ��ʼ�����鳤��Ϊ50
	}

	public MyArray(int maxsize) {  //����Ϊ�����ʼ����С
		arr = new long[maxsize];
	}

	/**
	 * �������
	 */
	public void insert(long value) {
		arr[elements] = value;
		elements++; // ������ݺ���������
	}

	/**
	 * ��ʾ����
	 */
	public void display() {
		System.out.print("[");
		for (int i = 0; i < elements; i++) { // ֻ��ʾ��Ч����
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}

	/**
	 * �������ݣ�����ֵ���ҷ��ظ���������
	 */
	public int search(long value) {

		int i;
		for (i = 0; i < elements; i++) { // ����Ч�������в���  -------���Բ���
			if (value == arr[i]) {
				break;
			}
		}

		if (i == elements) {
			return -1;
		} else {
			return i;
		}
	}

	/**
	 * �������ݣ�������������
	 */
	public long get(int index) {
		if (index >= elements || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			return arr[index];
		}
	}

	/**
	 * ɾ������
	 */
	public void delete(int index) {
		if (index >= elements || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			for (int i = index; i < elements; i++) {
				arr[i] = arr[i + 1];
			}
			elements--; // ɾ������Ч���ݳ����Լ�
		}
	}

	/**
	 * ��������
	 */
	public void change(int index,long newValue) {
		if (index >= elements || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			arr[index]=newValue;
		}
	}
}
