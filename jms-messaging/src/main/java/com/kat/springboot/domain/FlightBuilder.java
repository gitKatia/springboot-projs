package com.kat.springboot.domain;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.UUID;

public class FlightBuilder {
	
	private UUID uuid;
	private String source;
	private String destination;
	private LocalDateTime time;
	private Duration duration;
	
	public static FlightBuilder builder() {
		return new FlightBuilder();
	}
	
	public FlightBuilder uuid(UUID uuid) {
		this.uuid = uuid;
		return this;
	}
	
	public FlightBuilder source(String source) {
		this.source = source;
		return this;
	}
	
	public FlightBuilder destination(String destination) {
		this.destination = destination;
		return this;
	}
	
	public FlightBuilder time(LocalDateTime time) {
		this.time = time;
		return this;
	}
	
	public FlightBuilder duration(Duration duration) {
		this.duration = duration;
		return this;
	}
	
	public Flight build() {
		Flight flight = new Flight();
		flight.setUuid(uuid);
		flight.setSource(source);
		flight.setDestination(destination);
		flight.setDuration(duration);
		flight.setTime(time);
		return flight;
	}
}
