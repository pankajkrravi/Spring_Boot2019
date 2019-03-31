package com.goomo;


public class Car {
	public Car() {
		// TODO Auto-generated constructor stub
		System.out.println("Car constructor !!!!");
	}
	
	 private String carname;
	 private Engine engine;
	 public void setCarname(String carname) {
		this.carname = carname;
	}
	 public void setEngine(Engine engine) {
		this.engine = engine;
	}
	 public void printdata()
	 {
		 System.out.println("car name "+carname);
		 System.out.println("Model year "+engine.getModelyear());
	 }

}
