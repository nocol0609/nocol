package com.nocol.Service;

import java.util.List;

import com.nocol.Bean.PriceRank;

public interface PriceRankService {
	
	/**
	 * 查询所有价格区间
	 * @return
	 */
	List<PriceRank> findAllPriceRank();

}
