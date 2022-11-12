package com.amazon.testng;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependsonmethod3 {

	@Ignore
	@Test(priority = 1)
	public void test() {
		System.out.println("test");
		//assertTrue(false,"message related validation of that method");
	}

	@Test(priority = 0,dependsOnMethods = {"test"} )
	public void test1() {
		System.out.println("test1");
	}

}
