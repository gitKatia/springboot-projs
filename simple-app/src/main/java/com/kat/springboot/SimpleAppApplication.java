package com.kat.springboot;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SimpleAppApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(SimpleAppApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SimpleAppApplication.class, args);
		int beanDefinitionCount = context.getBeanDefinitionCount();
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		Arrays.sort(beanDefinitionNames);
		logger.info("Number of  beans defined: {}", beanDefinitionCount);
		Arrays.asList(beanDefinitionNames).forEach( beanDefinitionName -> logger.info("Bean name: {}", beanDefinitionName));
		Calculator calculator = context.getBean(Calculator.class);
		List<Integer> results = calculator.calculate(3, 2);
		logger.info("Results {}", results);
	}

}
