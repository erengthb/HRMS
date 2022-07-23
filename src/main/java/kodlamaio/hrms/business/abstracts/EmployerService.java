package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.concretes.User;


public interface EmployerService   {

	List<User> getAll();
	 Result add(User users); 
	 
	 
	 String s ="select * from users"; 
}
