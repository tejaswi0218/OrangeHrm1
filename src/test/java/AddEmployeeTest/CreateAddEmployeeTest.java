package AddEmployeeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelFileUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.SeleniumUtility;
import objectRepository.AddEmployeePage;
import objectRepository.HomePage;
import objectRepository.LoginPage;
import objectRepository.PersonalDetailePage;
import objectRepository.PimPage;

@Listeners(genericUtility.ListernerImplementation.class)
public class CreateAddEmployeeTest extends BaseClass {
    
	@Test(groups="SmokeSuite")
	
	public void createAddEmployee() throws IOException, InterruptedException {
		
		//Excel
		
	   String FirstName= eutil.readDataFromExcelFile("Orangehrm", 1, 2);
	   String MiddleName = eutil.readDataFromExcelFile("Orangehrm", 1, 3);
	   String LastName = eutil.readDataFromExcelFile("Orangehrm", 1, 4);
	   String DriversLicenseNumber = eutil.readDataFromExcelFile("Orangehrm", 4, 2);
			    
	   // pim module
		
	   HomePage hp = new HomePage(driver);
	   String text= hp.captureheadertext();
	 
		Assert.assertTrue(text.contains("Dashboard"));		
		
			 HomePage h = new HomePage(driver);
			 h.clickonPimbutton();
			// driver.findElement(By.xpath("//div[@class='oxd-main-menu --fixed']/following-sibling::ul/child::li[2]/child::a/child::span")).click();
			
			PimPage p = new PimPage(driver);
			p.clickonAddEmployee();
			// driver.findElement(By.xpath("//nav[@aria-label='Topbar Menu']/child::ul/child::li[@class='oxd-topbar-body-nav-tab']/child::a")).click();
			  
			AddEmployeePage a=  new AddEmployeePage(driver);
			
			a.addEmployeeDetails(FirstName, LastName, MiddleName);
//			
		    
			 a.getSaveBtn();
			
			
			PersonalDetailePage pdp = new PersonalDetailePage(driver);
			String data= pdp.captureHeaderText();
			Assert.assertTrue(data.contains("Personal Details"));
			
			
			// PersonalDetailePage pdp =new  PersonalDetailePage (driver);
			 pdp.EnterDriverLicenseNumber(DriversLicenseNumber);
			 
			
			//license calender
			 pdp.clickOnLicenseCalender();
			
			pdp.clickOnLicenseExpiryMonthDrodown();
			

			pdp.clickOnLicenseExpiryMonth();
			//driver.findElement(By.xpath("//li[contains(text(),'August')]")).click();

			pdp.clickOnLicenseExpiryYearDropdown();
			//driver.findElement(By.xpath("//div[@class='oxd-calendar-selector-year-selected']/child::i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon']")).click();

			pdp.clickOnLicenseExpiryYear();
			//driver.findElement(By.xpath("//li[contains(text(),'2025')]")).click();

			//driver.findElement(By.xpath("//div[@class='oxd-grid-1 orangehrm-full-width-grid']/descendant::div[13]/following::div[46]/child::div/child::i[@class='oxd-icon bi-calendar oxd-date-input-icon']")).click();
           
			pdp.clickOnLicenseExpiryDate();
			//driver.findElement(By.xpath("//div[contains(text(),'15')]")).click();

			sutil.scrollUpAction(driver);
			
			pdp.selectNationalityDropdown(driver);
			
			
			
			pdp.selectStatusDropdown(driver);
		
			pdp.clickOnDateOFbitrhcalender();
			
           
			pdp.clickOnBirthMonthDropDOwn();
			//driver.findElement(By.xpath("//div[@class='oxd-calendar-selector-month-selected']/child::i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon']")).click();
			
           pdp.clickOnBirthMonth();
           // driver.findElement(By.xpath("//li[contains(text(),'September')]")).click();
			
           pdp.clickOnBirthdayYearDropDown();
            // driver.findElement(By.xpath("//div[@class='oxd-calendar-selector-year-selected']/child::p[@class='oxd-text oxd-text--p']")).click();
			
          pdp.clickOnBirthYear();
           // driver.findElement(By.xpath("//li[contains(text(),'1997')]")).click();
			
          pdp.clickOnBirthDate(); 
           // driver.findElement(By.xpath("//div[text()='2']")).click();

			sutil.scrollUpAction(driver);
			//js.executeScript("window.scrollBy(0,-300);");

			//Thread.sleep(2000);
			pdp.clickOnGenderRadio(driver);
			
			
			pdp.clickOnSaveBtn2();
			

			pdp.clickOnBloodGroupDropdown(driver);
			
			pdp.clickOnsavebtn3();
			
			pdp.clickOnFileButton();
		

			pdp.clickOnFileAdd("C:\\Users\\Admin\\Downloads\\sign.jpg");
			//driver.findElement(By.xpath("//input[@class='oxd-file-input']")).sendKeys("C:\\Users\\Admin\\Downloads\\sign.jpg");

			pdp.clickOnComment("ok");
		

			pdp.clickonSaveBtn4();
		

			//logout
//       
				
	}

}
