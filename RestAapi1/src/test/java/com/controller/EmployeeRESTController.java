package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
	public class EmployeeRESTController {
		@RequestMapping(value = "/employees")
		public EmployeeListVO getAllEmployees() {
			EmployeeListVO employees = new EmployeeListVO();

			EmployeeVO empOne = new EmployeeVO(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com");
			EmployeeVO empTwo = new EmployeeVO(2, "Amit", "Singhal", "asinghal@yahoo.com");
			EmployeeVO empThree = new EmployeeVO(3, "Kirti", "Mishra", "kmishra@gmail.com");

			employees.getEmployees().add(empOne);
			employees.getEmployees().add(empTwo);
			employees.getEmployees().add(empThree);

			return employees;
		}

		@RequestMapping(value = "/employees/{id}")
		public ResponseEntity<EmployeeVO> getEmployeeById(@PathVariable("id") int id) {
			if (id <= 3) {
				EmployeeVO employee = new EmployeeVO(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com");
				return new ResponseEntity<EmployeeVO>(employee, HttpStatus.OK);
			}
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
	}

}
