package com.goomo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunner {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resource/spring.xml");
		Object bean = context.getBean("t");
		Test test = (Test) bean;
		test.printData();
	}
}
