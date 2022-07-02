package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployeeService;
import kodlamaio.hrms.entities.concretes.Employee;

@RestController // Controller tanımlaması
@RequestMapping ("api/employees") //kodlama.io/api/employees
public class EmployeesController {

	@Autowired
	private EmployeeService employeService;

	public EmployeesController(EmployeeService employeService) {
		super();
		this.employeService = employeService;
	}
	
	
	@GetMapping("/getall")
	
	public List<Employee> getAll(){
		
		return this.employeService.getAll();
		
	}
	
	
	
	
	
	
	
}
