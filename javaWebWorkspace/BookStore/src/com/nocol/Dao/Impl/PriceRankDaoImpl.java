package com.nocol.Dao.Impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.nocol.Bean.PriceRank;
import com.nocol.Dao.PriceRankDao;
import com.nocol.Util.Common.DataSourceUtils;

public class PriceRankDaoImpl implements PriceRankDao {

	@Override
	public List<PriceRank> findAllPriceRank() {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from d_price_rank";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			return runner.query(sql, new BeanListHandler<PriceRank>(PriceRank.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
