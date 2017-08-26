package com.nocol.Dao.Impl;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.nocol.Bean.CategoryDetail;
import com.nocol.Dao.CategoryDetailDao;
import com.nocol.Util.Common.DataSourceUtils;

public class CategoryDetailDaoImpl implements CategoryDetailDao {

	@Override
	public List<CategoryDetail> findProductDetail() {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from d_category_detail";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			return runner.query(sql, new BeanListHandler<CategoryDetail>(CategoryDetail.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Override
	public CategoryDetail findProductDetailById(String id) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from d_product dp,d_category_detail dcd where dp.id=? and dp.cat_detail_id=dcd.id";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			return runner.query(sql, new BeanHandler<CategoryDetail>(CategoryDetail.class),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<CategoryDetail> findProdDetailByCateId(long id) {
		// TODO Auto-generated method stub
		try {
			String sql ="select dcd.name from d_category dc,d_category_detail dcd where dc.id=? and dc.id=dcd.category_id";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			return runner.query(sql, new BeanListHandler<CategoryDetail>(CategoryDetail.class),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
