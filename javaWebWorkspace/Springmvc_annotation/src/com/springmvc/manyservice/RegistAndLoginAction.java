package com.springmvc.manyservice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ������------�������ҵ�񷽷�----����ҵ�񷽷���д����ͨ�������ռ�����
 * 
 * @author Nocol
 *
 */
@Controller
@RequestMapping(value="/user") // �������ҵ�񷽷��ĸ�·��
public class RegistAndLoginAction {
	/**
	 * ע��ҵ��
	 * @param model
	 * @return
	 */
	
	//ֻע��������·������ʱ��Ȼ���е���post���󣬵��Ǵӵ�ַ������get��ʽ��Ȼ�����ύ
	//�ɸ�����Ҫ����ֻ�޶�post��������
	@RequestMapping(method=RequestMethod.POST ,value="/regist")  //�������ҵ�񷽷�����·�� ----����Ҫ������.action
	
	/**
	 * ����ҵ�񷽷���д����ͨ�������ռ�����
	 * @param model
	 * @param name
	 * @param gender
	 * @return
	 */
								    //��ͨ������Ҫ�����name����ֵ��ͬ
	public String regist(Model model,String username,String password) {
		
		System.out.println("regist:"+"---"+username+"---"+password);
		
		model.addAttribute("msg", "regist success");
		
		return "success";
	}
	
	/**
	 * ��¼ҵ��
	 * @param model
	 * @return
	 */
	
	//�����ü��ܽ���post�����ֿ��Խ���get����(�����Ʒ�����ΪĬ��)
	@RequestMapping(method={RequestMethod.POST,RequestMethod.GET} ,value="/login")
	/**
	 * ����ҵ�񷽷���д����ͨ�������ռ�����
	 * @param model
	 * @param name
	 * @return
	 */
	public String login(Model model,String username) {
		
		System.out.println("login:"+"---"+username);
		
		model.addAttribute("msg", "login success");
		
		return "success";
	}
}
