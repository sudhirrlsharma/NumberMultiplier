package com.redhat.handler;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HatMultiplierHanderTest {
	
	MultiplierHander classUnderTest;
	
	@Before
	public void setup(){
		this.classUnderTest = new HatMultiplierHander(null);
	}


	@Test
	public void testMultiplierResultWithMultiplierOf5() {
		Assert.assertEquals("Hat", classUnderTest.multiplierResult(10));
	}
	

	@Test
	public void testMultiplierResultWithOtherNumber() {
		Assert.assertEquals("9", classUnderTest.multiplierResult(9));
	}

}
