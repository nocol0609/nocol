package com.test_collection_08;

public class ArrayList<String> implements List<String> {

	private int size;// 数组大小
	private Object[] items;
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean add(Object value) {
		// TODO Auto-generated method stub
		add(size, value);// 这里的size其实就是list所拥有的最大索引+1
		return true;
	}

	// 往list中添加值,在index位置处添加value
	@Override
	public void add(int index, Object value) {
		ensureCapacity(index);
		for (int i = index; i < size; i++) {
			items[i + 1] = items[i];// 将添加位置以后的数据向后移动
		}
		items[index] = value;// 设置添加位置的值
		size++;// 列表的大小增加1
	}

	// 判断数组大小、扩容
	public void ensureCapacity(int newCapacity) {
		if (newCapacity < size) {
			return;
		} else {// 如果需要的容量大于原先数组的容量
			Object[] old = items;// 保存原来的数组内容
			items = new Object[newCapacity + 10];// 新建一个扩容数组
			for (int i = 0; i < size; i++) {
				items[i] = old[i];// 将原来的数组中的值逐个赋值给新数组
			}
		}
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		Object removeItem = items[index];// 获取删除位置的原来的值
		for (int i = index; i <size - 1; i++) {
			items[i] = items[i + 1];// 将删除位置以后的数据向前移动
		}
		size--;// 列表的大小减少1
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
