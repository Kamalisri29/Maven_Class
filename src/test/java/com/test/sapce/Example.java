package com.test.sapce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.adacitin.commonutil.CommonUtill;

public class Example extends CommonUtill{
public static void main(String[] args) throws Exception {
	Example.browserlaunch("chrome");
	Example.browserMaximize();
	Example.loadUrl("https://adactinhotelapp.com/");
	//Example.elementFinder(By.id("username")).sendKeys("kamali");
   // type(elementFinder(locatorFinderById("username")),"sri" );
	WebElement element=elementFinder(By.id("username"));
	type(element, "kamali");
}
}
