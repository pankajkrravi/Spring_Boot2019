package com.controller;

import org.springframework.context.annotation.Configuration;

@Configuration
	public class RESTConfiguration
	{
	    @Bean
	    public View jsonTemplate() {
	        MappingJackson2JsonView view = new MappingJackson2JsonView();
	        view.setPrettyPrint(true);
	        return view;
	    }
	     
	    @Bean
	    public ViewResolver viewResolver() {
	        return new BeanNameViewResolver();
	    }
	}
}
