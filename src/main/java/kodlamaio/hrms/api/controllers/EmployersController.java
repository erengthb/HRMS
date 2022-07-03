package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.concretes.Job;


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
	
	
	@PostMapping("/add")                               // Veri gönderilen bir metotsa PostMapping annotasyonu yazılır
	public Result add(@RequestBody Employer employer) {  //  @RequestBody hem istek yapıyor hem de al datan budur der.
		                                        // @RequestBody swagger ui daki alanları databasedeki alanlarla eşleyip veriyi onun içine gönderiyor
		
		return this.employerService.add(employer);
		
	}
	
}
