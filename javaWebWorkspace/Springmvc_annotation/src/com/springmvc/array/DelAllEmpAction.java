package com.springmvc.array;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ������------------��ҵ�񷽷������ռ��������
 * 
 * @author Nocol
 *
 */
@Controller
@RequestMapping("/emp")
public class DelAllEmpAction {
	
	/**
	 * ��ҵ�񷽷������ռ��������
	 */
	@RequestMapping("/deleteAll")
	public String delteAll(Model model,int[] ids) {
		
		for (int id : ids) {
			System.out.println("Ҫɾ����Ա������ǣ�"+ id+" ");
		}
		
		//ʵ�ʿ����пɰ�Ҫɾ����id����ҵ���
		
		model.addAttribute("msg", "����ɾ���ɹ�");
		return "ok";
	}
}
