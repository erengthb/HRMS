package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name ="employers")
public class Employer {

	
	@Id  // Tablodaki Id alanının nasıl oldugunu söylememiz gerekiyor
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //Tablodaki Id alanının otomatik olarak artacağını söyler
	
	@Column(name= "id")
	private int id ;
	
	@Column(name= "company_name")
	private String companyName;
	
	
	@Column(name= "web_address")
	private String webAdress;
	
	
	@Column(name= "phone_number")
	private String phoneNumber;
	
}
