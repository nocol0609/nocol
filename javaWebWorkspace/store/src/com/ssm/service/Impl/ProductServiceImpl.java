package com.ssm.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.bean.Product;
import com.ssm.dao.ProductDao;
import com.ssm.service.ProductService;

@Service("ProductService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	@Override
	public List<Product> findNewProduct(int i) {
		// TODO Auto-generated method stub
		return productDao.findNewProduct(i);
	}

	@Override
	public Product findProdById(String id) {
		// TODO Auto-generated method stub
		return productDao.findProdById(id);
	}

	@Override
	public List<Product> fingHotProductByFlag(int i) {
		// TODO Auto-generated method stub
		return productDao.fingHotProductByFlag(i);
	}

	@Override
	public List<Product> findProdByCatId(String categoryId) {
		// TODO Auto-generated method stub
		return productDao.findProdByCatId(categoryId);
	}

	@Override
	public List<Product> findProdByCatDetailId(long id) {
		// TODO Auto-generated method stub
		return productDao.findProdByCatDetailId(id);
	}

}
