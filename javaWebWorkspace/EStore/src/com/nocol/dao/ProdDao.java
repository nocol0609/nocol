package com.nocol.dao;

import java.util.List;

import com.nocol.bean.Product;

public interface ProdDao {
	
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
	
	/**
	 * 根据商品id修改该商品数量
	 * @param product_id
	 * @param buynum
	 */
	void delProdNum(String product_id, int buynum);
	
	/**
	 * 根据商品id加回库存
	 * @param product_id
	 * @param buynum
	 */
	void addProdNumByProdId(String product_id, int buynum);

}
