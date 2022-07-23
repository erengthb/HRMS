package kodlamaio.hrms.entities.concretes;





import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor


@Table (name="users")
public class User {
	
	
	
	@Id  // Tablodaki Id alanının nasıl oldugunu söylememiz gerekiyor
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //Tablodaki Id alanının otomatik olarak artacağını söyler
   
	
	@Column ( name = "id" )
	private int id;
	 
	
	
	@Email
	@Pattern(regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")

	@NotBlank
	@Column ( name = "email")
	private String email;
	
	
	@Column ( name = "first_name")
	private String firstName;
	
	@Column ( name = "type")
	private String type;
	

	@Column ( name = "last_name")
	private String lastName;
	
	@NotBlank
	@Column ( name = "password")
	private String password;
	
	@Column ( name = "tcno")
	private String tcNo;
	
	@NotBlank
	@Column ( name = "birthofdate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy")
	private Date date;
	
	@NotBlank
	@Column ( name = "repeatpassword")
	private String repeatPassword;
	

}
