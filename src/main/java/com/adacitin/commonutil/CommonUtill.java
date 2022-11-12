package com.adacitin.commonutil;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class CommonUtill extends Slf4J {
	
//	@BeforeSuite
//	public void beforeSuite() {
//		System.out.println("befor suite");
//	}
	
//	@BeforeTest
//	public void beforeTest() {
//		System.out.println("befoe TEst");
//	}
//	@BeforeClass
//	public void beforeClass() {
//		System.out.println("before class");
//	}
	
	
//	@BeforeMethod
//	public void bMethod() {
//		System.out.println("before method");
//	}
	

	Logger log =Slf4J.loadLogger(CommonUtill.class);
	public static WebDriver driver = null;
	

	public static void browserlaunch(String key) {
		if(key.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Kamali\\eclipse-workspace\\Maven_Class\\drivers\\chromedriver(1).exe");
			driver = new ChromeDriver();
		}
		else if(key.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Kamali\\eclipse-workspace\\Maven_Class\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(key.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Kamali\\eclipse-workspace\\Maven_Class\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else {
			try {
				throw new Exception("Incorrect Browser");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		switch (key) {
//		case "chrome":
//			// System.setProperty("webdriver.chrome.driver",
//			// "./Configuration/chromedriver.exe");
//
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			break;
//
//		case "FireFox":
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//			break;
//
//		case "Edge":
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//			break;
//			
//		default:
//			System.out.println("the give key is not present in the case");
//			break;
//		}
	}
	
//	public static void browserlaunch(String key) throws Exception {
//		switch (key) {
//		case "chrome":
//			System.setProperty("webdriver.chrome.driver","C:\\Users\\Kamali\\Downloads\\drivers\\chromedriver_win32\\chromedriver(1).exe");
//			driver = new ChromeDriver();
//			break;
//		case "firefox":
//			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kamali\\Downloads\\drivers\\geckodriver-v0.31.0-win64\\geckodriver.exe");
//			driver = new FirefoxDriver();
//			break;
//		case "edge":
//			System.setProperty("webdriver.edge.driver","C:\\Users\\Kamali\\Downloads\\drivers\\edgedriver_win64\\msedgedriver.exe");
//			driver = new EdgeDriver();
//			break;
//		default:
//			System.out.println("the give key is not presentin the case");
//			break;
//		}
//		}
	public static void navigate(String url) {
		driver.navigate().to(url);
	}
	

	public static void browserMaximize() {
		driver.manage().window().maximize();
	}

	public static void loadUrl(String Url) {
		driver.get(Url);

	}
	public static void methodWait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static WebElement elementFinder(By locator) {
		return driver.findElement(locator);
	}

	public static By locatorFinderById(String data) {
		return By.id(data);
	}

	public static By locatorfinderByXpath(String data) {		
		// By xpath = By.xpath(data);
		// return xpath;
		return By.xpath(data);

	}
	public WebElement elementfinderById(String locator) {
		return driver.findElement(By.id(locator));
	}

	public WebElement ElementFinderByxPath(String locator) {

		return driver.findElement(By.xpath(locator));
	}

	public static By locaterfindByname(String data) {
		return By.name(data);
	}

	public static void type(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void elementClick(WebElement element) {
		element.click();
	}
	public static void methodclose(){
     driver.close();
	}
	public static void methodquit(String qutting){
	     driver.quit();
		}
	
//	public static void main(String[] args) {
//		browserlaunch("chrome");
//		browserMaximize();
//		loadUrl("https://facebook.com/");
//
//		type(elementFinder(locatorFinderById("email")), "Sri");
//		type(elementFinder(locatorFinderById("pass")), "kamali123");
//		elementClick(elementFinder(locaterfindByname("login")));
//
//		WebElement username = elementFinder(By.id("email"));
//		type(username, "kamali");
//		WebElement pwd = elementFinder(By.id("pass"));
//		type(pwd, "sri");
//		WebElement lgn = elementFinder(By.name("login"));
//		elementClick(lgn);
//
//	}
}
