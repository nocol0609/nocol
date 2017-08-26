package com.ssm.service;

import java.util.List;

import com.ssm.bean.Publish;

/**
 * 业务层接口
 * @author Nocol
 *
 */

public interface PublishService {
	/**
	 * 查询所有的出版社
	 * @return
	 */
	List<Publish> findAllPublish();
}
