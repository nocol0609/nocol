package com.spring.life;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository("UserDao")
@Scope("prototype")  //默认为Singleton
public class UserDao {

	@PostConstruct
	//创建
	public void create() {
		System.out.println("UserDao 创建..........");
	}

	@PreDestroy
	//销毁
	public void destory() {
		System.out.println("UserDao 销毁...........");
	}

}
