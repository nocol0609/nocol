package com.nocol.Dao.Impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.nocol.Bean.OrderLine;
import com.nocol.Dao.OrderLineDao;
import com.nocol.Util.Common.DataSourceUtils;

public class OrderLineDaoImpl implements OrderLineDao {

	@Override
	public void addOderLine(OrderLine item) {
		// TODO Auto-generated method stub
		try {
			String sql = "insert into d_orderline values(d_orderLine_id.nextval,?,?,?,?,?)";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			runner.update(sql,item.getAmount(),item.getSingle_price(),item.getProduct_version(),item.getOrder().getId(),item.getProduct().getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
