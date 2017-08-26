package com.nocol.filter;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 无效数据过滤
 * @author Jie.Yuan
 *
 */
public class DateFilter implements Filter {
	
	// 初始化无效数据
	private List<String> dirtyData;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// 模拟几个数据
		dirtyData = new ArrayList<String>();
		dirtyData.add("NND");
		dirtyData.add("炸使馆");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		
		// 转型
		final HttpServletRequest request = (HttpServletRequest) req;    
		HttpServletResponse response = (HttpServletResponse) res;
		
		// 一、处理公用业务
		request.setCharacterEncoding("UTF-8");					// POST提交有效
		response.setContentType("text/html;charset=UTF-8");
		
		HttpServletRequest proxy =  (HttpServletRequest) Proxy.newProxyInstance(
				request.getClass().getClassLoader(), 		// 指定当前使用的累加载器
				new Class[]{HttpServletRequest.class}, 		// 对目标对象实现的接口类型
				new InvocationHandler() {					// 事件处理器
					@Override
					public Object invoke(Object proxy, Method method, Object[] args)
							throws Throwable {
						// 定义方法返回值
						Object returnValue = null;
						// 获取方法名
						String methodName = method.getName();
						// 判断：对getParameter方法进行GET提交中文处理
						if ("getParameter".equals(methodName)) {
							
							// 获取请求数据值【 <input type="text" name="userName">】
							String value = request.getParameter(args[0].toString());	// 调用目标对象的方法
							
							// 获取提交方式
							String methodSubmit = request.getMethod(); // 直接调用目标对象的方法
							
							// 判断如果是GET提交，需要对数据进行处理  (POST提交已经处理过了)
							if ("GET".equals(methodSubmit)) {
								if (value != null && !"".equals(value.trim())){
									// 处理GET中文
									value = new String(value.getBytes("ISO8859-1"),"UTF-8");
								}
							} 
							
							// 中文数据已经处理完： 下面进行无效数据过滤   
							//【如何value中出现dirtyData中数据，用****替换】  
							for (String data : dirtyData) {
								// 判断当前输入数据(value), 是否包含无效数据
								if (value.contains(data)){
									value = value.replace(data, "*****");
								}
							}
							// 处理完编码、无效数据后的正确数据
							return value;
						}
						else {
							// 执行request对象的其他方法
							returnValue = method.invoke(request, args);
						}
						
						return returnValue;
					}
				});
		
		// 二、放行 (执行下一个过滤器或者servlet)
		chain.doFilter(proxy, response);		// 传入代理对象
	}



	@Override
	public void destroy() {
		
	}
}
