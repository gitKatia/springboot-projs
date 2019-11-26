package com.kat.springboot;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {
	
	private static final Logger log = LoggerFactory.getLogger(Scheduler.class);
	
	@Scheduled(fixedRate = 5000)
	public void printInfo() {
		LocalDateTime now = LocalDateTime.now();
		log.info("Be aware that time is now {}",now);
	}

}
