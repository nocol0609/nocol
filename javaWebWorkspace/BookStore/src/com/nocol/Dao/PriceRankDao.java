package com.nocol.Dao;

import java.util.List;

import com.nocol.Bean.PriceRank;

public interface PriceRankDao {
	
	/**
	 * 查询所有价格区间
	 * @return
	 */
	List<PriceRank> findAllPriceRank();

}
