package com.goomo;

public class Car {
	private String carnames[];
	private Engine engine[];

	public String[] getCarnames() {
		return carnames;
	}

	public void setCarnames(String[] carnames) {
		this.carnames = carnames;
	}

	public Engine[] getEngine() {
		return engine;
	}

	public void setEngine(Engine[] engine) {
		this.engine = engine;
	}

	public void printCarData() {
		for (String car : carnames) {
			System.out.println(car);
		}
		for (Engine e : engine) {
			System.out.println(e.getModelYear());
		}
	}

}
