package com.mkyong.testng.examples.helloworld;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Testng<RandomEmailGenerator> {

	@Test()
	public void testEmailGenerator() {
		int email = 0;

		//RandomEmailGenerator obj = new RandomEmailGenerator();
		//String email = obj.generate();

		Assert.assertNotNull(email);
		Assert.assertEquals(email, "feedback@yoursite.com");

	}

}