package com.shri.calculator;

@FunctionalInterface
public interface Operation {

	Double perform(Double x, Double y);

}
