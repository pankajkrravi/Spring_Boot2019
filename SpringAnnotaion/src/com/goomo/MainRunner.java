package com.goomo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunner {

	public static void main(String[] args) {
		
		//way - >1
		// ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
		/*
		 * //way - > 2 ApplicationContext applicationContext = new
		 * AnnotationConfigApplicationContext(CollegeConfig.class);
		 * System.out.println("BEAN .XML IS LOADED  !!!"); Object bean =
		 * applicationContext.getBean("collegeBean", College.class); College college =
		 * (College) bean; System.out.println("The college obj is created" + college);
		 */
		//Way -> 3
		ApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
		//College bean = (College)context.getBean("getCollegeBean",College.class);
		College bean=(College)context.getBean("factoryBean",College.class);
		System.out.println("Collecge obj is created "+bean);
		 bean.tegtest();
		
	}
}
