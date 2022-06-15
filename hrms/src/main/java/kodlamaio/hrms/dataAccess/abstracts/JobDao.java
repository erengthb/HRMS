package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Job;

public interface JobDao extends JpaRepository <Job,Integer> {

	/* Jpa repository verdiğimiz veri tipi için yani entity annotasyonuyla
	 * süslenmiş veri için kullanılır
	 
	 * Integer primary key alanıdır
	 * CRUD operasyonları hazır
	*/
	
	
}
 