package com.telusko.WebApp1.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.telusko.WebApp1.model.Implementer;

@Controller
public class RegController 
{
	@GetMapping("/register")
	public String home()
	{
		return "register";
	}
	
//	@PostMapping("/reg")
//	public String register(Map<String, Object>map, HttpServletRequest request)
//	{
////		request.getParameter(name)
////		request.getParameter(name)
////		request.getParameter(name)
////		request.getParameter(name)
////		request.getParameter(name)
//		map.put("impl", impl);
//		return "response";
//	}
	
	@PostMapping("/register")
	public String register(Map<String, Object>map, @ModelAttribute("impl")Implementer impl)
	{
		System.out.println(impl);
		map.put("impl", impl);
		return "response";
	}
	
	
}
