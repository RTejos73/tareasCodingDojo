package com.rtejos.selfjoin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rtejos.selfjoin.models.Employees;
import com.rtejos.selfjoin.service.EmployeedService;

@Controller
@RequestMapping("/")
public class EmployeesController {
	
	@Autowired
	EmployeedService employeedService;
	
	@RequestMapping(value="managers", method=RequestMethod.GET)
	public List<Employees> getEmployees(@RequestParam("id") Long id) {
		return employeedService.findEmployee(id).getEmpleados();
	}
	
	// Employee finds manager
	@RequestMapping(value="employees", method=RequestMethod.GET)
	public Employees getManager(@RequestParam("id") Long id) {
		return employeedService.findEmployee(id).getManager();
	}
	
	// Creates a new employee
	@RequestMapping(value="employees/new", method=RequestMethod.GET)
	public Employees newEmployee(@RequestParam("firstname") String firstName, @RequestParam("lastname") String lastName) {
		return employeedService.saveEmployee(new Employees(firstName, lastName));
	}
	
	// Adds a manager to an employee
	@RequestMapping(value="employees/update/{id}", method=RequestMethod.GET)
	public Employees addManager(@PathVariable("id") Long eId, @RequestParam("managerid") Long mId) {
		Employees employee = employeedService.findEmployee(eId);
		employee.setManager(employeedService.findEmployee(mId));
		return employeedService.saveEmployee(employee);
	}
	
	

}
