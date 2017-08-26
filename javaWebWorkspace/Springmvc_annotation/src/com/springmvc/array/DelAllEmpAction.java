package com.springmvc.array;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器------------在业务方法中手收集数组参数
 * 
 * @author Nocol
 *
 */
@Controller
@RequestMapping("/emp")
public class DelAllEmpAction {
	
	/**
	 * 在业务方法中手收集数组参数
	 */
	@RequestMapping("/deleteAll")
	public String delteAll(Model model,int[] ids) {
		
		for (int id : ids) {
			System.out.println("要删除的员工编号是："+ id+" ");
		}
		
		//实际开发中可把要删除的id传给业务层
		
		model.addAttribute("msg", "批量删除成功");
		return "ok";
	}
}
