package com.map_son_test;

import java.util.HashMap;
import java.util.Set;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * HashMapǶ��HashMap
 * 
 * ���ǲ���
 * 		������(jc)
 * 				java		20
 * 				android 	22
 * 		��ҵ��(jy)
 * 				xml		    21
 * 				php		    23
 * 
 * �ȴ洢Ԫ�أ�Ȼ�����Ԫ��
 */
public class HashMapIncludeHashMap {
	public static void main(String[] args) {
		//�������϶���
		HashMap<String, HashMap<String, Integer>> czmap=new HashMap<String, HashMap<String, Integer>>();
		// ���������༯�϶���
		HashMap<String, Integer> jcmap=new HashMap<String, Integer>();
		//��ӻ�����Ԫ�ض���
		jcmap.put("java", 20);
		jcmap.put("android", 22);
		//��ӻ�����Ԫ�ض��󵽼���
		czmap.put("jc", jcmap) ;
		
		// ������ҵ�༯�϶���
		HashMap<String, Integer> jymap=new HashMap<String, Integer>();
		//��ӻ�����Ԫ�ض���
		jymap.put("xml", 21);
		jymap.put("php", 23);
		//��Ӿ�ҵ��Ԫ�ض��󵽼���
		czmap.put("jy", jymap) ;
		
		//��������
		Set<String> czmapset=czmap.keySet();
		for(String czmapkey:czmapset){
			System.out.println(czmapkey);
			HashMap<String, Integer> czmapvalue=czmap.get(czmapkey);
			Set<String> czmapvalueset=czmapvalue.keySet();
			for(String czmapvaluekey:czmapvalueset){
				Integer czmapvaluevalue=czmapvalue.get(czmapvaluekey);
				System.out.println("\t"+czmapvaluekey+"---"+czmapvaluevalue);
			}
		}
	}
}
