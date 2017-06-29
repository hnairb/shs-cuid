/* 
 * Copyright 2014 (C) Sears Holdings India  
 *  
 * Created on : Mar 18, 2014
 * Author     : Ranjit Bhakta   
 * 
 *----------------------------------------------------------------------------- 
 * Revision History (Release 1.0.0.0) 
 *----------------------------------------------------------------------------- 
 * VERSION     AUTHOR/      DESCRIPTION OF CHANGE 
 * OLD/NEW     DATE                RFC NO 
 *----------------------------------------------------------------------------- 
 * --/1.0  | Ranjit Bhakta  | Initial Create. 
 *         | Mar 18, 2014   | 
 *---------|--------------- |--------------------------------------------------- 
 */
package com.searshc.hs.som.thm.exception;

/**
 * This exception class is used when there is some exception
 * in web service call
 * 
 * @author Ranjit Bhakta
 * @version 1.0, Mar 18, 2014
 *
 */
public class ServiceException extends Exception {
	private static final long serialVersionUID = -8718304852367678794L;

	/**
	 * Default Constructor.
	 */
	public ServiceException() {
		super();
	}

	/**
	 * Constructor with.
	 * 
	 * @param message
	 *            String
	 */
	public ServiceException(String message) {
		super(message);
	}

	/**
	 * Constructor with.
	 * 
	 * @param message
	 *            String
	 * @param cause
	 *            Throwable
	 */
	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * 
	 * Constructor with.
	 * 
	 * @param cause
	 *            Throwable
	 */
	public ServiceException(Throwable cause) {
		super(cause);
	}
}