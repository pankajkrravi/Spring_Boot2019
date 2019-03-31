package com.goomo.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.goomo.Test;

public class Client {

	public static void main(String[] args) {
		// find resource
		Resource r = new ClassPathResource("/resources/spring.xml");
		// load cml into container
		BeanFactory factory = new XmlBeanFactory(r);
		Test bean = (com.goomo.Test) factory.getBean("t");
		bean.hello();
		Test bean2 = (com.goomo.Test) factory.getBean("t");
		bean2.hello();
		Test bean3 = (com.goomo.Test) factory.getBean("t");
		bean3.hello();
	}
}
