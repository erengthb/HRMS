package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Entity
@Data
@Table(name ="employers")
public class Employer {

	
	@Id  // Tablodaki Id alanının nasıl oldugunu söylememiz gerekiyor
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //Tablodaki Id alanının otomatik olarak artacağını söyler
	
	@NotEmpty(message = "Isim bos bırakılamaz.")
	@Column(name= "id")
	private int id ;
	
	@Column(name= "company_name")
	private String companyName;
	
	
	@Column(name= "web_address")
	private String webAdress;
	
	
	@Column(name= "phone_number")
	private String phoneNumber;
	
}
