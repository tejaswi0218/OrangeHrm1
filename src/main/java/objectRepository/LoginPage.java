package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(name="username")private WebElement usernameEdt;
	@FindBy(name="password") private WebElement passwordEdt;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsernameEdt() {
		return usernameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public void loginToApp(String UserName,String Password) {
		
		usernameEdt.sendKeys(UserName);
		passwordEdt.sendKeys(Password);
		loginBtn.click();
	}
	
}
