package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

/**
 * This class consists of generic method related to selenium webdriver
 * @author Admin
 *
 */
public class SeleniumUtility {
   /**
    * This method will maximize screen
    * @param driver
    */
	public void maximize(WebDriver driver) {
		
	   driver.manage().window().maximize();
	}
	 /**
	  * This method will minimize screen 
	  * @param driver
	  */
	public void minimize(WebDriver driver) {
		
		driver.manage().window().minimize();
	}
	 /**
	  * This method will implicitlty add wait for 10 sec
	  * @param driver
	  */
	public void addImplicitlywait(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	 /**
	  * This method will wait For Element To Be Visible
	  * @param driver
	  * @param element
	  */
	public void waitForElementToBeVisible(WebDriver driver,WebElement element ) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	 /**
	  * This method will wait For Element To Be Clickable
	  * @param driver
	  * @param ele
	  */
	public void waitForElementToClickable(WebDriver driver,WebElement ele) {
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(ele));

	}
	/**
	 * This method will handle Dropdown by index
	 * @param element
	 * @param index
	 */
	public void handleDropdown(WebElement element,int index) {
		
		Select s = new Select(element);
		s.selectByIndex(index);	
	}
	 /**
	  * This method will handle Dropdown by value
	  * @param element
	  * @param value
	  */
	public void handleDropdown(WebElement element,String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
	/**
	 * This method will handle Dropdown by visible text
	 * @param text
	 * @param element
	 */
	public void handleDropdown(String text,WebElement element) {
		
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	 /**
	  * This method will perform mouseOverAction
	  * @param driver
	  * @param element
	  */
	public void mouseOverAction(WebDriver driver,WebElement element) {
		
		Actions a = new Actions(driver);
		a.moveToElement(element).click().build().perform();
	}
	
	/**
	 * This method will perform rightclick operation
	 * @param driver
	 * @param element
	 */
	public void rightClickAction(WebDriver driver,WebElement element) {
		
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}
	
	/**
	 * This method will perform Double click Action
	 * @param driver
	 * @param element
	 */
     public void doubleClickAction(WebDriver driver,WebElement element) {
		
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}
     /**
      * This method will perform drag-drop Action
      * @param driver
      * @param element1
      * @param element2
      */
     public void dragdropAction(WebDriver driver,WebElement element1,WebElement element2) {
 		
 		Actions a = new Actions(driver);
 		a.dragAndDrop(element1, element2);
 	} 
     
     /**
      * This method will perform switch To Frame by index
      * @param driver
      * @param index
      */
    //iframe
     
     public void switchToFrame(WebDriver driver,int index) {
    	
    	 driver.switchTo().frame(index);
     }
     
     /**
      * This method will perform Switch to frame ByframeNameOrID
      * @param driver
      * @param frameNameOrID
      */
     public void switchToFrame(WebDriver driver,String frameNameOrID) {
     	
    	 driver.switchTo().frame(frameNameOrID);
     } 
      /**
       * This method will perform switch to FrameElement
       * @param driver 
       * @param frameElement
       */
     public void switchToFrame(WebDriver driver,WebElement frameElement) {
      	
    	 driver.switchTo().frame(frameElement);
     } 
     
     /**
      * This method will perform accept operation
      * @param driver
      */
     public void acceptAlert(WebDriver driver) {
    	
    	 driver.switchTo().alert().accept();
    	 
     }
      /**
       * This method will perform dismiss operation
       * @param driver
       */
     public void dismissAlert(WebDriver driver) {
     	
    	 driver.switchTo().alert().dismiss();	 
     }
     
     /**
      * This method will perform Alert action by sendAlertText
      * @param driver
      * @param text
      */
     public void sendAlertText(WebDriver driver,String text) {
     	
    	 driver.switchTo().alert().sendKeys(text);
    	 	 
     }
    /**
     * This method will perform
     * @param driver
     * @return
     */
     public String getAlertText(WebDriver driver) {
      	
    	return driver.switchTo().alert().getText();
     }	 
  
     /**
      * This method will perform scroll down Action
      * @param driver
      */
     public void scrollDownAction(WebDriver driver) {
     	
    	 JavascriptExecutor js=(JavascriptExecutor)driver;
    	 js.executeScript("window.scrollBy(0,500);","");
     }
     /**
      * This method will perform Scroll-up actions
      * @param driver
      */
     public void scrollUpAction(WebDriver driver) {
      	
    	 JavascriptExecutor js=(JavascriptExecutor)driver;
    	 js.executeScript("window.scrollBy(0,-400);","");
     }
     /**
      * this method will capture screenshot
      * @param driver
      * @param ScreenshotName
      * @return
      * @throws IOException
      */
     public String captureScreenshot(WebDriver driver,String ScreenshotName) throws IOException {
    	 
    	 TakesScreenshot t=(TakesScreenshot)driver;
    	 File source= t.getScreenshotAs(OutputType.FILE);
    	 File dest = new File(".\\Screenshot\\"+ScreenshotName+".png");
    	 Files.copy(source, dest);
    	 return dest.getAbsolutePath();   //extent reports
     }
     
}
