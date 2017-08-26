package com.ssm.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.bean.Category;
import com.ssm.dao.CategoryDao;
import com.ssm.service.CategoryService;

@Service("CategoryService")
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryDao categoryDao;
	
	@Override
	public List<Category> findAllCategory() {
		// TODO Auto-generated method stub
		return categoryDao.findAllCategory();
	}

	@Override
	public Category findCategoryById(String id) {
		// TODO Auto-generated method stub
		return categoryDao.findCategoryById(id);
	}

}
