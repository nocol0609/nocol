package com.ssm.controller;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.service.annotationService;

/**
 * �û�������
 * @author Nocol
 *
 */
@Controller
@RequestMapping("/shiro")
public class ShiroHandler {
	
	@Autowired
	private annotationService annoService;
	
	/**
	 * ����Ȩ��ע��
	 * ������service���õ�httpsession�е�����
	 */
	@RequestMapping("/annotation")
	public String testShiroAnnotation(HttpSession httpSession){
		
		httpSession.setAttribute("key", "this is httpsession value");
		
		annoService.testMethod();
		return "roleLimit";
	}
	
	/**
	 * �û���֤
	 */
	@RequestMapping("/login")
	public String  login(String userName,String passWord){
		
		System.out.println("�û��������룺"+userName+"---"+passWord);
		
		//��ȡ��ǰ�û�
		Subject currentUser = SecurityUtils.getSubject();
		
		//����token
		UsernamePasswordToken token=new UsernamePasswordToken(userName,passWord);
		
		//remenberMe:��¼�ɹ���ر���������´򿪣��������Ȼ�ǵã������ڷ���ĳЩ����ҳ�滹����Ҫ�ٴ���֤
		token.setRememberMe(true);
		
		//�ύ��֤
		try {
			
			currentUser.login(token);
			
		} catch (AuthenticationException e) {
			// TODO Auto-generated catch block
			
			System.out.println("��¼ʧ��");
			
			return "login";
		}
		
		boolean authenticated = currentUser.isAuthenticated();
		
		System.out.println("�Ƿ�ͨ����֤��"+authenticated);
		
		//��¼ʧ�ܺ���תҳ��
		return "index";
	}
}

