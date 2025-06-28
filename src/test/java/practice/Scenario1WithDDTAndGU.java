package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import genericUtility.ExcelFileUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.SeleniumUtility;
import objectRepository.LoginPage;

public class Scenario1WithDDTAndGU {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		//Create object for utility classes
		
		PropertyFileUtility putil= new PropertyFileUtility();
		ExcelFileUtility eutil= new ExcelFileUtility();
		SeleniumUtility sutil= new SeleniumUtility();
		
		 // read data from property file	
		String UserName = putil.readDataFromPropertyFile("username");
		String Password = putil.readDataFromPropertyFile("password");
		String Url =putil.readDataFromPropertyFile("url");
			
			// Excel file
		
	    String FirstName= eutil.readDataFromExcelFile("Orangehrm", 1, 2);
	    String MiddleName = eutil.readDataFromExcelFile("Orangehrm", 1, 3);
	    String LastName = eutil.readDataFromExcelFile("Orangehrm", 1, 4);
	    String DriversLicenseNumber = eutil.readDataFromExcelFile("Orangehrm", 4, 2);
	    
	 String testdata="Dashboard";
		// pim module
	 WebDriver driver = new ChromeDriver();
     sutil.maximize(driver);
     sutil.addImplicitlywait(driver);
	 driver.get(Url);
	 
	 driver.findElement(By.name("username")).sendKeys(UserName);
	 driver.findElement(By.name("password")).sendKeys(Password);
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 
	String text=driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
		
	if(testdata.contains(text)) {
			
			System.out.println("Login successful");
		}

	else {
			
			System.out.println("Login is not successful");
		}
	 driver.findElement(By.xpath("//div[@class='oxd-main-menu --fixed']/following-sibling::ul/child::li[2]/child::a/child::span")).click();
	 driver.findElement(By.xpath("//nav[@aria-label='Topbar Menu']/child::ul/child::li[@class='oxd-topbar-body-nav-tab']/child::a")).click();
	        
	 driver.findElement(By.name("firstName")).sendKeys(FirstName);
	 driver.findElement(By.name("middleName")).sendKeys(MiddleName);
	 driver.findElement(By.name("lastName")).sendKeys(LastName);
	        
	 driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();

	String data= driver.findElement(By.xpath("//div[@class='orangehrm-edit-employee-content']/child::div[1]/child::h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")).getText();
	 if(data.contains("Personal Details")) {
		 
		 System.out.println("successful");
	 }
	 
	 else {
		 System.out.println("Not Sucessful");
	 }
	//  JavascriptExecutor js =(JavascriptExecutor)driver;
	//  js.executeScript("window.scrollBy(0,1000);");
	// driver.findElement(By.xpath("//div[@class='oxd-grid-1 orangehrm-full-width-grid']/descendant::div[13]/following::div[10]/child::input")).click();//sendKeys("12344");

	driver.findElement(By.xpath("//div[@class='orangehrm-edit-employee-content']/descendant::div[31]/input[@class='oxd-input oxd-input--active']")).sendKeys(DriversLicenseNumber);
	//license calender
	driver.findElement(By.xpath("//div[@class='orangehrm-edit-employee-content']/descendant::div[33]/child::div[2]/child::div/child::div/child::input/following-sibling::i")).click();
	//driver.findElement(By.xpath("//div[@class='orangehrm-edit-employee-content']/descendant::div[40]/child::div/child::div/child::i")).click();  
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='oxd-calendar-selector-month-selected']/child::i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon']")).click();

	driver.findElement(By.xpath("//li[contains(text(),'August')]")).click();

	driver.findElement(By.xpath("//div[@class='oxd-calendar-selector-year-selected']/child::i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon']")).click();

	driver.findElement(By.xpath("//li[contains(text(),'2025')]")).click();

	//driver.findElement(By.xpath("//div[@class='oxd-grid-1 orangehrm-full-width-grid']/descendant::div[13]/following::div[46]/child::div/child::i[@class='oxd-icon bi-calendar oxd-date-input-icon']")).click();

	driver.findElement(By.xpath("//div[contains(text(),'15')]")).click();

	sutil.scrollUpAction(driver);
	//JavascriptExecutor js = (JavascriptExecutor)driver;

	//js.executeScript("window.scrollBy(0,-400);");

	WebElement ele=driver.findElement(By.xpath("//div[@class='orangehrm-edit-employee-content']/descendant::div[46]/child::div[2]"));
	 
	sutil.mouseOverAction(driver, ele);
	//Actions a = new Actions(driver);
	//a.moveToElement(ele).click().perform();
	driver.findElement(By.xpath("//span[contains(text(),'Indian')]")).click();
	
	
	WebElement ele2= driver.findElement(By.xpath("//div[@class='orangehrm-edit-employee-content']/descendant::div[53]/child::div/child::div[2]"));
	sutil.mouseOverAction(driver, ele2);
	//a.moveToElement(ele2).click().perform();

	driver.findElement(By.xpath("//span[contains(text(),'Married')]")).click();
	// String year="1997";
	// String month="September";
	//String date="02";

	driver.findElement(By.xpath("//div[@class='orangehrm-edit-employee-content']/child::div[1]/descendant::div[56]/child::div[1]/child::div/child::div/child::div/child::div/child::i[@class='oxd-icon bi-calendar oxd-date-input-icon']")).click();

	driver.findElement(By.xpath("//div[@class='oxd-calendar-selector-month-selected']/child::i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon']")).click();
	driver.findElement(By.xpath("//li[contains(text(),'September')]")).click();
	driver.findElement(By.xpath("//div[@class='oxd-calendar-selector-year-selected']/child::p[@class='oxd-text oxd-text--p']")).click();
	driver.findElement(By.xpath("//li[contains(text(),'1997')]")).click();
	driver.findElement(By.xpath("//div[text()='2']")).click();

	sutil.scrollUpAction(driver);
	//js.executeScript("window.scrollBy(0,-300);");

	WebElement gender= driver.findElement(By.xpath("//div[@class='--gender-grouped-field']/child::div/child::div/child::div/child::label/child::input[@value='1']"));

	//a.moveToElement(gender).click().build().perform();
    sutil.mouseOverAction(driver, gender);
	driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-form-hint']/following-sibling::button[@type='submit']")).click();

	WebElement ele3 =driver.findElement(By.xpath("//div[@class='orangehrm-custom-fields']/descendant::div[8]/child::div/child::div"));
	//a.moveToElement(ele3).click().perform();
    sutil.mouseOverAction(driver, ele3);

	driver.findElement(By.xpath("//span[text()='B+']")).click();

	driver.findElement(By.xpath("//div[@class='orangehrm-edit-employee-content']/descendant::div[76]/child::button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	//file
	driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--text']")).click();

	driver.findElement(By.xpath("//input[@class='oxd-file-input']")).sendKeys("C:\\Users\\Admin\\Downloads\\sign.jpg");

	driver.findElement(By.xpath("//textarea[@placeholder='Type comment here']")).sendKeys("Ok");

	driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']/following-sibling::button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();


	// logout

	driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	
		
	}

}
