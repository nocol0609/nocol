package com.nocol.Dao.Impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.nocol.Bean.Payway;
import com.nocol.Dao.PaywayDao;
import com.nocol.Util.Common.DataSourceUtils;

public class PaywayDaoImpl implements PaywayDao {

	@Override
	public List<Payway> findPayWay() {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from d_payway";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			return runner.query(sql, new BeanListHandler<Payway>(Payway.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
