package com.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
	//BeanNameUrlHandlerMapping
		//InternalResourceViewResolver
		String name=req.getParameter("name");
		Map m=new HashMap();
		m.put("msg", "Hello"+name);
		ModelAndView andView=new ModelAndView("success",m);
		
		
		return andView;
	}

}
