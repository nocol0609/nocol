package com.ssm.service;

import java.util.List;

import com.ssm.bean.Payway;


/**
 * ҵ���ӿ�
 * @author Nocol
 *
 */
public interface PaywayService {
	/**
	 * ��ѯ���е�֧����ʽ
	 * @return
	 */
	List<Payway> findPayWay();
}
