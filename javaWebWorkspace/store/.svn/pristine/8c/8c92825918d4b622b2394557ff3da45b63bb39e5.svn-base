package com.ssm.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.bean.Publish;
import com.ssm.dao.PublishDao;
import com.ssm.service.PublishService;

@Service("PublishService")
public class PublishServiceImpl implements PublishService {

	@Autowired
	private PublishDao publishDao;

	@Override
	public List<Publish> findAllPublish() {
		// TODO Auto-generated method stub
		return publishDao.findAllPublish();
	}

}
