package com.ssm.service;

import java.util.List;

import com.ssm.bean.Category;

/**
 * 业务层接口
 * @author Nocol
 *
 */

public interface CategoryService {
	/**
	 * 查询所有产品种类
	 * @return
	 */
	List<Category> findAllCategory();
	
	/**
	 * 根据id查询种类
	 * @param category_id
	 * @return
	 */
	Category findCategoryById(String category_id);
}
