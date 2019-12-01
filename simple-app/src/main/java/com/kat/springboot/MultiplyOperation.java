package com.kat.springboot;

public class MultiplyOperation implements Operation {

	@Override
	public int apply(int leftOperand, int rightOperand) {
		return leftOperand * rightOperand;
	}

}
