package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;

import kodlamaio.hrms.entities.concretes.User;

@Service // bu class service görevi görecek demektir.

public class UserManager implements UserService {

	
	private UserDao userDao; // dependency injection
                             // UserDao ya erişmemiz gerek
		
	
	@Autowired  // bu annotasyon projede UserDao nun instancesi olabilecek bir tane sınıfı üretip buraya veriyor
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}


	@Override
	public List<User> getAll() {
		
		return this.userDao.findAll();
	}


	

	
	
	
	
	
	
							
}
