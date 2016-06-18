package com.redhat.handler;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RedHatMultiplierHanderTest {

	MultiplierHander classUnderTest;
	
	@Before
	public void setup(){
		this.classUnderTest = new RedHatMultiplierHander(null);
	}

	@Test
	public void testMultiplierResultWithMultiplierOf10() {
		Assert.assertEquals("RedHat", classUnderTest.multiplierResult(10));
	}
	
	@Test
	public void testMultiplierResultWithOtherNumber() {
		Assert.assertEquals("5", classUnderTest.multiplierResult(5));
	}

}
