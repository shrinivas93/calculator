package com.shri.calculator;

public class Division implements Operation {

	@Override
	public Double perform(Double x, Double y) {
		if (y == 0) {
			return Double.POSITIVE_INFINITY;
		}
		return x / y;
	}

}
