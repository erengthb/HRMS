package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployeeService;
import kodlamaio.hrms.dataAccess.abstracts.EmployeeDao;
import kodlamaio.hrms.entities.concretes.Employee;

@Service // bu class service görevi görecek demektir.
public class EmployeeManager implements EmployeeService {

	
	private EmployeeDao employeeDao;// dependency injection
                                      // EmployeDao ya erişmemiz gerek
	
	
	@Autowired   // bu annotasyon projede EmployeeDao nun instancesi olabilecek bir tane sınıfı üretip buraya veriyor
	
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}


	@Override
	public List<Employee> getAll() {
		
		return this.employeeDao.findAll();
	}

}
