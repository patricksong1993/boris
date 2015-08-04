package com.blackrock.boris.exceptions;

public class BorisInternalException extends Exception {

	private static final long serialVersionUID = 1L;

	public BorisInternalException() {
		super();
	}

	public BorisInternalException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BorisInternalException(String message, Throwable cause) {
		super(message, cause);
	}

	public BorisInternalException(String message) {
		super(message);
	}

	public BorisInternalException(Throwable cause) {
		super(cause);
	}
	
	
}
