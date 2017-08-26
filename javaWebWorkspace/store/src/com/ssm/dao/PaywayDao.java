package com.ssm.dao;

import java.util.List;

import com.ssm.bean.Payway;

/**
 * 持久层接口
 * @author Nocol
 *
 */
public interface PaywayDao {
	/**
	 * 查询所有的支付方式
	 * @return
	 */
	List<Payway> findPayWay();
}
