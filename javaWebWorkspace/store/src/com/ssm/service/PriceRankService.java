package com.ssm.service;

import java.util.List;

import com.ssm.bean.PriceRank;

/**
 * ҵ���ӿ�
 * @author Nocol
 *
 */
public interface PriceRankService {
	/**
	 * ��ѯ���м۸�����
	 * @return
	 */
	List<PriceRank> findAllPriceRank();
}
