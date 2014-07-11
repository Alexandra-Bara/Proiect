package com.evozone.usermanagement.persistence.file;

import com.evozone.usermanagement.persistence.PersistenceException;

public class FilePersistenceException extends PersistenceException {

	/**
	 * 
	 */
	public FilePersistenceException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public FilePersistenceException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public FilePersistenceException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public FilePersistenceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public FilePersistenceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
