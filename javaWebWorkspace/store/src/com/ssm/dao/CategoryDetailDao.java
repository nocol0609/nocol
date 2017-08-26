package com.ssm.dao;

import java.util.List;

import com.ssm.bean.CategoryDetail;


/**
 * 持久层接口
 * @author Nocol
 *
 */
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
