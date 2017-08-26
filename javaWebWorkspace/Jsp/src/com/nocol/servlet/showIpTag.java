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
	 * SimpleTagSupport��������²��֣�����Ҫ��ʵ��
	 */
	
//	private JspContext context;
//
//	/**
//	 * ����pageContext
//	 */
//	@Override
//	public void setJspContext(JspContext pc) {
//		pc = this.context;
//	}

	@Override
	public void doTag() throws JspException, IOException {
		
		//�����������ͻ���ip��ַ
		PageContext pageContext = (PageContext)this.getJspContext();
		
		HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();
		
		String ip = request.getRemoteHost();
		
		JspWriter out = pageContext.getOut();
		
		out.write("ʹ���Զ����ǩ����ͻ���IP��ַ��"+ip);
	}
}

