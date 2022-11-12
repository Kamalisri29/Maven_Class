package com.amazon.testng;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.adacitin.commonutil.CommonUtill;
import com.adacitin.commonutil.Slf4J;

public class ClassB extends CommonUtill{
	Logger log =Slf4J.loadLogger(ClassA.class);
	@Parameters({"browser"})
	@BeforeTest
	public void beforeTest(String browser)  {
		browserlaunch(browser);
		
		loadUrl("https://adactinhotelapp.com/");
		methodWait();
		log.info("befoe Test");
	}
	
	@Test(priority=0)
	public void one() {
		driver.findElement(By.id("username")).sendKeys("Kamali29");
		driver.findElement(By.id("password")).sendKeys("Sri@2910");
		driver.findElement(By.id("login")).click();
        log.info("succesfully login3");
	}
	@Test(priority=1)
	public void Two() {
		driver.findElement(By.id("username")).sendKeys("Kamali29");
		driver.findElement(By.id("password")).sendKeys("Sri@2910");
		driver.findElement(By.id("login")).click();
        log.info("succesfully login4");
	}
}
