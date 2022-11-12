package com.amazon.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.adacitin.commonutil.CommonUtill;
import com.adacitin.commonutil.Slf4J;

public class Sample3 extends CommonUtill{
	Logger log =Slf4J.loadLogger(Sample3.class);
	
	@Parameters({"browsers"})
	@BeforeTest
	public void setup(String browsers){
		browserlaunch(browsers);
		loadUrl("https://www.facebook.com/");
		methodWait();
		
	}
	@Parameters({"browsers"})
	@AfterTest
	public void aftertest(String browsers) {
		
		methodquit(browsers); 
	}
	
	@Test(priority = -1)
	public void Test1() {
		WebElement username = elementFinder(By.id("email"));
		type(username, "7604888183");
		log.info("username");
	}

	@Test(priority = 0)
	public void Test2() {
		WebElement password = elementFinder(By.id("pass"));
		type(password, "Sri@2910");
		log.info("password");
	}

	@Test(priority = 1)
	public void Test3() {
		elementClick(ElementFinderByxPath("//button[@name='login']"));
		log.info("login1 successfull");

	}
		
	}
	
	
	

