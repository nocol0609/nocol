package com.nocol.object;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*  Object��ķ�����
 * 
 *    D��public boolean equals(Object obj):ָʾ����ĳ�������Ƿ���˶�����ȡ��� 
 *       ���������Ĭ������±Ƚϵ��ǵ�ֵַ �� //   ָequals()����δ��дʱ
 *       �Ƚϵ�ֵַһ����˵���岻����������Ҫ��д�÷�����
 *       ��ô��д��?
 * 		              һ�㶼�������Ƚ϶���ĳ�Ա����ֵ�Ƿ���ͬ��
 * 
 *            ��д�Ĵ����Ż������Ч�ʣ���߳���Ľ�׳�ԡ�
 *       ���հ棺
 * 		               ��ʵ�����Զ����ɡ�
 *
 * ��Դ�룺
 * 		public boolean equals(Object obj) {
 * 			//this - s1
 * 			//obj - s2 
 *       	return (this == obj);
 *   	}
 * 
 * ==:
 * 		�������ͣ��Ƚϵľ���ֵ�Ƿ���ͬ
 * 		�������ͣ��Ƚϵľ��ǵ�ֵַ�Ƿ���ͬ
 * equals:
 * 		�������ͣ�Ĭ������£��Ƚϵ��ǵ�ֵַ��
 * 		���������ǿ��Ը�������Լ���д�÷�����һ����д�����Զ����ɣ��Ƚ϶���ĳ�Ա����ֵ�Ƿ���ͬ
 */
//����ѧ����
class Student3 {
	private String name;
	private int age;

	public Student3() {
		super();
	}

	public Student3(String name, int age) {
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

   //��д����Object��equals()���������Զ����ɣ�
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student3 other = (Student3) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
//  ��д����Object��equals()���������ֶ��򻯰棩

//	public boolean equals(Object obj) {
//		// return true;
//		//����Ҫ�Ľ�����������Ƚϵĳ�Ա��������������true����false
//		//������ʵҪ�ȼ۵ľ���name��age
//		//���ǣ�name��String���͵ģ���String���������͵ģ����ԣ������ﲻ��ֱ����==�Ƚϣ�Ӧ����equals()�Ƚ�
//		//String��equals()��������д��Object��ģ��Ƚϵ����ַ����������Ƿ���ͬ
//		//this -- s1
//		//obj -- s2
//		//����Ҫʹ�õ���ѧ��������г�Ա����,����Ҫ����ת��
//		Student3 s = (Student3)obj;  //s -- obj -- s2;
//		if(this.name.equals(s.name) && this.age == s.age) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//  ��д����Object��equals()���������ֶ����հ棩

//	public boolean equals(Object obj) {
//		//Ϊ�����Ч��
//		if(this == obj){
//			return true;
//		}
//		
//		//Ϊ���ṩ����Ľ�׳��
//		//�����ж�һ�£�obj�ǲ���ѧ����һ����������ǣ���������ת�ͣ�������ǣ�ֱ�ӷ���false��
//		//���ʱ������Ҫ�жϵ��Ƕ����Ƿ���ĳ����Ķ���?
//		//��סһ����ʽ�������� instanceof ����
//		//��ʾ���жϸö������Ƿ��Ǹ�����һ������
//		if(!(obj instanceof Student3)){
//			return false;
//		}
//		//����Ǿͼ���
//		
//		Student3 s = (Student3)obj;
//		//System.out.println("ͬһ�����󣬻���Ҫ����ת�Ͳ��Ƚ���?");
//		return this.name.equals(s.name) && this.age == s.age;
//	}
	
}
//���������
public class EqualsDemo {
	public static void main(String[] args) {
		Student3 s1 = new Student3("��˧��", 27);
		Student3 s2 = new Student3("��˧��", 27);
		System.out.println(s1 == s2); //  �Ƚ�������ĵ�ֵַ�����Է���false
		Student3 s3 = s1;
		System.out.println(s1 == s3);// true
		System.out.println("---------------");

		System.out.println(s1.equals(s2)); // obj = s2; // ��equals()����δ��дʱ��ӡfalse����д��δtrue
		System.out.println(s1.equals(s1)); // true
		System.out.println(s1.equals(s3)); // true
		Student3 s4 = new Student3("������",30);
		System.out.println(s1.equals(s4)); //false   //s1��s4�ĳ�Ա����ֵ��һ��
		
		Demo d = new Demo();
		System.out.println(s1.equals(d)); //ClassCastException  Demo�����d������Student3 �Ķ��󣬾��жϺ�
                                          //����false
	}
}
class Demo {}
