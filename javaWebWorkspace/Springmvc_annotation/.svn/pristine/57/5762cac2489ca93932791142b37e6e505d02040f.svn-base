package com.springmvc.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器------在业务控制方法中写入User，Admin多个模型收集参数
 * 
 * 改进：将User和Admin包装成同一个实体，通过Modle对相关将实体带回实体
 * 
 * @author Nocol
 *
 */
@Controller
@RequestMapping("/person")
public class UserAndAdminAction {
	
	/**
	 * 自定义类型装换器
	 */
	@InitBinder
	protected void initBinder(HttpServletRequest request,ServletRequestDataBinder binder) throws Exception {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true));
	}
	/**
	 * 在同一个action中的同一个业务方法中写入对个模型收集参数
	 * @param admin
	 * @param user
	 * @return
	 */
	@RequestMapping("/regist")
	public String regist(Bean bean,Model model){
		
		System.out.println("admin:"+bean.getAdmin());
		System.out.println("user:"+bean.getUser());
		
		//将User和Admin绑定到Model对象中
		model.addAttribute("admin",bean.getAdmin());
		model.addAttribute("user",bean.getUser());
		
		return "03_person";
	}
}
