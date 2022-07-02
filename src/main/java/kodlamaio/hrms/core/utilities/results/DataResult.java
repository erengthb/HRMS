package kodlamaio.hrms.core.utilities.results;

public class DataResult<T> extends Result {  //Herhangi bir veri tipi döndürülebileceği için DataResult<T> yani generic tanımlanmalıdır.

	 private T data ;
	
	public DataResult( T data , boolean succes, String message) {
		super(succes, message); // super result classını ifade ediyor
		
		this.data=data; // cpnstuctordaki datayı set ettik
		
		
	}
	
	public DataResult( T data , boolean succes) {
		super(succes); // super result classını ifade ediyor
		
		this.data=data; // cpnstuctordaki datayı set ettik
		
		
	}
	
	public T getData() {   //bu classtaki datayı get ettik
		
		return this.data;
		
	}
	
	
	

}
