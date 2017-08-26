package com.springmvc.forward_redirect;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器-----结果的转发和重定向可共享数据
 * 
 * @author Nocol
 *
 */
@Controller
@RequestMapping("/emp")
public class EmpAction {
	@RequestMapping("/find")
	public String findById(int id) {
		
		System.out.println("要查询的用户id："+id);
		
//		/**
//		 * 将查询结果转发到Action中的另一个业务方法内，再次请求转发 
//		 */
//		return "forward:/emp/update.action";
		
		/**
		 * 重定向------//也可以存入session域中在取
		 */
		return "redirect:/emp/update.action?id="+id+"";
	}
	
	@RequestMapping("/update")
	public String updateById(int id,Model model) {
		
		System.out.println("要修改的用户id："+id);
		
		model.addAttribute("msg", "更新用户成功");
		
		return "ok";
	}
}
