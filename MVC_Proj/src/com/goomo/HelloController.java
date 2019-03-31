package com.goomo;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		/*
		 * SimpleUrlHandlerMapping handlerMapping=new SimpleUrlHandlerMapping();
		 * handlerMapping.setMappings("mappings");
		 */
		String name = req.getParameter("name");
		Map map=new HashMap();
		map.put("msg", "Hello everyone"+ name);
		ModelAndView andView=new ModelAndView();
		return andView;
	}

}
