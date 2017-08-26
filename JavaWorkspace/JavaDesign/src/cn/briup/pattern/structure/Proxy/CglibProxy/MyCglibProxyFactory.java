package cn.briup.pattern.structure.Proxy.CglibProxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

//产生代理对象的工厂类
public class MyCglibProxyFactory implements MethodInterceptor { // MethodInterceptor实现回调方法

	public Object getInstance(Class<?> c) {
		// 构建一个子类
		Enhancer enhancer = new Enhancer();
		// 将目标表对象设置成父类
		enhancer.setSuperclass(c);
		// 设置回调方法，将来代理执行目标对象的方法的时候先执行代码中的intercept，在由这个方法执行目标对象的方法
		enhancer.setCallback(this);
		//创建代理对象
		return enhancer.create();
	}

	/**
	 * @param obj 目标对象
	 * @param method 代表方法
	 * @param args 代表方法的参数 
	 * @param proxy 代表方法的镜像
	 */
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

		System.out.println("开始执行方法");
		// 这句代码最终会执行到我们目标对象中的方法
		Object o = proxy.invokeSuper(obj, args);
		System.out.println("方法执行结束");

		return o;
	}
}
