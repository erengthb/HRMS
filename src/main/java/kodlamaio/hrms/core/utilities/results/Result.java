package kodlamaio.hrms.core.utilities.results;

public class Result {  // super type olarak geçer

	private boolean succes;
	private String message;
	
	public Result(boolean succes) {
		this.succes=succes;
		
	}
	
	public Result (boolean succes, String message) {
		this(succes);   // bu classtaki tek parametreli constructoru çağırır.
		this.message=message;
		
		
	}

	public boolean isSucces() {
		return succes;
	}


	public String getMessage() {
		return message;
	}

	
	
}
