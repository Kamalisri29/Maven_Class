package com.amazon.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CbrowserTesting {
@Parameters({"browser"})
	@BeforeTest
	public void browserlaunch(String browser) {
		System.out.println(browser);
	}
	@Parameters({"stringvalue"})
	@BeforeMethod
	public void beforeMethod(String bmethod) {
		System.out.println(bmethod);
	}
	@Parameters({ "integervalue", "stringvalue" })
	@BeforeClass
	public void beforeClass(String aclass,String bclass) {
		System.out.println(aclass);
		System.out.println(bclass);
	}
	
	@Test(priority=1)
	public void test() {
		System.out.println("test");
	}
}
