package com.assignment.company.controller;

//to phirr  package com.assignment.company.controller;

import com.assignment.company.service.EmployeeServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.assignment.company.model.Employee;
import com.assignment.company.repositry.EmployeeRepository;

@RestController
@RequestMapping("company")
// it is the combination of @responsebody and @controller
public class EmployeeController {

	@Autowired
	EmployeeServicesImpl servicesimpl;

	//  Create Employee Record
	@PostMapping("/addEmployee")
	public Object addEmployee(@RequestBody Employee employee) {
		return servicesimpl.addEmployee(employee);
	}

	//  List all employees
	@GetMapping("/getAllEmployee")
	public Object getall() {
		return servicesimpl.getall();

	}

	// Get employees by it's id
	@GetMapping("/getEmployeeById/{id}")
	public Object getEmployeeById(@PathVariable long id){
		return  servicesimpl.getEmployeeById(id);
	}


	// Update/Edit selected employee details
	@PutMapping("/updateEmployee/{id}")
	public Object updateEmployee(@PathVariable long id, @RequestBody Employee employee) {
		return servicesimpl.updateEmployee(id,employee);
	}

	// Remove selected employee record
	@DeleteMapping("/removeEmployee/{id}")
	public Object removeEmployee(@PathVariable long id) {
		return servicesimpl.removeEmployee(id);
	}

}
