package Exceptions;

public class NameTooShortException extends Exception {
	
	String message;

	public NameTooShortException(String message) {
		this.message = message;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
