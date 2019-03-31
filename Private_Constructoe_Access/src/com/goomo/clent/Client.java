package com.goomo.clent;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("com.goom.Test");
			Constructor con[]=c.getDeclaredConstructors();
						con[0].setAccessible(true);
						con[0].newInstance(null);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
