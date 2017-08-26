package com.springmvc.list;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器-----在业务方法中收集list<javaBean>
 * 
 * @author Nocol
 *
 */
@Controller
@RequestMapping("/emp")
public class ListAction {
	/**
	 * 在业务方法中收集list<javaBean>
	 */
	@RequestMapping("/addAll")
	public String addAll(Bean bean, Model model) {
		
		for(Emp emp:bean.getEmpList()){
			System.out.println("要注册的员工："+emp.getUsername()+"---"+emp.getSalary());
		}
		
		//将empList经业务层传持久层批处理进数据库
		
		model.addAttribute("msg", "批量添加成功");
		
		return "ok";
	}
}
