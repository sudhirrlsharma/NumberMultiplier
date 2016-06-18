package com.redhat.handler;

public class HatMultiplierHander extends BaseMultiplierHandler {
	public HatMultiplierHander(MultiplierHander nextHandler) {
		super(nextHandler);
	}

	static final int HAT_MULTIPLIER = 5;

	@Override
	public int getMultiplier() {
		return HAT_MULTIPLIER;
	}

	@Override
	public String getMultiplierResult() {
		return "Hat";
	}

}