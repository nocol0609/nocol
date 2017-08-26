package com.nocol.Dao;

import java.util.List;

import com.nocol.Bean.Payway;

public interface PaywayDao {
	/**
	 * 查询所有的支付方式
	 * @return
	 */
	List<Payway> findPayWay();

}
