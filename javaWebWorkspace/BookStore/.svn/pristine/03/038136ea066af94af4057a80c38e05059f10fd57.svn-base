package com.nocol.Service.Impl;

import java.util.List;

import com.nocol.Bean.Product;
import com.nocol.Dao.ProductDao;
import com.nocol.Dao.Impl.ProductDaoImpl;
import com.nocol.Service.ProductService;

public class ProductServiceImpl implements ProductService {
	ProductDao dao = new ProductDaoImpl();

	@Override
	public List<Product> findNewProduct(int i) {
		// TODO Auto-generated method stub
		return dao.findNewProduct(i);
	}

	@Override
	public Product findProdById(String id) {
		// TODO Auto-generated method stub
		return dao.findProdById(id);
	}

	@Override
	public List<Product> fingHotProductByFlag(int i) {
		// TODO Auto-generated method stub
		return dao.fingHotProductByFlag(i);
	}

	@Override
	public List<Product> findProdByCatId(String categoryId) {
		// TODO Auto-generated method stub
		return dao.findProdByCatId(categoryId);
	}

	@Override
	public List<Product> findProdByCatDetailId(long id) {
		// TODO Auto-generated method stub
		return dao.findProdByCatDetailId(id);
	}
}
