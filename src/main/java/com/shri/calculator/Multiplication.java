package com.shri.calculator;

public class Multiplication implements Operation {

	@Override
	public Double perform(Double x, Double y) {
		return x * y;
	}

}
