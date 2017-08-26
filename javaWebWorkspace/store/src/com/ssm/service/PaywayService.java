package com.ssm.service;

import java.util.List;

import com.ssm.bean.Payway;


/**
 * 业务层接口
 * @author Nocol
 *
 */
public interface PaywayService {
	/**
	 * 查询所有的支付方式
	 * @return
	 */
	List<Payway> findPayWay();
}
