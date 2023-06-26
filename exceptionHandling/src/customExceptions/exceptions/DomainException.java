package customExceptions.exceptions;

public class DomainException extends RuntimeException{ //when there is only the exception is mandatory treatment, when have RumtimeException no.
	private static final long serialVersionUID = 1L; 
	
	public DomainException(String msg) {
		super(msg);
	}
}
