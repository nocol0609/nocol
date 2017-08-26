package com.spring.beanLife;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 后处理
 * 
 * @author Nocol
 *
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

	/**
	 * bean:代表Spring容器创建对象 beanName:bean对应的id属性
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub

		/**
		 * 若直接返回bean则对容器中所有对象起作用,即所有对象初始化前和初始化后都将执行----后处理器代码
		 */
		// System.out.println("后处理器-----初始化后执行");
		// return bean;

		/**
		 * 单独对lifeCycleBean做后期处理
		 */
		if (beanName.equals("lifeCycleBean")) {
			System.out.println("后处理器-----初始化后执行");
		}

		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(final Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		if (beanName.equals("lifeCycleBean")) {
			System.out.println("后处理器-----初始化前执行");

			return Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(),
					new InvocationHandler() {
						@Override
						public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
							// TODO Auto-generated method stub
							System.out.println("执行代理。。。。。");
							return method.invoke(bean, args);
						}
					});

		}
		return bean;
	}

}
