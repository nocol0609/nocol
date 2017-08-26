package com.nocol.Service;

import java.util.List;

import com.nocol.Bean.Product;

public interface ProductService {
	
	/**
	 * 查询所有推荐产品
	 * @param i 
	 * @return
	 */
	List<Product> findNewProduct(int i);
	
	/**
	 * 根据产品id查询产品
	 * @param id
	 * @return
	 */
	Product findProdById(String id);
	
	/**
	 * 查询热卖产品
	 * @param i
	 * @return
	 */
	List<Product> fingHotProductByFlag(int i);
	
	/**
	 * 通过种类id查询详细种类的书籍
	 * @param categoryId
	 * @return
	 */
	List<Product> findProdByCatId(String categoryId);
	
	/**
	 * 根据详细分类id查询该分类下的所有产品
	 * @param id
	 * @return
	 */
	List<Product> findProdByCatDetailId(long id);

	
}
