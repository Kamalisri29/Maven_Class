package com.flipkart.snap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.sapce.IExcelInterface;

public class BaseClass implements IExcelInterface {
	public static WebDriver driver=null;

	public static void browserlaunch(String key) throws Exception {
		switch (key) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Kamali\\Downloads\\drivers\\chromedriver_win32\\chromedriver(1).exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kamali\\Downloads\\drivers\\geckodriver-v0.32.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver","C:\\Users\\Kamali\\Downloads\\drivers\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("the give key is not presentin the case");
			break;
		}
		}
	
	public static Logger loadLogger(Class<?>classname) {
		Logger log =LoggerFactory.getLogger(classname);
		return log;
		
	}
	
	public static void navigate(String url) {
		driver.navigate().to(url);
	}
	

	public static void browserMaximize() {
		driver.manage().window().maximize();
	}

	public static void methodWait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public static void methodclose(){
	     driver.close();
		}
		
	public static void methodquit(String qutting){
		     driver.quit();
			}
}
