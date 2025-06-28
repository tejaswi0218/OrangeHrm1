package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.ExcelFileUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.SeleniumUtility;

public class ScenarioWithDDTAndGU {

	public static void main(String[] args) throws IOException {
		
		PropertyFileUtility putil= new PropertyFileUtility();
		ExcelFileUtility eutil= new ExcelFileUtility();
		SeleniumUtility sutil= new SeleniumUtility();
		
		 // read data from property file	
		String UserName = putil.readDataFromPropertyFile("username");
		String Password = putil.readDataFromPropertyFile("password");
		String Url =putil.readDataFromPropertyFile("url");
		
		 WebDriver driver = new ChromeDriver();
	     sutil.maximize(driver);
	     sutil.addImplicitlywait(driver);
		 driver.get(Url);
		 
		 driver.findElement(By.name("username")).sendKeys(UserName);
		 driver.findElement(By.name("password")).sendKeys(Password);
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		String text=driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
		
		if(text.contains("Dashboard")) {
			
			System.out.println("Login successful");
		}

		else {
			
			System.out.println("Login is not successful");
		}
		
		

	}

}
