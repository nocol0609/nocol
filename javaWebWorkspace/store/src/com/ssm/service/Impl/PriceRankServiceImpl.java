package com.ssm.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.bean.PriceRank;
import com.ssm.dao.PriceRankDao;
import com.ssm.service.PriceRankService;

@Service("PriceRankService")
public class PriceRankServiceImpl implements PriceRankService {

	@Autowired
	private PriceRankDao priceRankDao;

	@Override
	public List<PriceRank> findAllPriceRank() {
		// TODO Auto-generated method stub
		return priceRankDao.findAllPriceRank();
	}

}
