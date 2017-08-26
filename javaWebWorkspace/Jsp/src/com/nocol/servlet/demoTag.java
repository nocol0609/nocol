package com.nocol.servlet;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class demoTag extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub

		/**
		 * 控制标签体内容是否输出
		 */
		// 获取标签体内内容
		JspFragment jspBody = this.getJspBody();
		// 向浏览器输出
		JspWriter out = this.getJspContext().getOut();
		// jspBody.invoke(out);//若调用该方法则表示向浏览器输出，不调用则不输出
		// jspBody.invoke(null);//null等价于out

		/**
		 * 循环输出标签体内内容
		 */
		for (int i = 1; i <= 5; i++) {
			jspBody.invoke(null);
		}
		
		/**
		 * 修改标签体内的内容
		 */
		//创建Stringwriter临时容器
		StringWriter writer = new StringWriter();
		//将标签体拷贝到临时容器
		jspBody.invoke(writer);
		//从临时容器中获取标签体内容
		String content = writer.toString(); 
		//改变标签体内容
		content=content.toLowerCase();
		//输出改变后标签体的内容
		this.getJspContext().getOut().write(content);
		
		/**
		 * 控制标签外内容是否输出
		 */
		throw new SkipPageException();// 抛出该异常则不输出

	}
}
