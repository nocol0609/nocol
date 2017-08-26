package com.ssm.dao;

import java.util.List;

import com.ssm.bean.PriceRank;


/**
 * 持久层接口
 * @author Nocol
 *
 */
public interface PriceRankDao {
	/**
	 * 查询所有价格区间
	 * @return
	 */
	List<PriceRank> findAllPriceRank();
}
