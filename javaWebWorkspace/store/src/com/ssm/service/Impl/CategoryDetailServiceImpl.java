package com.ssm.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.bean.CategoryDetail;
import com.ssm.dao.CategoryDetailDao;
import com.ssm.service.CategoryDetailService;

@Service("CategoryDetailService")
public class CategoryDetailServiceImpl implements CategoryDetailService {

	@Autowired
	private CategoryDetailDao categoryDetailDao;

	@Override
	public List<CategoryDetail> findProductDetail() {
		// TODO Auto-generated method stub
		return categoryDetailDao.findProductDetail();
	}

	@Override	
	public CategoryDetail findProductDetailById(String id) {
		// TODO Auto-generated method stub
		return categoryDetailDao.findProductDetailById(id);
	}

	@Override
	public List<CategoryDetail> findProdDetailByCateId(long id) {
		// TODO Auto-generated method stub
		return categoryDetailDao.findProdDetailByCateId(id);
	}

}
