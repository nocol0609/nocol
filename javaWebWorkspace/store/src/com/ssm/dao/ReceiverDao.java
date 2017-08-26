package com.ssm.dao;

import com.ssm.bean.Receiver;

/**
 * 持久层接口
 * @author Nocol
 *
 */
public interface ReceiverDao {
	/**
	 * 添加收件人
	 * @param receiver
	 */
	void addReceiver(Receiver receiver);
}
