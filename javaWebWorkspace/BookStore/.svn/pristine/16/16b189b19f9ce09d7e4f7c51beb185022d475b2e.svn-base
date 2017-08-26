package com.nocol.Dao.Impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.nocol.Bean.Publish;
import com.nocol.Dao.PublishDao;
import com.nocol.Util.Common.DataSourceUtils;

public class PublishDaoImpl implements PublishDao {
	
	@Override
	public List<Publish> findAllPublish() {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from d_publish";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			return runner.query(sql, new BeanListHandler<Publish>(Publish.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
