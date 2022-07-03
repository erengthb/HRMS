package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.concretes.Job;


@Service   // bu class service görevi görecek demektir.
public class EmployerManager implements EmployerService {

	
	@Autowired  // bu annotasyon projede EmployerDao nun instancesi olabilecek bir tane sınıfı üretip buraya veriyor
	private EmployerDao employerDao; // dependency injection
                                       // EmployerDao ya erişmemiz gerek
	
	
	
	
	
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}




	@Override
	public List<Employer> getAll() {
		
		return this.employerDao.findAll();
	}




	@Override

	public Result add(Employer employer) {
		
		
		
		this.employerDao.save(employer);
		return new SuccessResult("İşveren başarıyla sisteme eklendi");
				
	}


}
