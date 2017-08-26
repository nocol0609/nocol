package com.springmvc.list;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ������-----��ҵ�񷽷����ռ�list<javaBean>
 * 
 * @author Nocol
 *
 */
@Controller
@RequestMapping("/emp")
public class ListAction {
	/**
	 * ��ҵ�񷽷����ռ�list<javaBean>
	 */
	@RequestMapping("/addAll")
	public String addAll(Bean bean, Model model) {
		
		for(Emp emp:bean.getEmpList()){
			System.out.println("Ҫע���Ա����"+emp.getUsername()+"---"+emp.getSalary());
		}
		
		//��empList��ҵ��㴫�־ò�����������ݿ�
		
		model.addAttribute("msg", "������ӳɹ�");
		
		return "ok";
	}
}
