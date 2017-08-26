package com.ssm.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.bean.Payway;
import com.ssm.dao.PaywayDao;
import com.ssm.service.PaywayService;

@Service("PaywayService")
public class PaywayServiceImpl implements PaywayService {

	@Autowired
	private PaywayDao paywayDao;

	@Override
	public List<Payway> findPayWay() {
		// TODO Auto-generated method stub
		return paywayDao.findPayWay();
	}

}
