package reg.stu.exception;

public class RegistrationException extends Exception {
	private static final long serialVersionUID = 1L;

	/**
	 * @param message
	 */
	public RegistrationException(final String message) {
        super(message);
    }
}
