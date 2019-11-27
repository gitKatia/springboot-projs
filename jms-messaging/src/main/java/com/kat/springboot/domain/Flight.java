package com.kat.springboot.domain;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.UUID;

public class Flight {
	
	private UUID uuid;
	private String source;
	private String destination;
	private LocalDateTime time;
	private Duration duration;
	
	public Flight() {}
	
	public UUID getUuid() {
		return uuid;
	}
	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public Duration getDuration() {
		return duration;
	}
	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Flight [uuid=" + uuid + ", source=" + source + ", destination=" + destination + ", time=" + time
				+ ", duration=" + duration + "]";
	}
	
}
