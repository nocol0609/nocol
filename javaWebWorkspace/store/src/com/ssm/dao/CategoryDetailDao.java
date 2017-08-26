package com.ssm.dao;

import java.util.List;

import com.ssm.bean.CategoryDetail;


/**
 * �־ò�ӿ�
 * @author Nocol
 *
 */
public interface CategoryDetailDao {
	/**
	 * ��ѯ��Ʒ����ϸ����
	 * @return
	 */
	List<CategoryDetail> findProductDetail();
	
	/**
	 * ����id��ѯ��Ʒ��ϸ����
	 * @param id
	 * @return
	 */
	CategoryDetail findProductDetailById(String id);
	
	/**
	 * ��������id��ѯ������ϸ����
	 * @param id
	 * @return
	 */
	List<CategoryDetail> findProdDetailByCateId(long id);
}
