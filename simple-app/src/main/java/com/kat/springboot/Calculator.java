package com.kat.springboot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Calculator {
	
	private final Collection<Operation> operations;

	public Calculator(Collection<Operation> operations) {
		this.operations = operations;
	}
	
	public List<Integer> calculate(int leftOperand, int rightOperand) {
		List<Integer> results = new ArrayList<>();
		operations.stream()
		.forEach(operation -> {
			results.add(operation.apply(leftOperand, rightOperand));
		});
		return results;
	}

}
