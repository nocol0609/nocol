package com.spring.aspectJ_xml;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面类,内部可定义多个advice方法,不需要实现任何接口
 * @author Nocol
 *
 */
public class MyAspect {
	
	/**
	 * 前置通知方法
	 */
	//前置通知方法1
	public void before1(){
		System.out.println("前置通知 1...");
	}
	
	//前置通知方法2（可加参数）
	public void before2(JoinPoint joinPoint){
		//连接点参数 包含当前被拦截的方法的信息
		System.out.println(joinPoint.toLongString());
		System.out.println("前置通知 2...");
	}
	
	/**
	 * 后置通知方法
	 */
	//后置通知1
	public void afterReturning1(){
		System.out.println("后置通知 1");
	}
	
	//后置通知2（加参数）
	public void afterReturning2(JoinPoint joinPoint,Object result){
		System.out.println("后置通知 2----方法返回结果:"+result);
	}
	
	/**
	 * 环绕通知方法(需要将目标方法结果返回)
	 * 传入的参数:可执行的连接点
	 * @throws Throwable 
	 */
	public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		
		System.out.println("环绕通知  方法执行前通知...");
		Object result = proceedingJoinPoint.proceed();
		System.out.println("环绕通知  方法执行后通知...得到方法返回值:"+result);
		return result;
	}
	
	/**
	 * 抛出通知
	 */
	//日志记录器
	private static Logger LOG=Logger.getLogger(MyAspect.class);
	
	//第一个参数:连接点
	//第二个参数:目标方法出现异常后，捕获到异常对象
	public void afterThrowing(JoinPoint joinPoint, Throwable exception){
		
		System.out.println("哪个方法出现异常?"+joinPoint.toLongString());
		//调用异常日志API，将异常对象写入日志文件
		LOG.error(exception.getMessage());
	}
	
	/**
	 * 最终通知
	 */
	public void after(JoinPoint joinPoint){
		//最终通知内一般是释放资源的方法
		System.out.println("最终通知------释放资源-----");
	}
}

