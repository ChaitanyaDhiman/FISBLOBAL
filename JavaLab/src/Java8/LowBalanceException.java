package Java8;

public class LowBalanceException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LowBalanceException() {
		super("Low Balance!!!");
	}

}
