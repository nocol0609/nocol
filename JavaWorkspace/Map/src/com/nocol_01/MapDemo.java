package com.nocol_01;

import java.util.HashMap;
import java.util.Map;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * Map���ϵ��ص㣺
 * 		����ӳ�䵽ֵ�Ķ���һ��ӳ�䲻�ܰ����ظ��ļ���ÿ�������ֻ��ӳ�䵽һ��ֵ�� 
 * 
 * Map���Ϻ�Collection���ϵ�����?
 * 		Map���ϴ洢Ԫ���ǳɶԳ��ֵģ�Map���ϵļ���Ψһ�ģ�ֵ�ǿ��ظ��ġ����԰�������Ϊ�����޶�
 * 		Collection���ϴ洢Ԫ���ǵ������ֵģ�Collection�Ķ���Set��Ψһ�ģ�List�ǿ��ظ��ġ�
 * 
 * ע�⣺
 * 		Map���ϵ����ݽṹֵ��Լ���Ч����ֵ�޹أ��������ʱ����
 * 			HashMap��TreeMap
 *		Collection���ϵ����ݽṹ�����Ԫ����Ч
 * 
 * Map���ϵĹ��ܸ�����
 * 1:��ӹ���
 * 		V put(K key,V value):���Ԫ�ء������ʵ������һ������?�Ȳ������㣬�Ȼὲ
 * 			������ǵ�һ�δ洢����ֱ�Ӵ洢Ԫ�أ�����null
 * 			��������ǵ�һ�δ��ڣ�����ֵ����ǰ��ֵ�滻����������ǰ��ֵ
 * 2:ɾ������
 * 		void clear():�Ƴ����еļ�ֵ��Ԫ��
 * 		V remove(Object key)�����ݼ�ɾ����ֵ��Ԫ�أ�����ֵ����
 * 3:�жϹ���
 * 		boolean containsKey(Object key)���жϼ����Ƿ����ָ���ļ�
 * 		boolean containsValue(Object value):�жϼ����Ƿ����ָ����ֵ
 * 		boolean isEmpty()���жϼ����Ƿ�Ϊ��
 * 4:��ȡ����
 * 		Set<Map.Entry<K,V>> entrySet():???
 * 		V get(Object key):���ݼ���ȡֵ
 * 		Set<K> keySet():��ȡ���������м��ļ���
 * 		Collection<V> values():��ȡ����������ֵ�ļ���
 * 5�����ȹ���
 * 		int size()�����ؼ����еļ�ֵ�ԵĶ���
 */
public class MapDemo {
	public static void main(String[] args) {
		// �������϶���
		Map<String, String> map = new HashMap<String, String>();

		// ���Ԫ��
		// V put(K key,V value):���Ԫ�ء������ʵ������һ������?�Ȳ������㣬�Ȼὲ
		// System.out.println("put:" + map.put("����", "������"));
		// System.out.println("put:" + map.put("����", "Ҧ��"));

		map.put("�˳�", "��ٳ");
		map.put("������", "��ӱ");
		map.put("�ܽ���", "����");
		map.put("������", "����");

		// void clear():�Ƴ����еļ�ֵ��Ԫ��
		// map.clear();

		// V remove(Object key)�����ݼ�ɾ����ֵ��Ԫ�أ�����ֵ����
		// System.out.println("remove:" + map.remove("������"));
		// System.out.println("remove:" + map.remove("������"));

		// boolean containsKey(Object key)���жϼ����Ƿ����ָ���ļ�
		// System.out.println("containsKey:" + map.containsKey("������"));
		// System.out.println("containsKey:" + map.containsKey("������"));

		// boolean isEmpty()���жϼ����Ƿ�Ϊ��
		// System.out.println("isEmpty:"+map.isEmpty());
		
		//int size()�����ؼ����еļ�ֵ�ԵĶ���
		System.out.println("size:"+map.size());

		// �����������
		System.out.println("map:" + map);
	}
}
