package com.nocol.Dao.Impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.nocol.Bean.Product;
import com.nocol.Dao.ProductDao;
import com.nocol.Util.Common.DataSourceUtils;

public class ProductDaoImpl implements ProductDao {

	@Override
	public List<Product> findNewProduct(int i) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from d_product where flag=? and rownum<4";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			return runner.query(sql, new BeanListHandler<Product>(Product.class), i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Override
	public Product findProdById(String id) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from d_product where id=?";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			return runner.query(sql, new BeanHandler<Product>(Product.class),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<Product> fingHotProductByFlag(int i) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from d_product where flag=? and rownum<5";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			return runner.query(sql, new BeanListHandler<Product>(Product.class), i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<Product> findProdByCatId(String categoryId) {
		// TODO Auto-generated method stub
		try {
			String sql = "select dp.* from d_product dp,d_category dc,d_category_detail dcd where dp.CAT_DETAIL_ID=dcd.id and dcd.CATEGORY_ID=dc.id and dc.id=?";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			return runner.query(sql, new BeanListHandler<Product>(Product.class), categoryId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<Product> findProdByCatDetailId(long catdetailid) {
		// TODO Auto-generated method stub
		try {
			String sql = "select dp.* from d_product dp,d_category_detail dcd,d_category dc where dcd.CATEGORY_ID=dc.ID and dp.CAT_DETAIL_ID=dcd.id and dcd.id=?";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			return runner.query(sql, new BeanListHandler<Product>(Product.class), catdetailid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Override
	public void delProdNum(long id, long amount) {
		// TODO Auto-generated method stub
		try {
			String sql = "update d_product set stock=stock-? where id=? and stock-?>=0 ";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			int count = runner.update(sql, amount, id, amount);
			if (count <= 0) {
				throw new SQLException("库存不足！");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Override
	public void addProdNumByProdId(long id, long amount) {
		// TODO Auto-generated method stub
		try {
			String sql = "update d_product set stock=stock+? where id=?";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			runner.update(sql, amount, id);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
}
