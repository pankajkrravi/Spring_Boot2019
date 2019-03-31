package com.goomo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunner {  
	public static void main(String[] args) {
		ApplicationContext  applicationContext=new ClassPathXmlApplicationContext("/resource/spring.xml");
		Object bean = applicationContext.getBean("t");
		Test t=(Test)bean;
		t.hello("ABCDE");
	}

}
