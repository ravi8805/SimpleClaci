package com.kanap.learning.customException;

public class SimplCalciExceptioHandling extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1141294317004367473L;

	public SimplCalciExceptioHandling() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SimplCalciExceptioHandling(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public SimplCalciExceptioHandling(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public SimplCalciExceptioHandling(String message) {
		super(message);
		System.out.println("Input output excetion"+message);
	}

	public SimplCalciExceptioHandling(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
}
