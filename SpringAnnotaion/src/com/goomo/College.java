package com.goomo;

import org.springframework.stereotype.Component;

//@Component("collegeBean") -- used to create bean object without configring in xml file 
public class College {
	  private Teacher teacher;
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public void tegtest() {
		teacher.teach();
		System.out.println("College Test method");

	}

}
