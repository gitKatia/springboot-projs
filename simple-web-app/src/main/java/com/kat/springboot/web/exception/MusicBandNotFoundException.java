package com.kat.springboot.web.exception;

public class MusicBandNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MusicBandNotFoundException() {
		super();
	}
	
	public MusicBandNotFoundException(String message) {
		super(message);
	}
	
	public MusicBandNotFoundException(Throwable cause) {
		super(cause);
	}
	
	public MusicBandNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}
