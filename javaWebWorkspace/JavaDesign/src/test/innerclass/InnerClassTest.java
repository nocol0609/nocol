package test.innerclass;

/**
 * @author Nocol
 *
 * @TODO
 * 
 */
/*
 * �����⣺ Ҫ������շֱ����30��20��10��
 * 
 * ע�⣺ 
 *     1:�ڲ�����ⲿ��û�м̳й�ϵ��
 *     2:ͨ���ⲿ�����޶�this���� Outer.this
 */
class Outer5 {
	
	public int num = 10;

	class Inner {                  //��Ա�ڲ���
		public int num = 20;

		public void show() {
			int num = 30;
			
			System.out.println(num);
			System.out.println(this.num);             //this��ʾ�����num
		   // System.out.println(new Outer5().num);      //Ҳ����
			System.out.println(Outer5.this.num);      //Outer5.this ��ʾ���ⲿ��Ķ���
		} 
	}
}

class InnerClassTest {
	public static void main(String[] args) {
		Outer5.Inner oi = new Outer5().new Inner();
		oi.show();
	}
}