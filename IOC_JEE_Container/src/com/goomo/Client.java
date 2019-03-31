package com.goomo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/resource/spring.xml");
	    //check xml document
		//it will create instances
		//in spring.xml  if scope is prototype then will "validate your document" and instance will be created at the time of user request
		//
		context.getBean("t");
		context.getBean("t");
		context.getBean("t");
	
	}
}
