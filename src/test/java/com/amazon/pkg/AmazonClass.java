package com.amazon.pkg;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;

import com.adacitin.commonutil.CommonUtill;
import com.adacitin.commonutil.Slf4J;

public class AmazonClass extends CommonUtill {
	Logger log =Slf4J.loadLogger(AmazonClass.class);
	
@BeforeClass
public static void beClass() throws Exception {
	AmazonClass amazon=new AmazonClass();
	amazon.browserlaunch("chrome");
	amazon.browserMaximize();
}
@Before
public void before() {
	AmazonClass amazon=new AmazonClass();
	amazon.loadUrl("https://www.amazon.com/");
	amazon.methodWait();
	amazon.elementClick(elementFinder(locatorfinderByXpath("//span[text()='Hello, sign in']")));
     }
@Test
public void executionUsername() {
	AmazonClass amazon=new AmazonClass();
	amazon.type(elementfinderById("ap_email"),"7604888183");
	amazon.methodWait();
	amazon.elementClick(elementFinder(locatorfinderByXpath("//input[@type='submit']")));
}
@Test
public void executionPassword() {
	AmazonClass amazon=new AmazonClass();
	amazon.type(elementFinder(locatorFinderById("ap_password")),"sri291999");
	amazon.methodWait();
	amazon.elementClick(elementFinder(locatorFinderById("signInSubmit")));
}
@Test
public void executionhome() {
	//AmazonClass amazon=new AmazonClass();
	WebElement text=elementFinder(By.id("nav-link-accountList-nav-line-1"));
	log.info(text.getText());
}
@Test
public void searchFunction() {
	AmazonClass amazon=new AmazonClass();
	WebElement search=elementFinder(By.id("twotabsearchtextbox"));
	type(search, "realme phone");
	amazon.methodWait();
	amazon.elementClick(elementFinder(locatorfinderByXpath("//input[@value='Go']")));
	String title=driver.getTitle();
	System.out.println(title);
}
@Test
public void productclick() {
	//AmazonClass amazon=new AmazonClass();
	WebElement product=elementFinder(By.partialLinkText("/realme-Oxygen-Storage-Processor-Battery/"));
	product.click();
	String title1=driver.getTitle();
	log.info(title1);
}
@Test
public void image() {
	WebElement img=elementfinderById("imgTagWrapperId");
	img.click();
	AmazonClass amazon=new AmazonClass();
	amazon.methodWait();
}
@Test
public void nvg() {
	AmazonClass amazon=new AmazonClass();
	amazon.navigate("https://www.amazon.in/");
	amazon.elementClick(elementfinderById("nav-link-accountList-nav-line-1"));
}
}