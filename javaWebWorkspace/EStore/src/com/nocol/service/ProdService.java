package com.nocol.service;

import java.util.List;

import com.nocol.bean.Product;

public interface ProdService {
	
	/**
	 * �����Ʒ
	 * @param product
	 */
	void addProduct(Product product);
	
	/**
	 * ��ѯ������Ʒ
	 * @return
	 */
	List<Product> findAllProduct();
	
	/**
	 * ����id��ѯ��Ʒ
	 * @param id
	 * @return
	 */
	Product findProductById(String id);

}
