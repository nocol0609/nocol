package com.cookie.dao;

import java.util.ArrayList;
import java.util.List;

import com.cookie.bean.Product;


public class ProductDao {
	//�������ݿ�
	 private static List<Product> list=new ArrayList<Product>();
	
	//��ʼ������
	static{
		for(int i=0;i<10;i++){
			list.add(new Product(i,"�ʼǱ�_"+i,"Nocol_"+i,300+i));
		}
	}
	
	/**
	 * ��ѯ������Ʒ�ķ���
	 */
	public List<Product> findAll(){
	
		return list;		
	}
	
	/**
	 * ����id��ѯ��Ʒ
	 */
	public Product findById(String id){
		
		for (Product product : list) {
			if (Integer.toString(product.getId()).equals(id)) {
				return product;
			}
		}	
		return null;
	}
}
