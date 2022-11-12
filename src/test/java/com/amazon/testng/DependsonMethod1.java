package com.amazon.testng;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class DependsonMethod1 {

	@Test
	public void booking() {
		System.out.println("Select the place and book the ticket...");
		assertTrue(true);
	}
	
	@Test(priority=-1, dependsOnMethods = {"booking"})
	public void pnrStatus() {
		System.out.println("enter the booking number and search for the status");
		
	}
}
