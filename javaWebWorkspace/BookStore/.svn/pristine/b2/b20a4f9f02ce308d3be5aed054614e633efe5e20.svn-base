package com.nocol.Dao.Impl;

import org.apache.commons.dbutils.QueryRunner;

import com.nocol.Bean.Receiver;
import com.nocol.Dao.ReceiverDao;
import com.nocol.Util.Common.DataSourceUtils;


public class ReceiverDaoImpl implements ReceiverDao{

	@Override
	public void addReceiver(Receiver receiver) {
		// TODO Auto-generated method stub
		try {
			String sql = "insert into d_receiver values(?,?,?,?,?)";
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			runner.update(sql, receiver.getId(),receiver.getName(),receiver.getAddress(),receiver.getPhone(),receiver.getUser().getId() );
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
