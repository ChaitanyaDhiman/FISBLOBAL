package Java8;

public class InAppropriateAgeException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InAppropriateAgeException() {
		super("Age is less than 18....");
	}

}
