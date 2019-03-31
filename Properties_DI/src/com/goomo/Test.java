package com.goomo;

import java.util.Properties;
import java.util.Set;

public class Test {
	private Properties driver;

	public Properties getDriver() {
		return driver;
	}

	public void setDriver(Properties driver) {
		this.driver = driver;
	}

	public void printdata() {
		Set keySet = driver.keySet();
		for (Object key : keySet) {
			System.out.println(key + " : " + driver.getProperty(key.toString()));
		}
	}

}
