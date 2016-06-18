package com.redhat.handler;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class RedMultiplierHanderTest {
	
	MultiplierHander classUnderTest;
	
	@Before
	public void setup(){
		this.classUnderTest = new RedMultiplierHander();
	}

	@Test
	public void testMultiplierResultWithMultiplierOf2() {
		Assert.assertEquals("Red", classUnderTest.multiplierResult(4));
	}

	@Test
	public void testMultiplierResultWithOtherNumbner() {
		Assert.assertEquals("3", classUnderTest.multiplierResult(3));
	}

}
