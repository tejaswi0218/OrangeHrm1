package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTables {

	public static void main(String[] args) {
		
		 ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
            
			driver.findElement(By.xpath("//div[@class='oxd-main-menu --fixed']/following-sibling::ul/child::li[1]/child::a/child::span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")).click();
			
			//JavascriptExecutor js = (JavascriptExecutor)driver;
			//js.executeScript("window.scrollBy(0,800);");
			
	     String text =driver.findElement(By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/child::span[@class='oxd-text oxd-text--span']")).getText();
			
	      System.out.println(text);
	      
	      text.indexOf("(");
	      text.indexOf(")");
	      
	     
	    int records = Integer.valueOf(text.substring(text.indexOf("(")+1,  text.indexOf(")")));
	    
		System.out.println("TotalNumber of Records:"+ records);	
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,400);");
	
	    
	List<WebElement> rowsize =	driver.findElements(By.xpath("//div[@row-decorator='oxd-table-decorator-card']/div/div"));
	
	System.out.println("Total no of rows : "+rowsize.size());
	
	driver.findElement(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border']/div"));
	
	for(int r=1;r<=rowsize.size();r++) {
		
	//driver.findElement(By.xpath("//input[@type='checkbox']/following::span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input']")).click();
		
//String text3  =	driver.findElement(By.xpath("//div[@class='oxd-table-cell oxd-padding-cell']/div[")).getText();
//String text3=driver.findElement(By.xpath("//div[@row-decorator='oxd-table-decorator-card']/div/div["+r+"]")).getText();

//System.out.println(text3);
driver.findElement(By.xpath("//input[@type='checkbox']/following::span["+r+"]")).click();





	}
	}			
}


