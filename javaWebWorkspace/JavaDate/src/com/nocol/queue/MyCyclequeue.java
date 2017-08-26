package com.nocol.queue;

/**
 * �Զ���ѭ������
 * 
 * @author Nocol ����8:52:52
 */
public class MyCyclequeue {
	private long[] arr; // �ײ�����ʵ��
	private int elements; // ��Ч���ݵĳ���
	private int front; // ��ͷ
	private int end; // ��β

	/*
	 * Ĭ�Ϲ�����
	 */
	public MyCyclequeue() {
		arr = new long[10];
		elements = 0;
		front = 0;
		end = -1;
	}

	/**
	 * ���ι�����
	 */
	public MyCyclequeue(int maxsize) {
		arr = new long[maxsize];
		elements = 0;
		front = 0;
		end = -1;
	}

	/**
	 * ���----�Ӷ�β���
	 */
	public void insert(long value) {
		
		if (end == arr.length - 1) {
			end = -1; // ����β�������鳤�ȼ�1,˵����������������β����ָ��-1���ſ��Լ�������
		}

		arr[++end] = value; // ����һ��Ԫ��Ϊarr[0]=value
		elements++;
	}

	/**
	 * ����----�Ӷ�ͷ����
	 */
	public long remove() {

		// ��ȡҪɾ��������
		long value = arr[front++];

		if (front == arr.length) {
			front = 0;    //����ͷ�������鳤�ȣ�
		}

		elements--;
		return value;
	}

	/**
	 * �鿴Ԫ��-----�Ӷ�ͷ�鿴
	 */
	public long peek() {

		return arr[front];
	}

	/**
	 * �ж϶��Ƿ�Ϊ��
	 */
	public boolean isEmpty() {
		return elements == 0;
	}

	/**
	 * �ж϶��Ƿ�����
	 */
	public boolean isFull() {
		return elements == arr.length;
	}

}
