package kodlamaio.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name= "employees")


public class Employees extends User {
	
	
	@Id  // Tablodaki Id alanının nasıl oldugunu söylememiz gerekiyor
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //Tablodaki Id alanının otomatik olarak artacağını söyler
	
	@Column ( name = "id")
	private  int id ;
	
	@Column ( name = "first_name")
	private String firstName;
	
	

	@Column ( name = "last_name")
	private String lastName;
	
	
	public Employees(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Employees(int id, String firstName, String lastName,String email,String password,String tcNo ,Date date,String repeatPassword) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	    
	}
	
	
	
	
	
	

}
