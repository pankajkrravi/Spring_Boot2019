package com.MainRunner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.goomo.Test;

public class main_Runer {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resource/spring.xml");
		Object bean = applicationContext.getBean("t");
		Test t = (Test) bean;
		t.printdata();
	}
}
