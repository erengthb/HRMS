package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobService;
import kodlamaio.hrms.entities.concretes.Job;

@RestController //Controller tanımlaması
@RequestMapping("/api/jobs")   // kodlama.io/api/jobs

//RequestMapping 'in görevi dış dünyadan /api/products gibi bir istek gelirse aşşağıdaki controller karşılayacak



public class JobsController {

	
	@Autowired  //Job Serviceyi projede tarar ve  JobService yi kim implemente etmiş ona bakar.
	
	private JobService jobService;
	
	
	public JobsController(JobService jobService) {
		super();
		this.jobService = jobService;
	}

	
	
	
	@GetMapping("/getall") // Veri istenen bir methodsa GetMapping  annotasyonu yazılır
	// kodlama.io/api/jobs/getall isteği gelirse aşşağıdaki List çalışacak
	
	public List<Job> getAll() {
		return this.jobService.getAll();
		
		
		
	}
	
	
	
	
	
}
