package com.kat.springboot.domain;

public enum Genre {
	
	ROCK("rock"), METAL("metal"), POP("pop"), CLASSIC("classic");
	
	private String code;
	
	Genre(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}

}
