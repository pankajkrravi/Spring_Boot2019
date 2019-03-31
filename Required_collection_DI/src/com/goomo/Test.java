package com.goomo;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test {
	private Vector fruits;

	private TreeSet cricketers;
	private Hashtable countrycap;

	public Vector getFruits() {
		return fruits;
	}

	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}

	public TreeSet getCricketers() {
		return cricketers;
	}

	public void setCricketers(TreeSet cricketers) {
		this.cricketers = cricketers;
	}

	public Hashtable getCountrycap() {
		return countrycap;
	}

	public void setCountrycap(Hashtable countrycap) {
		this.countrycap = countrycap;
	}

	public void printData() {
		System.out.println("============FRUITS DATA=================");
		for (Object fruit : fruits) {
			System.out.println(fruit);
		}
		System.out.println("%%%%%%%%%%% CRICKETER NAME $$$$$$$$$$$$$");
		for (Object cricketer : cricketers) {
			System.out.println(cricketer);

		}
		System.out.println("********** COUNTRY AND CAPITAL **************");
		Set keys = countrycap.keySet();
		for (Object key : keys) {
			System.out.println("Country " + key + "         " + countrycap.get(key));

		}
	}
}
