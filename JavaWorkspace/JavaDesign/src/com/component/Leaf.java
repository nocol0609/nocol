package com.component;
/**
* @author lxp
*
* @TODO 
* 
*/
//������϶�����Ӷ�����
public class Leaf extends Component{

	public Leaf(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
//	//�Ӷ�������ʵ��
//	@Override
//	public void Add(Component c) {
//		// TODO Auto-generated method stub
//		System.out.println("�������û����ӹ���");
//	}
//	//�����������ʵ��
//	@Override
//	public void Remove(Component c) {
//		// TODO Auto-generated method stub
//		System.out.println("�������û���Ƴ�����");
//	}
	//չ���������
	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println(name);
	}

}
