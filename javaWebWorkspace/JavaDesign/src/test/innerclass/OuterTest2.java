package test.innerclass;

/**
 * @author Nocol
 *
 * @TODO
 * 
 */
/*  
 * �����ڲ��������⣺ ����Ҫ�󣬲������ 
 *             
 * interface Inter1 { 
 * 		void show();               //Ĭ�� public abstract void show();
 * } 
 * class Outer7 { //������� }
 * 
 * class OuterTest2 { 
 * 		public static void main(String[] args) {
 *           	Outer7.method().show(); 
 *        } 
 *   } 
 *   
 *   Ҫ���ڿ���̨�����HelloWorld��
 */
interface Inter1 {
	void show();
	// public abstract
}

class Outer7 {
	// �������
	public static Inter1 method() {     //�ӿ���Ϊ����ֵ��ʵ�ʷ��ظýӿ�ʵ����Ķ��󣬸պþ��������ڲ���
		// ������� -- ������������
		return new Inter1() {
			public void show() {
				System.out.println("HelloWorld");
			}
		};
	}
}

class OuterTest2 {
	public static void main(String[] args) {
		Outer7.method().show();
		/*
		 * 1:Outer7.method()���Կ���method()Ӧ����Outer�е�һ�� ��̬������
		 * 2:Outer7.method().show()���Կ���method()�����ķ���ֵ��һ������
		 * �����ڽӿ�Inter1����һ��show()����,��������Ϊmethod()�����ķ���ֵ������һ���ӿڡ�
		 */
	}
}