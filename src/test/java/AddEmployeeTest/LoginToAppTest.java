package AddEmployeeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelFileUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.SeleniumUtility;
import org.testng.annotations.Listeners;

@Listeners(genericUtility.ListernerImplementation.class)
public class LoginToAppTest extends BaseClass {

	@Test(groups="RegressionSuite")
	public void loginToApp() throws IOException {
//
		
//		
//		
//		String Url =putil.readDataFromPropertyFile("url");
//		WebDriver driver = new ChromeDriver();
//	    sutil.maximize(driver);
//	    sutil.addImplicitlywait(driver);
//		driver.get(Url);
		 
//		 driver.findElement(By.name("username")).sendKeys(UserName);
//		 driver.findElement(By.name("password")).sendKeys(Password);
//		 driver.findElement(By.xpath("//button[@type='submit']")).click();
//				
		
		
		String text=driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
		
		if(text.contains("Dashboard")) {
			
			System.out.println("Login successful");
		}

		else {
			
			System.out.println("Login is not successful");
		}

	}

	@Test
	public void sample() {
		
		System.out.println("Hi");
	}
}
