package com.spring.aspectJ_annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 切面类
 * @author Nocol
 *
 */

//将切面类注解为切面类
@Aspect
public class MyaspectJ {
	/**
	 * 注解前置通知方法，并传入切点
	 */
	//@Before("execution(* com.spring.aspectJ_annotation.UserDaoImpl.*(..))")
	public void before(JoinPoint joinPoint){
		System.out.println("前置通知。。。");
	}
	
	/**
	 * 后置通知
	 * @param joinPoint
	 * @param returnVal
	 */
	//@AfterReturning(value = "execution(* com.spring.aspectJ_annotation.UserDaoImpl.*(..))", returning = "returnVal")
	public void afterReturning(JoinPoint joinPoint, Object returnVal) {
		System.out.println("后置通知.... 目标方法返回值：" + returnVal);
	}
	
	/**
	 * 环绕通知  -----可用于性能监控
	 * @param proceedingJoinPoint  特殊的链接点
	 * @return
	 * @throws Throwable  异常类
	 */	
    @Around("execution(* com.spring.aspectJ_annotation.UserDaoImpl.*(..))")
	public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		long begin = System.currentTimeMillis(); // 开始时间
		Object result = proceedingJoinPoint.proceed();
		long end = System.currentTimeMillis(); // 结束时间
		System.out.println(proceedingJoinPoint.toLongString() + "方法执行了" + (end - begin));
		return result;
	}
    
    /**
     * 抛出通知
     * @param joinPoint  链接点
     * @param e			异常对象
     */
	//@AfterThrowing(value = "execution(* com.spring.aspectJ_annotation.UserDaoImpl.*(..))", throwing = "e")
	public void afterThrowing(JoinPoint joinPoint, Throwable e) {
		System.out.println(joinPoint.toLongString() + "方法发生异常：" + e.getMessage());
	}
	
	/**
	 * 最终通知
	 * @param joinPoint
	 */
	// 使用 mypointcut名称切点
	// 一个advice被应用到多个切点
	@After("mypointcut() || mypointcut2() ")  //&& 
	public void after(JoinPoint joinPoint) {
		System.out.println("最终通知... 释放资源...");
	}

	/**
	 * 使用@Pointcut 对私有、无返回值、无参数方法 定义切点
	 */
	@Pointcut("execution(* cn.itcast.spring.a_aspectj.UserDAOImpl.*(..))")
	private void mypointcut() {
		
	}

	@Pointcut("execution(* com.spring.aspectJ_annotation.UserDaoImpl.*(..))")
	private void mypointcut2() {
	}
}
