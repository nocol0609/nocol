package com.ssm.service;

import java.util.List;

import com.ssm.bean.PriceRank;

/**
 * 业务层接口
 * @author Nocol
 *
 */
public interface PriceRankService {
	/**
	 * 查询所有价格区间
	 * @return
	 */
	List<PriceRank> findAllPriceRank();
}
