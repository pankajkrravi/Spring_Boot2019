package com.goomo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunner {
	private static final Object Car = null;

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resource/spring.xml");
		Object bean = context.getBean("c");
		Car c=(Car)bean;
		c.printCarData();
	}

}
