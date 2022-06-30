package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.entities.concretes.User;

@RestController //Controller tanımlaması
@RequestMapping("api/users")   // kodlama.io/api/jobs

public class UsersController {

	
	@Autowired
	
	private UserService userService ;

	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	
	@GetMapping("/getall")          // Veri istenen bir methodsa GetMapping  annotasyonu yazılır
	                           // kodlama.io/api/users/getall isteği gelirse aşşağıdaki List çalışacak
	public List<User> getAll(){
		
		return this.userService.getAll();
	}
	
	
}
