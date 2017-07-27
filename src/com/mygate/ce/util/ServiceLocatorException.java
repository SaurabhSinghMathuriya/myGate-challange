
package com.mygate.ce.util;



public class ServiceLocatorException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for ServiceLocatorException
	 * @param pExceptionMsg
	 */
	public ServiceLocatorException(String pExceptionMsg){
		super(pExceptionMsg);
	} 
	
	/**
	 * Constructor for ServiceLocatorException
	 * @param pExceptionMsg
	 * @param pException
	 */
	public ServiceLocatorException(String pExceptionMsg, Throwable pException){
		super(pExceptionMsg, pException);
	} 
}

