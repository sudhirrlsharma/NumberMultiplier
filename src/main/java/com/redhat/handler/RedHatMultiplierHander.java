package com.redhat.handler;


public class RedHatMultiplierHander extends BaseMultiplierHandler{
	
	public RedHatMultiplierHander(MultiplierHander nextHandler) {
		super(nextHandler);
	}

	static final int RED_HAT_MULTIPLIER = 2*5;

	@Override
	public int getMultiplier() {
		return RED_HAT_MULTIPLIER;
	}

	@Override
	public String getMultiplierResult() {
		return "RedHat";
	}
	
}