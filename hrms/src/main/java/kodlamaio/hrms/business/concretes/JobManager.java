package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobService;
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
	public List<Job> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
