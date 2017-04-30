package com.project.dao;

public class DaoException extends Exception 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DaoException() {
		super();
	}
	
	public DaoException(Throwable origException) {
		super(origException);
		System.out.println("Inside my DaoException");
		origException.getMessage();
		
	}

	public DaoException(String message) {
		super(message);
	}
	
}