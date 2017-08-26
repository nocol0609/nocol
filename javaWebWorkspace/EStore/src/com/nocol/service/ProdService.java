package com.nocol.service;

import java.util.List;

import com.nocol.bean.Product;

public interface ProdService {
	
	/**
	 * 添加商品
	 * @param product
	 */
	void addProduct(Product product);
	
	/**
	 * 查询所有商品
	 * @return
	 */
	List<Product> findAllProduct();
	
	/**
	 * 根据id查询商品
	 * @param id
	 * @return
	 */
	Product findProductById(String id);

}
