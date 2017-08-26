package com.nocol.Dao;

import com.nocol.Bean.OrderLine;

public interface OrderLineDao {
	
	/**
	 * 生成订单项
	 * @param item
	 */
	void addOderLine(OrderLine item);

}
