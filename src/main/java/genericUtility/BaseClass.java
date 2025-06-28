package genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import objectRepository.LoginPage;
import objectRepository.PersonalDetailePage;

/**
 * This class consist of Basic configuration of testng Annotation
 * @author Admin
 *
 */
public class BaseClass {

	public PropertyFileUtility putil= new PropertyFileUtility();
	public ExcelFileUtility eutil= new ExcelFileUtility();
	public SeleniumUtility sutil= new SeleniumUtility();
	public WebDriver driver;
	
	public static WebDriver sdriver;
	
	@BeforeSuite(alwaysRun=true)
	public void bsConfig() {
		
		System.out.println("==========DB Connection Successful=======");
	}
	//@Parameters("browser")
	//@BeforeTest
	@BeforeClass(alwaysRun=true)
    public void bcConfig(/*Browser*/) throws IOException {
		
		 String Url =putil.readDataFromPropertyFile("url");	
		  // driver = new ChromeDriver();
		 
//		   if(Browser.equalsIgnoreCase("Chrome"))
//		  {
//			   driver = new ChromeDriver();
//		   }
//		   
//		   else if(Browser.equalsIgnoreCase("Edge")) 
//		   {
//			   driver = new EdgeDriver();
// 
//		   }
//		   
//		   else {
			   
		    driver = new ChromeDriver();
		   sutil.maximize(driver);
		   sutil.addImplicitlywait(driver);
		   driver.get(Url);
		   
		  // for Listener 
		   sdriver=driver;
		System.out.println("==========Browser Lunch Successful=======");
	}
	
	@BeforeMethod(alwaysRun=true)
	
	public void bmConfig() throws IOException {
		String UserName =putil.readDataFromPropertyFile("username");
		String Password=putil.readDataFromPropertyFile("password");
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(UserName, Password);
		System.out.println("==========Login To App Successful=======");
	}
	
	@AfterMethod(alwaysRun=true)
	public void amConfig() {
		
		PersonalDetailePage pdp =new PersonalDetailePage(driver);
		pdp.clickOnlogoutdropdown();
		pdp.clickOnlogoutOption();
		System.out.println("==========Logout To App Successful=======");
	}
	//@AfterTest
	@AfterClass(alwaysRun=true)
	public void acConfig() {
		
		driver.quit();
		System.out.println("==========Browser closure Successful=======");
	}
	
	@AfterSuite(alwaysRun=true)
	public void asConfig() {
		
		System.out.println("=========DB Closure Successful=========");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
