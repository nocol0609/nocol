package com.nocol.object;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*  Object��ķ�����
 *     E:    protected void finalize()��������������ȷ�������ڶԸö���ĸ�������ʱ��
 *                            �ɶ�����������������ô˷����������������գ�����ʲôʱ����ղ�ȷ����
 *                            
 *     F:	 protected Object clone():���������ش˶����һ������,������Ҫ��д�÷�����ʵ�ֶ�object�������Ŀ�¡
 *		    
 *
 *       Cloneable:����ʵ���� Cloneable �ӿڣ���ָʾ Object.clone() �������ԺϷ��ضԸ���ʵ�����а��ֶθ��ơ� 
 *  	   ����ӿ��Ǳ�ǽӿڣ���������ʵ�ָýӿڵ���Ϳ���ʵ�ֶ���ĸ����ˡ�
 *       //�ýӿ��޳��󷽷�
 */
// ����ѧ����
class Student4 implements Cloneable { // ʵ�ִ��ӿ���ָʾ Object.clone()�������ԺϷ��ضԸ���ʵ�����а��ֶθ���
										
	private String name;
	private int age;

	public Student4() {
		super();
	}

	public Student4(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// ��дObject���clong()����
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
//���������
public class CloneDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		// ����ѧ������
		Student4 s = new Student4();
		s.setName("��˧��");
		s.setAge(30);

		// ��¡ѧ������
		Object obj = s.clone(); // protected Object clone();������������ֵ�����ظ������������ Object obj����
		Student4 s2 = (Student4) obj;  // ��¡��ѧ������ԭ��ѧ��
		System.out.println("---------");

		System.out.println(s.getName() + "---" + s.getAge());
		System.out.println(s2.getName() + "---" + s2.getAge());

		// ��ǰ������
		Student4 s3 = s;
		System.out.println(s3.getName() + "---" + s3.getAge());
		System.out.println("---------");

		// ��ʵ��������ģ���¡��Ķ�����ԭ�����޹����ˣ���ԭ������޸Ĳ���Կ�¡��Ķ������Ӱ��
		s3.setName("С˧��");
		s3.setAge(20);
		System.out.println(s.getName() + "---" + s.getAge());
		System.out.println(s2.getName() + "---" + s2.getAge());
		System.out.println(s3.getName() + "---" + s3.getAge());

	}
}
