package com.springmvc.adapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * Ա����������ʵ��Controller�ӿڣ�
 * 
 * ʵ��Controller�ӿڵı׶ˣ�
 * 1��ʹ�������
 * 2�������ݹ����Ĳ������࣬�÷����ռ����㣨���Կ���ʹ������Action��ȥ�̳��ࣩ
 * 
 * @author Nocol
 *
 */
public class EmpAction implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView modelAndView=new ModelAndView();
		
		request.setCharacterEncoding("utf-8");
		
		//��ȡԱ������
		String name = request.getParameter("username");
		System.out.println("Ա��������"+name);
		//��װԱ������
		modelAndView.addObject("msg", name);
		//��װ��ͼ·��
		modelAndView.setViewName("/jsp/success.jsp");
		return modelAndView;
	}

}
