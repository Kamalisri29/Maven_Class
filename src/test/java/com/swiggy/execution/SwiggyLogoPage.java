package com.swiggy.execution;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.adacitin.commonutil.CommonUtill;

public class SwiggyLogoPage extends CommonUtill{

	@BeforeClass
	public static void beforeclass() throws Exception {
		SwiggyLogoPage slp=new SwiggyLogoPage();
		slp.browserlaunch("chrome");
		slp.browserMaximize();
	}
		@Before
		public void before() {
			SwiggyLogoPage slp=new SwiggyLogoPage();
			slp.loadUrl("https://www.swiggy.com/");
			slp.methodWait();
		}		
			@After
			public void after() {
				SwiggyLogoPage slp=new SwiggyLogoPage();
				slp.elementClick(elementFinder(locatorfinderByXpath("//button[@Class='_1fiQt']")));
}
@Test
public void execution() {
	
}}
