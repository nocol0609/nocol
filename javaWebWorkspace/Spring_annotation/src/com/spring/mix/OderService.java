package com.spring.mix;

import org.springframework.beans.factory.annotation.Autowired;
/**
 * 业务层
 * 
 * @author Nocol
 *
 */
public class OderService {
	/**
	 * 通过注解将OrderDao引入OderService(即省去写setOderDao() )
	 */
	@Autowired
	private OderDao dao;
	

	public void add() {
		System.out.println("OrderService add()......");
		dao.add();
	}
}
