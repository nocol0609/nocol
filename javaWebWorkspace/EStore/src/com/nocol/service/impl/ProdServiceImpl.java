package com.nocol.service.impl;

import java.util.List;
import java.util.UUID;

import com.nocol.bean.Product;
import com.nocol.dao.ProdDao;
import com.nocol.dao.impl.ProdDaoImpl;
import com.nocol.service.ProdService;

public class ProdServiceImpl implements ProdService {
	
	ProdDao dao=new ProdDaoImpl();
	/**
	 * 添加商品
	 */
	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		product.setId(UUID.randomUUID().toString());
		//调用dao
		dao.addProduct(product);
	}
	/**
	 * 查询所有商品
	 */
	@Override
	public List<Product> findAllProduct() {
		// TODO Auto-generated method stub
		
		return dao.findAllProduct();
	}
	/**
	 * 根据id查找商品
	 */
	@Override
	public Product findProductById(String id) {
		// TODO Auto-generated method stub
		return dao.findProductById(id);
	}
	
}
