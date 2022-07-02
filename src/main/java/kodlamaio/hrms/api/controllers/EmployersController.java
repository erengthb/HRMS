package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.entities.concretes.Employer;


@RestController   //Controller tanımlaması
@RequestMapping("api/employers")  //RequestMapping 'in görevi dış dünyadan /api/products gibi bir istek gelirse aşşağıdaki controller karşılayacak


public class EmployersController {

	
	@Autowired
	private EmployerService employerService;

	public EmployersController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	
	

	@GetMapping("/getall")
	public List<Employer> getAll(){
	return this.employerService.getAll();
	
}
	
}
