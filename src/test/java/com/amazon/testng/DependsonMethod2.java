package com.amazon.testng;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DependsonMethod2 {

	@Test(priority = 1)
	public void test() {
		System.out.println("test");
		assertTrue(false,"message related validation of that method");
	}

	@Test(priority=-1)
	public void test2() {
		System.out.println("test2"); 
		assertTrue(true,"message related validation of that method test2");
	}
	@Test(priority = 0,dependsOnMethods = {"test","test2"} )
	public void test1() {
		System.out.println("test1");
	}
}
