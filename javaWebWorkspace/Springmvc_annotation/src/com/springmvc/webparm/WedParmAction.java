package com.springmvc.webparm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器Action-----在业务方法内传入web参数
 * 
 * @author Nocol
 *
 */
@Controller
@RequestMapping("/user2")
public class WedParmAction {
	/**
	 * 传入web参数
	 * @param request
	 * @param response
	 */
	@RequestMapping("/regist")
	public String regist(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username+"---"+password);
		
		//保存到session域中
		request.getSession().setAttribute("username", username);
		request.getSession().setAttribute("password", password);
		
		/**
		 * 当传入web参数的Action中request转发和spingmvc返回路径转发同时存在时，实际为request转发
		 */
		//转发到success.jsp
		request.getRequestDispatcher("/success.jsp").forward(request, response);
		
		//Springmvc中返回的视图路径是用的 转发（提倡）
		return "success";
	}
}
