package com.component;

import java.util.ArrayList;
import java.util.List;

/**
* @author lxp
*
* @TODO 
* 
*/
//�������������(���ڵ�)
public class Composit extends Component {
	
    //���弯�϶���洢��϶�����Ӷ���
	List<Component> list=new ArrayList<Component>();
		
	public Composit(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
//	//����Ӷ���
//	@Override
//	public void Add(Component c) {
//		// TODO Auto-generated method stub
//		list.add(c);
//		
//	}
//	//ɾ���Զ���
//	@Override
//	public void Remove(Component c) {
//		// TODO Auto-generated method stub
//		list.remove(c);
//	}
	//չʾ�Ӷ���
	@Override
	public void Display() {
		// TODO Auto-generated method stub
		//�����ӵ���϶���
		System.out.println(name);
		//������϶�����Ӷ���
		for(Component c:list){
			c.Display();
		}
	}
	
	/*
	 * 
	 * ���ѵķ���������Ӻ��Ƴ���������Ϊ�ӿڣ������о���������ʱ��ʵ��Add�ӿں�Remove�ӿڼ���
	 * 
	 */
	//��������Ӷ���ķ���
	public void Add(Component c){
		list.add(c);
	}
	//�����Ƴ��Ӷ���ķ���
	public void Remove(Component c){
		list.remove(c);
	}
	
}
