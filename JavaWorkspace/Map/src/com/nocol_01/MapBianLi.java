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
 * ˼·��
 * 		A:�����е��ɷ������������
 * 		B:�����ɷ�ļ��ϣ���ȡ�õ�ÿһ���ɷ�
 * 		C:���ɷ�ȥ���Լ������ӡ�
 * 
 * ת����
 * 		A:��ȡ���еļ�
 * 		B:�������ļ��ϣ���ȡ�õ�ÿһ����
 * 		C:���ݼ�ȥ��ֵ
 */
public class MapBianLi {
	public static void main(String[] args) {
		//�������϶���
		Map<String, String> map=new HashMap<String,String>();
		//���������Ԫ�ض���
		map.put("�˳�", "��ٳ");
		map.put("������", "��ӱ");
		map.put("�ܽ���", "����");
		map.put("������", "����");
		//��ȡ���еļ�
		Set<String> set=map.keySet();
		// �������ļ��ϣ���ȡ�õ�ÿһ����
		for(String key:set){
			String value=map.get(key);
			System.out.println(key+"-----"+value);
		}
	}
}
