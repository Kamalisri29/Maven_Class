package com.amazon.testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExe {
    @Parameters({"browser"})
	@BeforeTest
	public void beforetest(String bbrowser) {
		System.out.println(bbrowser);
	}
    @Test(priority=0)
    public void Test1() {
    	System.out.println("test");
    }
}
