package com.nocol.inter;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * �ӿڳ�Ա�ص� ��
 *  ��Ա������ֻ���ǳ����������Ǿ�̬�ġ�
 *          Ĭ�����η���public static final (���Խӿڳ�Ա������ ���ӿ���.��Ա����ֱ�ӷ���
 *  ���췽�����ӿ�û�й��췽����(ԭ������) 
 *  ��Ա������ֻ���ǳ��󷽷��� Ĭ�����η���public abstract
 *          ���飺�Լ��ֶ�������
 * 
 * ���е��඼Ĭ�ϼ̳���һ���ࣺObject�� �� Object �����νṹ�ĸ��ࡣÿ���඼ʹ�� Object ��Ϊ���ࡣ
 */
interface Inter {
	public int num = 10;
	public final int num2 = 20;
	public static final int num3 = 30;// ������ public �� abstract��Ĭ����������ʽ

	// ����: ��Ҫ<��ʶ��>
	// public Inter() {}

	// �ӿڷ������ܴ�������
	// public void show() {}

	abstract void method(); //Ĭ��public,��Ĭ�� public abstract void method();
	public void show(); // Ĭ��abstract, ��Ĭ�� public abstract void show();
}

// �ӿ���+Impl���ָ�ʽ�ǽӿڵ�ʵ�����ʽ
/*
 * class InterImpl implements Inter { public InterImpl() { super(); } }
 */

class InterImpl extends Object implements Inter {
	public InterImpl() {
		super();
	}
    public void method(){
    	
    }
	public void show() {
	}
}

// ������
class InterDemo2 {
	public static void main(String[] args) {
		// ��������
		Inter i = new InterImpl();
		System.out.println(i.num);
		System.out.println(i.num2);
		// i.num = 100;
		// i.num2 = 200;
		// System.out.println(i.num); //�޷�Ϊ���ձ���num����ֵ,�ӿڳ�Ա����Ĭ��Ϊ����
		// System.out.println(i.num2);//�޷�Ϊ���ձ���num2����ֵ,�ӿڳ�Ա����Ĭ��Ϊ����
		
		System.out.println(Inter.num);  //�ӿڳ�Ա����Ĭ��Ϊ��̬
		System.out.println(Inter.num2); //�ӿڳ�Ա����Ĭ��Ϊ��̬
		System.out.println("--------------");
	}
}
