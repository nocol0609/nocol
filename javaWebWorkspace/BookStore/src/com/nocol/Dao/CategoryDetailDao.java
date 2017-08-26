package com.nocol.Dao;

import java.util.List;

import com.nocol.Bean.CategoryDetail;

public interface CategoryDetailDao {
	
	/**
	 * 查询产品的详细种类
	 * @return
	 */
	List<CategoryDetail> findProductDetail();
	
	/**
	 * 根据id查询产品详细种类
	 * @param id
	 * @return
	 */
	CategoryDetail findProductDetailById(String id);
	
	/**
	 * 根据种类id查询所有详细分类
	 * @param id
	 * @return
	 */
	List<CategoryDetail> findProdDetailByCateId(long id);
	
}
