package com.nocol.Dao.Impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.nocol.Bean.Category;
import com.nocol.Dao.CategoryDao;
import com.nocol.Util.Common.DataSourceUtils;

public class CategoryDaoImpl implements CategoryDao {

	@Override
	public List<Category> findAllCategory() {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from d_category";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			return runner.query(sql, new BeanListHandler<Category>(Category.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Override
	public Category findCategoryById(String category_id) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from d_category where id=?";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			return runner.query(sql, new BeanHandler<Category>(Category.class), category_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
