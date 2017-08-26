package com.nocol.Dao;

import java.util.List;

import com.nocol.Bean.Product;

public interface ProductDao {
	
	/**
	 * 查询所有推荐产品
	 * @param i 
	 * @return
	 */
	List<Product> findNewProduct(int i);
	
	/**
	 * 根据id查询商品
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
	
	/**
	 * 根据产品id查询产品并减去产品库存
	 * @param id
	 * @param amount
	 */
	void delProdNum(long id, long amount);
	
	/**
	 * 根据产品id增加产品数量
	 * @param id
	 * @param amount
	 */
	void addProdNumByProdId(long id, long amount);

}
