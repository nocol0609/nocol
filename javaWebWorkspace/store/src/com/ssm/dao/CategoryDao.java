package com.ssm.dao;

import java.util.List;

import com.ssm.bean.Category;

/**
 * 持久层接口
 * @author Nocol
 *
 */
public interface CategoryDao {
	/**
	 * 查询所有产品的种类
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
