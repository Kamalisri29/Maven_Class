package samplePkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentClass {
	
	
 WebDriver driver;
	
	public  void loginTest(String browser,String userInfo) {
		
		String UserData[]=userInfo.split(",");
		String user= UserData[0];
		String userName= UserData[0];
		String pwd= UserData[0];
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		driver.get("https://adactinhotelapp.com/");
		WebElement Username=driver.findElement(By.xpath("//input[@id='username']"));
		Username.sendKeys(userName);
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(pwd);
		WebElement loginbtn=driver.findElement(By.xpath("//input[@type='Submit']"));
		loginbtn.click();
	}
	

	public static Object[][] getData() throws IOException{
		String path = System.getProperty(("user.dir")+"/Sowmi/Login.xlsx");
		String[][] data=null;
		File f = new File(path);
		FileInputStream fi=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fi);
		Sheet sh= wb.getSheetAt(0);
		int rows=sh.getPhysicalNumberOfRows();
		int cells=sh.getRow(0).getPhysicalNumberOfCells();
		data=new String[rows-1][cells];
		for(int i=1;i<rows;i++) {
			for(int j=0;j<cells;j++) {
				String cell=sh.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=cell;
				
				wb.close();
			}
		}
		
		
		return data;
		
	}
}
