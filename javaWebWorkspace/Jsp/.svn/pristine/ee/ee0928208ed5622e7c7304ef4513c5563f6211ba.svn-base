package com.nocol.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class showIpTag extends SimpleTagSupport {

	/**
	 * SimpleTagSupport已完成以下部分，不需要再实现
	 */
	
//	private JspContext context;
//
//	/**
//	 * 传入pageContext
//	 */
//	@Override
//	public void setJspContext(JspContext pc) {
//		pc = this.context;
//	}

	@Override
	public void doTag() throws JspException, IOException {
		
		//向浏览器输出客户的ip地址
		PageContext pageContext = (PageContext)this.getJspContext();
		
		HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();
		
		String ip = request.getRemoteHost();
		
		JspWriter out = pageContext.getOut();
		
		out.write("使用自定义标签输出客户的IP地址："+ip);
	}
}

