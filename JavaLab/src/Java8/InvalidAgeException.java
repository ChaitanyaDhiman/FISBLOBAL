package Java8;

public class InvalidAgeException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeException() {
		super("Age is either >100 or < 0");
	}

}
