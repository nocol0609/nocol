package test2;

public class StudentManager implements SMSList {

	private Student[] stus;
	private int count = 0;

	public StudentManager() {
		stus = new Student[10];
	}

	public StudentManager(int length) {
		stus = new Student[length];
	}

	@Override
	public void addLast(Student stu) {
		// TODO Auto-generated method stub
		ensureCapacity();
		add(count, stu);
	}

	@Override
	public void addFirst(Student stu) {
		// TODO Auto-generated method stub
		ensureCapacity();
		add(0, stu);
	}

	// 判断容量,扩容
	private void ensureCapacity() {
		if (count >= stus.length) {
			Student[] newContainer = new Student[count + 10];
			System.arraycopy(stus, 0, newContainer, 0, stus.length);
			stus = newContainer;
		}
	}

	@Override
	public void add(int index, Student stu) {
		// TODO Auto-generated method stub

		if (index < 0) {
			throw new RuntimeException("无效的索引");
		}
		if (index > count) {
			index = count;
		}
		// 判断容量是否足够,扩容
		ensureCapacity();
		// 将index之后所有的数据向后移动
		for (int i = count; i > index; i--) {
			stus[i] = stus[i - 1];
		}
		stus[index] = stu;
		count++;

	}

	@Override
	public Student get(int index) {
		// TODO Auto-generated method stub
		if (index < 0 || index >= count) {
			return null;
		} else {
			Student student = stus[index];
			return student;
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public void set(int index, Student stu) {
		// TODO Auto-generated method stub
		if (index < 0 || index >= count) return;
		stus[index] = stu;
	}

	@Override
	public Student remove(int index) {
		// TODO Auto-generated method stub
		
		if (index < 0 || index >= count){
			System.out.println("删除位置不合理");
			return null;
		}
		Student student = stus[index];
		if (count > 0) {
			for (int i = index; i < count - 1; i++) {
				stus[i] = stus[i + 1];
			}
//			stus[count-1]=null;
//			count--;
			stus[--count]=null;
		} else {
			student = null;
		}
		return student;
	}

	@Override
	public Student removeFirst() {
		// TODO Auto-generated method stub
		return remove(0);
	}

	@Override
	public Student removeLast() {
		// TODO Auto-generated method stub
		return remove(count-1);
		
	}
	
	
}
