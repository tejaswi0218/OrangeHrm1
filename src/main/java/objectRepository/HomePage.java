package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="//div[@class='oxd-main-menu --fixed']/following-sibling::ul/child::li[2]/child::a/child::span")
	private WebElement pimBtn;
	
	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	private WebElement headertext;
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getpimBtn() {
		return pimBtn;
	}
	
	//Business liberary
	
	public void clickonPimbutton() {
		
		pimBtn.click();
	}
	
	public String captureheadertext() {
	
		return headertext.getText();
	}

}
