package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data //Lombok

@Entity  // Entity Annotasyonu

@Table(name="job_titles") // Veri Tabanındaki hangi tabloya karşılık geldiğine işaret eder

public class Job {
	
	@Id  // tablodaki generated value yani id alanının nasıl olduğunu söylememiz gerekiyor
	@GeneratedValue  //Tablodaki id alanının otomatik olarak artacağını söyler
	
	
	@Column ( name = "id") //Hangi kolona karşılık geldiğini gösterir
	private int id ;
	@Column (name = "title") 
	private int jobTitle;
	

}
