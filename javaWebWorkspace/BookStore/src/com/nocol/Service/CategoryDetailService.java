package com.nocol.Service;

import java.util.LinkedList;
import java.util.List;

import com.nocol.Bean.Category;
import com.nocol.Bean.CategoryDetail;

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
