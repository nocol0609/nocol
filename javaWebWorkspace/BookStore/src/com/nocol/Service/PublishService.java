package com.nocol.Service;

import java.util.List;

import com.nocol.Bean.Publish;

public interface PublishService {
	
	/**
	 * 查询所有的出版社
	 * @return
	 */
	List<Publish> findAllPublish();

}
