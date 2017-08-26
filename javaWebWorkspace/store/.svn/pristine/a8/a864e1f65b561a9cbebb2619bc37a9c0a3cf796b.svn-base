package com.ssm.listener;

import java.util.LinkedHashMap;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.ssm.bean.Product;
/**
 * session监听器
 * @author Nocol
 *
 */
public class MySessionListener implements HttpSessionListener {

	public void sessionCreated(HttpSessionEvent se) {
		se.getSession().setAttribute("cartmap", new LinkedHashMap<Product,Integer>());
	}

	public void sessionDestroyed(HttpSessionEvent se) {
		
	}

}
