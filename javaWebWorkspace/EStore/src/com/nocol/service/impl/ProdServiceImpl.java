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
	 * �����Ʒ
	 */
	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		product.setId(UUID.randomUUID().toString());
		//����dao
		dao.addProduct(product);
	}
	/**
	 * ��ѯ������Ʒ
	 */
	@Override
	public List<Product> findAllProduct() {
		// TODO Auto-generated method stub
		
		return dao.findAllProduct();
	}
	/**
	 * ����id������Ʒ
	 */
	@Override
	public Product findProductById(String id) {
		// TODO Auto-generated method stub
		return dao.findProductById(id);
	}
	
}
