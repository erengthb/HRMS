package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobDao;
import kodlamaio.hrms.entities.concretes.Job;

@Service // bu class service görevi görecek demektir.

public class JobManager implements JobService {

	

	private JobDao jobDao;  // dependency injection
	                          // JobDao ya erişmemiz gerek
	
	
	@Autowired  // bu annotasyon projede JobDao nun instancesi olabilecek bir tane sınıfı üretip buraya veriyor
	
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}
	
	@Override
	public DataResult<List<Job>> getAll() {  
		
		return new SuccessDataResult<List<Job>> 
		(this.jobDao.findAll(),"Data Listelendi");
		
	}

	@Override
	public Result add(Job job) {
		
		
		
		this.jobDao.save(job);
		return new SuccessResult("Meslek Eklendi");
				
	}

	

}
