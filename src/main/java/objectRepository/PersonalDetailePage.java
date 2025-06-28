package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class PersonalDetailePage extends SeleniumUtility {
    
	@FindBy(xpath="//div[@class='orangehrm-edit-employee-content']/child::div[1]/child::h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
	 private WebElement headerText;
	
	@FindBy(xpath="//div[@class='orangehrm-edit-employee-content']/descendant::div[31]/input[@class='oxd-input oxd-input--active']")
	 private WebElement driverLicenseNoEdt;
	
	@FindBy(xpath="//div[@class='orangehrm-edit-employee-content']/descendant::div[33]/child::div[2]/child::div/child::div/child::input/following-sibling::i") 
	private WebElement calendaricon;
	
	@FindBy(xpath="//div[@class='oxd-calendar-selector-month-selected']/child::i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon']") 
	private WebElement monthDropDown;
	
	@FindBy(xpath="//li[contains(text(),'August')]")
	private WebElement monthSelect;
	
	@FindBy(xpath="//div[@class='oxd-calendar-selector-year-selected']/child::i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon']")
	private WebElement yearDropDown;
	
	@FindBy(xpath="//li[contains(text(),'2025')]")
	private WebElement yearSelect;
	
	@FindBy(xpath="//div[contains(text(),'15')]") 
	private WebElement dateSelect;
	
	@FindBy(xpath="//div[@class='orangehrm-edit-employee-content']/descendant::div[46]/child::div[2]") 
	private WebElement nationalityIcon;
	
	@FindBy(xpath="//span[contains(text(),'Indian')]") 
	private WebElement nationalityOption;
	
	@FindBy(xpath="//div[@class='orangehrm-edit-employee-content']/descendant::div[53]/child::div/child::div[2]")
	private WebElement statusdropdown;
	
	@FindBy(xpath="//span[contains(text(),'Married')]")
	private WebElement statusOption;
	
	@FindBy(xpath="//div[@class='orangehrm-edit-employee-content']/child::div[1]/descendant::div[56]/child::div[1]/child::div/child::div/child::div/child::div/child::i[@class='oxd-icon bi-calendar oxd-date-input-icon']")
	private WebElement dateOfBirthDropdown;
	
	@FindBy(xpath="//div[@class='oxd-calendar-selector-month-selected']/child::i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon']")
	private WebElement birthMonthDropDown;
	
	@FindBy(xpath="//li[contains(text(),'September')]")
	private WebElement birthMonth;
	
	@FindBy(xpath="//div[@class='oxd-calendar-selector-year-selected']/child::p[@class='oxd-text oxd-text--p']")
	private WebElement birthYearDropDown;
	
	@FindBy(xpath="//li[contains(text(),'1997')]")
	private WebElement birthYear;
	
	@FindBy(xpath="//div[text()='2']")
	private WebElement birthDate;
	
	@FindBy(xpath="//div[@class='--gender-grouped-field']/child::div/child::div/child::div/child::label/child::input[@value='1']")
	private WebElement genderRadio;
	
	
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p orangehrm-form-hint']/following-sibling::button[@type='submit']")
	private WebElement saveBtn2;
	


	@FindBy(xpath="//div[@class='orangehrm-custom-fields']/descendant::div[8]/child::div/child::div")
	private WebElement bloodGroupdropdown;
	
	@FindBy(xpath="//span[text()='B+']")
	private WebElement bloodGroupOption;
	
	@FindBy(xpath="//div[@class='orangehrm-edit-employee-content']/descendant::div[76]/child::button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	private WebElement savebtn3;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--text']")
	private WebElement fileButton;
	
	@FindBy(xpath="//input[@class='oxd-file-input']")
	private WebElement fileAdd;
	
	@FindBy(xpath="//textarea[@placeholder='Type comment here']")
	private WebElement comment;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--ghost']/following-sibling::button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	private WebElement saveBtn4;
	
	@FindBy(xpath="//p[@class='oxd-userdropdown-name']")
	private WebElement logoutOption;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	private WebElement logout;
	
	public PersonalDetailePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getDriverLicenseNoEdt() {
		return driverLicenseNoEdt;
	}

	public WebElement getCalendaricon() {
		return calendaricon;
	}

	public WebElement getMonthDropDown() {
		return monthDropDown;
	}

	public WebElement getMonthSelect() {
		return monthSelect;
	}

	public WebElement getYearDropDown() {
		return yearDropDown;
	}

	public WebElement getYearSelect() {
		return yearSelect;
	}

	public WebElement getDateSelect() {
		return dateSelect;
	}

	public WebElement getNationalityIcon() {
		return nationalityIcon;
	}

	public WebElement getNationalityOption() {
		return nationalityOption;
	}

	public WebElement getStatusdropdown() {
		return statusdropdown;
	}

	public WebElement getStatusOption() {
		return statusOption;
	}

	public WebElement getDateOfBirthDropdown() {
		return dateOfBirthDropdown;
	}

	public WebElement getBirthMonthDropDown() {
		return birthMonthDropDown;
	}

	public WebElement getBirthMonth() {
		return birthMonth;
	}

	public WebElement getBirthYearDropDown() {
		return birthYearDropDown;
	}

	public WebElement getBirthYear() {
		return birthYear;
	}

	public WebElement getBirthDate() {
		return birthDate;
	}

	public WebElement getGenderRadio() {
		return genderRadio;
	}

	public WebElement getSaveBtn2() {
		return saveBtn2;
	}

	public WebElement getBloodGroupdropdown() {
		return bloodGroupdropdown;
	}

	public WebElement getBloodGroupOption() {
		return bloodGroupOption;
	}
	
	
	public WebElement getSavebtn3() {
		return savebtn3;
	}

	public WebElement getFileButton() {
		return fileButton;
	}

	public WebElement getFileAdd() {
		return fileAdd;
	}

	public WebElement getComment() {
		return comment;
	}

	public WebElement getSaveBtn4() {
		return saveBtn4;
	}

	public WebElement getLogoutOption() {
		return logoutOption;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	//Business library
	
	public String captureHeaderText() {
		return headerText.getText();
	}
	
	public void EnterDriverLicenseNumber(String number) {
	
		driverLicenseNoEdt.sendKeys(number);
	
	}
	
	public void clickOnLicenseCalender() {
		calendaricon.click();
	}
	
	public void clickOnLicenseExpiryMonthDrodown() {
		monthDropDown.click();
	}
	
	public void clickOnLicenseExpiryMonth() {
		monthSelect.click();
	}
	
	public void clickOnLicenseExpiryYearDropdown() {
		yearDropDown.click();
	}
	
	public void clickOnLicenseExpiryYear() {
		yearSelect.click();
	}
	
	public void clickOnLicenseExpiryDate() {
		dateSelect.click();
	}
	
	public void selectNationalityDropdown(WebDriver driver) {
		
		mouseOverAction(driver,nationalityIcon);
		nationalityOption.click();
		
	}
	
	public void selectStatusDropdown(WebDriver driver) {
		
		mouseOverAction(driver,statusdropdown);
		statusOption.click();
	}
	
	public void clickOnDateOFbitrhcalender() {
		dateOfBirthDropdown.click();
	}
	
	public void clickOnBirthMonthDropDOwn(){
		birthMonthDropDown.click();
	}
	
	public void clickOnBirthMonth() {
		
		birthMonth.click();
	}
	
	public void clickOnBirthdayYearDropDown() {
		birthYearDropDown.click();
	}
    
	public void clickOnBirthYear() {
		birthYear.click();
	}
	
	public void clickOnBirthDate() {
		 birthDate.click();
	}
	
	public void clickOnGenderRadio(WebDriver driver) {
		 mouseOverAction(driver,genderRadio);
		 //genderRadio.click();
	}
	
	public void clickOnSaveBtn2() {
		saveBtn2.click();
	}
	
	public void clickOnBloodGroupDropdown(WebDriver driver) {
		
	    mouseOverAction(driver,bloodGroupdropdown);
	    bloodGroupOption.click();
	}
	
	//public void clickOnBloodGroupOption() {
	//	bloodGroupOption.click();
	//}
	
	public void clickOnsavebtn3() {
		savebtn3.click();
	}
	
	public void clickOnFileButton() {
		fileButton.click();
	}
	
	public void clickOnFileAdd(String filePath) {
		fileAdd.sendKeys(filePath);
	}
	
	public void clickOnComment(String Comment) {
		
		comment.sendKeys(Comment);
	}
	
	public void clickonSaveBtn4() {
		saveBtn4.click();
	}
	 public void clickOnlogoutdropdown() {
		 logoutOption.click();
	 }
	 
	 public void clickOnlogoutOption() {
		 logout.click();
	 }
	
}
