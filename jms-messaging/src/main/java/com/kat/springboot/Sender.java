package com.kat.springboot;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kat.springboot.domain.Flight;
import com.kat.springboot.domain.FlightBuilder;

@Component
public class Sender {
	
	private static final Logger log = LoggerFactory.getLogger(Sender.class);
	
	@Autowired
	JmsTemplate jmsTemplate;
	
	@Scheduled(fixedRate = 50000)
	public void sendMessage() {

		Flight flight = FlightBuilder.builder().uuid(UUID.randomUUID()).source("" + UUID.randomUUID())
				.destination("" + UUID.randomUUID()).time(LocalDateTime.now()).duration(Duration.ofMillis(1000))
				.build();
		log.info("Sending the message {}", flight);
		jmsTemplate.convertAndSend("flightsQueue", flight);
	}

}
