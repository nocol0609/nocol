package com.nocol.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.nocol.bean.Product;
import com.nocol.dao.ProdDao;
import com.nocol.utils.DataSourceUtils;

public class ProdDaoImpl implements ProdDao {

	/**
	 * 添加商品
	 */
	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		try {
			String sql = "insert into products values(?,?,?,?,?,?,?)";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			runner.update(sql, product.getId(), product.getName(), product.getPrice(), product.getCategory(),
					product.getPnum(), product.getImgurl(), product.getDescription());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * 查询所有商品
	 */
	@Override
	public List<Product> findAllProduct() {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from products";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			return runner.query(sql, new BeanListHandler<Product>(Product.class));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * 根据id查询商品
	 */
	@Override
	public Product findProductById(String id) {
		// TODO Auto-generated method stub

		System.out.println("dao--id:" + id);
		try {
			String sql = "select * from products where id= '" + id + "'";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			return runner.query(sql, new BeanHandler<Product>(Product.class));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * 通过商品id修改商品数量
	 */
	@Override
	public void delProdNum(String product_id, int buynum) {
		// TODO Auto-generated method stub
		try {
			String sql = "update products set pnum=pnum-? where id=? and pnum-?>=0 ";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			int count = runner.update(sql, buynum, product_id, buynum);
			if (count <= 0) {
				throw new SQLException("库存不足！");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 通过商品id加回库存
	 */
	@Override
	public void addProdNumByProdId(String product_id,int buynum) {
		// TODO Auto-generated method stub
		try {
			String sql = "update products set pnum=pnum+? where id=?";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			runner.update(sql, buynum, product_id);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
