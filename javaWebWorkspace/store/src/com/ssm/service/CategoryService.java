package com.ssm.service;

import java.util.List;

import com.ssm.bean.Category;

/**
 * ҵ���ӿ�
 * @author Nocol
 *
 */

public interface CategoryService {
	/**
	 * ��ѯ���в�Ʒ����
	 * @return
	 */
	List<Category> findAllCategory();
	
	/**
	 * ����id��ѯ����
	 * @param category_id
	 * @return
	 */
	Category findCategoryById(String category_id);
}
