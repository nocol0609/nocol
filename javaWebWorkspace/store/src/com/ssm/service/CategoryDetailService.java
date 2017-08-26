package com.ssm.service;

import java.util.List;

import com.ssm.bean.CategoryDetail;

/**
 * 业务层接口
 * @author Nocol
 *
 */
public interface CategoryDetailService {
	/**
	 * 查询产品详细种类
	 * @return
	 */
	List<CategoryDetail> findProductDetail();
	
	/**
	 * 根据产品id查询产品详细种类
	 * @param id
	 * @return
	 */
	CategoryDetail findProductDetailById(String id);
	
	/**
	 * 根据种类id查询所有详细种类
	 * @param id
	 * @return
	 */
	List<CategoryDetail> findProdDetailByCateId(long id);
}
