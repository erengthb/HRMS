package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




 

@Entity  // Entity Annotasyonu (Java sınıflarını veritabanı tablolarına eşleştirmek için kullanılır)

@Table(name="job_titles") // Veri Tabanındaki hangi tabloya karşılık geldiğine işaret eder

public class Job {
	
	public Job(int id, String jobTitle) {
		super();
		this.id = id;
		this.jobTitle = jobTitle;
		
	}
	
	
	@Id  // Tablodaki Id alanının nasıl oldugunu söylememiz gerekiyor
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //Tablodaki Id alanının otomatik olarak artacağını söyler

	
	
	@Column ( name = "id") //Hangi kolona karşılık geldiğini gösterir
	private int id ;
	
	
	@Column (name = "title") 
	private String jobTitle;
	

}
