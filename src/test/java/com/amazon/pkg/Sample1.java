package com.amazon.pkg;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.adacitin.commonutil.CommonUtill;


public class Sample1 extends CommonUtill{

	@BeforeSuite
	public void beforesuite() {
		System.out.println("before site");
	}
	@Test(priority=-1)
	public void me() {
		System.out.println("test1");
	}
	@Test(priority=0)
	public void mee() {
		System.out.println("test2");
	}
}
