package com.springmvc.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Springmvc --other
 * @author Nocol
 *
 */

@Controller
@RequestMapping("test")
public class test {
	
	@RequestMapping("test1")
	public String test1(String name){
		
		
		return "test";
	}
}
