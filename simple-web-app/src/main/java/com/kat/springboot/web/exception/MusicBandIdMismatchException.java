package com.kat.springboot.web.exception;

public class MusicBandIdMismatchException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MusicBandIdMismatchException() {
		super();
	}
	
	public MusicBandIdMismatchException(String message) {
		super(message);
	}
	
	public MusicBandIdMismatchException(Throwable cause) {
		super(cause);
	}
	
	public MusicBandIdMismatchException(String message, Throwable cause) {
		super(message, cause);
	}

}
