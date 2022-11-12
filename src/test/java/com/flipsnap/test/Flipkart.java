package com.flipsnap.test;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.flipkart.snap.BaseClass;

public class Flipkart extends BaseClass{

	@Parameters({"browser"})
	@BeforeClass
	public void init(String browser) throws Exception {
		browserlaunch(browser);
		browserMaximize();
		methodWait();
		navigate("https://www.flipkart.com/");
	}
	@Test
	public void login() {
		driver.findElement(By.partialLinkText("Login")).click();
		driver.findElement(By.cssSelector(".fk-input.login-form-input.user-email")).sendKeys();
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Password);
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
