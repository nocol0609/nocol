package com.cookie.dao;

import java.util.ArrayList;
import java.util.List;

import com.cookie.bean.Product;


public class ProductDao {
	//虚拟数据库
	 private static List<Product> list=new ArrayList<Product>();
	
	//初始化数据
	static{
		for(int i=0;i<10;i++){
			list.add(new Product(i,"笔记本_"+i,"Nocol_"+i,300+i));
		}
	}
	
	/**
	 * 查询所有商品的方法
	 */
	public List<Product> findAll(){
	
		return list;		
	}
	
	/**
	 * 根据id查询商品
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
