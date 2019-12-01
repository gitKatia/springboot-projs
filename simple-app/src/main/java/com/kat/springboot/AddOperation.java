package com.kat.springboot;

public class AddOperation implements Operation {

	@Override
	public int apply(int leftOperand, int rightOperand) {
		return leftOperand + rightOperand;
	}

}
