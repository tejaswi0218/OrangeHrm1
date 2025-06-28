package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class AddEmployeePage {

	@FindBy(name="firstName")private WebElement firstNameEdt;
	@FindBy(name="middleName")private WebElement middleNameEdt;
	@FindBy(name="lastName")private WebElement lastNameEdt;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	private WebElement saveBtn;
	
	public AddEmployeePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstNameEdt() {
		return firstNameEdt;
	}

	public WebElement getMiddleNameEdt() {
		return middleNameEdt;
	}

	public WebElement getLastNameEdt() {
		return lastNameEdt;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	//Business library
	
	public void addEmployeeDetails(String firstname,String lastname,String middlename) {
	
		firstNameEdt.sendKeys(firstname);
		middleNameEdt.sendKeys(middlename);
		lastNameEdt.sendKeys(lastname);
		saveBtn.click();
	}
	
	
	
	
	
	
	
}
