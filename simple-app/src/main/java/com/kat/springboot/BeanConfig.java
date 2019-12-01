package com.kat.springboot;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	
	@Bean
	Collection<Operation> operations() {
		Collection<Operation> operations = new ArrayList<>();
		operations.add(new AddOperation());
		operations.add(new MultiplyOperation());
		return operations;
	}

	@Bean
	public Calculator calculator(Collection<Operation> operations) {
		return new Calculator(operations);
	}
}
