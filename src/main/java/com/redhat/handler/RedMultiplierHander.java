package com.redhat.handler;

public class RedMultiplierHander extends BaseMultiplierHandler {

	public RedMultiplierHander(MultiplierHander nextHandler) {
		super(nextHandler);
	}

	public RedMultiplierHander() {
		super(null);
	}

	static final int RED_MULTIPLIER = 2;

	@Override
	public int getMultiplier() {
		return RED_MULTIPLIER;
	}

	@Override
	public String getMultiplierResult() {
		return "Red";
	}
}