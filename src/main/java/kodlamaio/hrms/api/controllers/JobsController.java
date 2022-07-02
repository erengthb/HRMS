package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
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
	
	public  DataResult<List<Job>> getAll() {
		return this.jobService.getAll();
		
	}
	
	@PostMapping("/add") // Veri gönderilen bir metotsa PostMapping annotasyonu yazılır
	public Result add(@RequestBody Job job) {  //  @RequestBody hem istek yapıyor hem de al datan budur der.
		// @RequestBody swagger ui daki alanları databasedeki alanlarla eşleyip veriyi onun içine gönderiyor
		
		return this.jobService.add(job);
		
	}
	
	
	
	
	
}
