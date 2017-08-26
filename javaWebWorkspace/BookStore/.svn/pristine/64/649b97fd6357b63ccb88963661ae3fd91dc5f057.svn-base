package com.nocol.Service.Impl;

import java.util.List;

import com.nocol.Bean.Category;
import com.nocol.Dao.CategoryDao;
import com.nocol.Dao.Impl.CategoryDaoImpl;
import com.nocol.Service.CategoryService;

public class CategoryServiceImpl implements CategoryService{
	
	CategoryDao dao=new CategoryDaoImpl();
	@Override
	public List<Category> findAllCategory() {
		// TODO Auto-generated method stub
		return dao.findAllCategory();
	}
	@Override
	public Category findCategoryById(String category_id) {
		// TODO Auto-generated method stub
		return dao.findCategoryById(category_id);
	}

}
