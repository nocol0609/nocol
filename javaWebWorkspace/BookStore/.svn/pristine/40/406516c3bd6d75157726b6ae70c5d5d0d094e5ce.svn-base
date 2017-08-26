package com.nocol.Service.Impl;

import java.util.LinkedList;
import java.util.List;

import com.nocol.Bean.CategoryDetail;
import com.nocol.Dao.CategoryDetailDao;
import com.nocol.Dao.Impl.CategoryDetailDaoImpl;
import com.nocol.Service.CategoryDetailService;

public class CategoryDetailServiceImpl implements CategoryDetailService {
	
	CategoryDetailDao dao=new CategoryDetailDaoImpl();
	@Override
	public List<CategoryDetail> findProductDetail() {
		// TODO Auto-generated method stub
		return dao.findProductDetail();
	}
	@Override
	public CategoryDetail findProductDetailById(String id) {
		// TODO Auto-generated method stub
		return dao.findProductDetailById(id);
	}
	@Override
	public List<CategoryDetail> findProdDetailByCateId(long id) {
		// TODO Auto-generated method stub
		return dao.findProdDetailByCateId(id);
	}

}
