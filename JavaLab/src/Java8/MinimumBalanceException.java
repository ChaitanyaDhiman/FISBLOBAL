package Java8;

public class MinimumBalanceException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MinimumBalanceException() {
		super("Balance below Minimum, cannot withdraw.");
	}

}
