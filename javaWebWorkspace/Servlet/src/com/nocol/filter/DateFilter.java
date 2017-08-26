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
 * ��Ч���ݹ���
 * @author Jie.Yuan
 *
 */
public class DateFilter implements Filter {
	
	// ��ʼ����Ч����
	private List<String> dirtyData;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// ģ�⼸������
		dirtyData = new ArrayList<String>();
		dirtyData.add("NND");
		dirtyData.add("ըʹ��");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		
		// ת��
		final HttpServletRequest request = (HttpServletRequest) req;    
		HttpServletResponse response = (HttpServletResponse) res;
		
		// һ��������ҵ��
		request.setCharacterEncoding("UTF-8");					// POST�ύ��Ч
		response.setContentType("text/html;charset=UTF-8");
		
		HttpServletRequest proxy =  (HttpServletRequest) Proxy.newProxyInstance(
				request.getClass().getClassLoader(), 		// ָ����ǰʹ�õ��ۼ�����
				new Class[]{HttpServletRequest.class}, 		// ��Ŀ�����ʵ�ֵĽӿ�����
				new InvocationHandler() {					// �¼�������
					@Override
					public Object invoke(Object proxy, Method method, Object[] args)
							throws Throwable {
						// ���巽������ֵ
						Object returnValue = null;
						// ��ȡ������
						String methodName = method.getName();
						// �жϣ���getParameter��������GET�ύ���Ĵ���
						if ("getParameter".equals(methodName)) {
							
							// ��ȡ��������ֵ�� <input type="text" name="userName">��
							String value = request.getParameter(args[0].toString());	// ����Ŀ�����ķ���
							
							// ��ȡ�ύ��ʽ
							String methodSubmit = request.getMethod(); // ֱ�ӵ���Ŀ�����ķ���
							
							// �ж������GET�ύ����Ҫ�����ݽ��д���  (POST�ύ�Ѿ��������)
							if ("GET".equals(methodSubmit)) {
								if (value != null && !"".equals(value.trim())){
									// ����GET����
									value = new String(value.getBytes("ISO8859-1"),"UTF-8");
								}
							} 
							
							// ���������Ѿ������꣺ ���������Ч���ݹ���   
							//�����value�г���dirtyData�����ݣ���****�滻��  
							for (String data : dirtyData) {
								// �жϵ�ǰ��������(value), �Ƿ������Ч����
								if (value.contains(data)){
									value = value.replace(data, "*****");
								}
							}
							// ��������롢��Ч���ݺ����ȷ����
							return value;
						}
						else {
							// ִ��request�������������
							returnValue = method.invoke(request, args);
						}
						
						return returnValue;
					}
				});
		
		// �������� (ִ����һ������������servlet)
		chain.doFilter(proxy, response);		// ����������
	}



	@Override
	public void destroy() {
		
	}
}
