package kodlamaio.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name="users")
public class User {
	
	
	
	@Id  // Tablodaki Id alanının nasıl oldugunu söylememiz gerekiyor
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //Tablodaki Id alanının otomatik olarak artacağını söyler
   
	
	@Column ( name = "id")
	private int id;
	
	@Column ( name = "name")
	private String name;
	
	

	@Column ( name = "surname")
    private String surName;
	
	@Column ( name = "email")
	private String email;
	
	
	@Column ( name = "password")
	private String password;
	
	@Column ( name = "tcno")
	private String tcNo;
	
	@Column ( name = "birthofdate")
	private Date date;
	
	@Column ( name = "repeatpassword")
	private String repeatPassword;
	

}
