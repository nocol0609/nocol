package com.nocol_03;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * ����?
 * 		����һ�����ϣ����£����ʣ������ж�������û��"world"���Ԫ�أ�����У��Ҿ����һ��"javaee"Ԫ�أ���д����ʵ�֡�
 * 
 * ConcurrentModificationException:��������⵽����Ĳ����޸ģ��������������޸�ʱ���׳����쳣�� 
 * ������ԭ��
 * 		�������������ڼ��϶����ڵģ����жϳɹ��󣬼��ϵ����������Ԫ�أ���������ȴ��֪�������Ծͱ����ˣ������в����޸��쳣��
 * 		��ʵ��������������ǣ�����������Ԫ�ص�ʱ��ͨ�������ǲ����޸�Ԫ�صġ�
 * ��ν����?
 * 		A:����������Ԫ�أ��������޸�Ԫ��
 * 			Ԫ���Ǹ��ڸղŵ�����Ԫ�غ���ġ�
 * 		B:���ϱ���Ԫ�أ������޸�Ԫ��(��ͨfor)
 * 			Ԫ���������ӵġ�
 */
public class ListIteratorDemo2 {
	public static void main(String[] args) {
		//�������϶���
		List list=new ArrayList();
		//�������
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//��������Ԫ��
		// ����������
		// Iterator it = list.iterator();
		// while (it.hasNext()) {
		// String s = (String) it.next();
		// if ("world".equals(s)) {
		// list.add("javaee");
		// }
		// }	
		
		// ��ʽ1������������Ԫ�أ��������޸�Ԫ��
		// ��Iterator������ȴû����ӹ��ܣ���������ʹ�����ӽӿ�ListIterator
		
		/*ListIterator lis=list.listIterator();
		while(lis.hasNext()){
			String s1=(String)lis.next();
			if("world".equals(s1)){
				lis.add("javaee");
			}
		}*/
		
		//��ʽ����ͨforѭ��
		for(int x=0;x<list.size();x++){
			String s2=(String)list.get(x);
			if("world".equals(s2)){
				list.add("javaee");
			}
		}
			
		System.out.println(list);
	} 
}
