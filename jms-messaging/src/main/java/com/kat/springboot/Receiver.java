package com.kat.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.kat.springboot.domain.Flight;

// Message Driven Pojo
@Component
public class Receiver {
	
	private static final Logger log = LoggerFactory.getLogger(Receiver.class);
	
	// myFactory JmsListenerContainer only needed if you want to customize it
	@JmsListener(destination = "flightsQueue", containerFactory = "myFactory")
	public void receiveMessage(Flight flight) {
		log.info("Received message {}", flight);
	}

}
