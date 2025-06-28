package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPage {

	@FindBy(xpath="//nav[@aria-label='Topbar Menu']/child::ul/child::li[@class='oxd-topbar-body-nav-tab']/child::a")
	private WebElement addEmployeeBtn; 
	
	
	public PimPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getAddEmployeeBtn(){
		
		return addEmployeeBtn;
	}
	
	// business liberary
	
	public void clickonAddEmployee() {
		
		addEmployeeBtn.click();
	}
}
