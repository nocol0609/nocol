package com.nocol.pattern.structure.Proxy.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandle implements InvocationHandler {
	//目标对象
	private UserService service;

	public MyHandle(UserService service) {
		this.service = service;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub\
		System.out.println("before  test..........." + args[0]);
		Object obj = method.invoke(service, args);
		System.out.println("obj:"+obj);
		return obj;
	}

}
