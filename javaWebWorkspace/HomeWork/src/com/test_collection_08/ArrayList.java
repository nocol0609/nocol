package com.test_collection_08;

public class ArrayList<String> implements List<String> {

	private int size;// �����С
	private Object[] items;
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean add(Object value) {
		// TODO Auto-generated method stub
		add(size, value);// �����size��ʵ����list��ӵ�е��������+1
		return true;
	}

	// ��list�����ֵ,��indexλ�ô����value
	@Override
	public void add(int index, Object value) {
		ensureCapacity(index);
		for (int i = index; i < size; i++) {
			items[i + 1] = items[i];// �����λ���Ժ����������ƶ�
		}
		items[index] = value;// �������λ�õ�ֵ
		size++;// �б�Ĵ�С����1
	}

	// �ж������С������
	public void ensureCapacity(int newCapacity) {
		if (newCapacity < size) {
			return;
		} else {// �����Ҫ����������ԭ�����������
			Object[] old = items;// ����ԭ������������
			items = new Object[newCapacity + 10];// �½�һ����������
			for (int i = 0; i < size; i++) {
				items[i] = old[i];// ��ԭ���������е�ֵ�����ֵ��������
			}
		}
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		Object removeItem = items[index];// ��ȡɾ��λ�õ�ԭ����ֵ
		for (int i = index; i <size - 1; i++) {
			items[i] = items[i + 1];// ��ɾ��λ���Ժ��������ǰ�ƶ�
		}
		size--;// �б�Ĵ�С����1
		return removeItem;
	}

	
	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return (Iterator<String>) new ArrayListIterator(items, null, size);
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		if (index < 0 || index >= size()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return items[index];
	}
}
