package com.redhat.handler;

public abstract class BaseMultiplierHandler implements MultiplierHander {

	protected MultiplierHander nextHander;

	BaseMultiplierHandler(MultiplierHander handler) {
		this.nextHander = handler;
	}

	public abstract int getMultiplier();

	public abstract String getMultiplierResult();

	@Override
	public String multiplierResult(int n) {
		String result = String.valueOf(n);
		if (n % getMultiplier() == 0) {
			result = getMultiplierResult();
		} else if (this.nextHander != null) {
			result = this.nextHander.multiplierResult(n);
		}
		return result;
	}
}
