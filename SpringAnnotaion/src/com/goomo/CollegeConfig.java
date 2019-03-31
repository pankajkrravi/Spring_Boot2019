package com.goomo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.goomo")
public class CollegeConfig {
	@Bean(name="factoryBean")// way to create collegeBean
	public College getCollegeBean() //method name will be act as "beanid"

	{
		College college=new College();
		college.setTeacher(mathTeacher());
		return new College();
	}
	@Bean
    public Principal getPrincipalbean()
    {
    	return new Principal();
    }
	@Bean
	public Teacher mathTeacher() {
		return new MathTeacher();
	}
}