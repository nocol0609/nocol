package com.nocol_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * Map���ϵı�����
 * Map -- ���޶�
 * 
 * ˼·��
 * 		A:��ȡ���н��֤�ļ���
 * 		B:�������֤�ļ��ϣ��õ�ÿһ�����֤
 * 		C:���ݽ��֤��ȡ�ɷ������
 * 
 * ת����
 * 		A:��ȡ���м�ֵ�Զ���ļ���
 * 		B:������ֵ�Զ���ļ��ϣ��õ�ÿһ����ֵ�Զ���
 * 		C:���ݼ�ֵ�Զ����ȡ����ֵ
 * 
 * ���������鷳�ľ��Ǽ�ֵ�Զ�����α�ʾ��?
 * �������ǿ�ʼ��һ��������
 * 		Set<Map.Entry<K,V>> entrySet()�����ص��Ǽ�ֵ�Զ���ļ���
 */
public class MapBianLi2 {
	public static void main(String[] args) {
		//�������϶���
		Map<String, String> map=new HashMap<String,String>();
		//���������Ԫ�ض���
		map.put("�˳�", "��ٳ");
		map.put("������", "��ӱ");
		map.put("�ܽ���", "����");
		map.put("������", "����");
		// ��ȡ���м�ֵ�Զ���ļ���
		Set<Map.Entry<String, String>> set=map.entrySet();
		// ������ֵ�Զ���ļ��ϣ��õ�ÿһ����ֵ�Զ���
		for(Map.Entry<String, String> me:set){
			// ���ݼ�ֵ�Զ����ȡ����ֵ
			String key=me.getKey();
			String value=me.getValue();
			System.out.println(key+"-----"+value);
		}
	}
}
