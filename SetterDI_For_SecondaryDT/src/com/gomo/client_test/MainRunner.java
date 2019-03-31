package com.gomo.client_test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.goomo.Car;

public class MainRunner {
	private static final Object Car = null;

	public static void main(String[] args) {
		/*
		 * String files[] = new String[] { "resource/car.xml", "resource/engine.xml" };
		 * // load 2 xml file into container ApplicationContext context = new
		 * ClassPathXmlApplicationContext(files);
		 */
	ApplicationContext context=new ClassPathXmlApplicationContext("resource/car_engine.xml");
		Object bean = context.getBean("c");
		Car car=(Car)bean;
		car.printdata();
		
	}

}
