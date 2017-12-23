package com.shri.calculator;

public class Calculator {

	public Double calculate(Operation operation, Double x, Double y) {
		return operation.perform(x, y);
	}

}
