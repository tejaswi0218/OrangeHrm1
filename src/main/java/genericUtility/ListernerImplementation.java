package genericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 * This class Provides of Implementation to ItestLister interface of testNg
 * @author Admin
 *
 */
  public class ListernerImplementation implements ITestListener{

	ExtentReports report;
	 ExtentTest test;
	 
	public void onTestStart(ITestResult result) {
		
		String methodName = result.getMethod().getMethodName();
		
		System.out.println(methodName + "----Test Execution Started----");
		
		// Create a test for @Test in extent report
		  test = report.createTest(methodName);
	}

	public void onTestSuccess(ITestResult result) {
		
		String methodName =result.getMethod().getMethodName();
		System.out.println(methodName+"======Test pass===========");
		
		//log the pass status in extent report
		test.log(Status.PASS, methodName+"======Test pass===========");
	}

	public void onTestFailure(ITestResult result) {
		
		String methodName =result.getMethod().getMethodName();
		System.out.println(methodName+"======Test Fail===========");
		
		//log the pass status in extent report
	    test.log(Status.FAIL, methodName+"======Test Fail===========");
		
		SeleniumUtility sutil = new SeleniumUtility();
		JavaUtility jutil = new JavaUtility();
		
		String ScreenShotName = (methodName+"-"+ jutil.getDate());
		
		try {
			
	       String path = sutil.captureScreenshot(BaseClass.sdriver, ScreenShotName);
	       test.addScreenCaptureFromPath(path);
			//Attach screenshot to extent report
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		
		String methodName =result.getMethod().getMethodName();
		System.out.println(methodName+"======Test skip===========");
		//log the pass status in extent report
		test.log(Status.SKIP, methodName+"======Test skip===========");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
			}

	public void onStart(ITestContext context) {
	
		
		System.out.println("---------Suite Execution Start-----------");
		 
		// Configure the Extent Report
		
	ExtentSparkReporter rep = new ExtentSparkReporter(".\\ExtentReports\\Report-"+new JavaUtility().getDate()+".html");
		
	 rep.config().setDocumentTitle("Execution Report");
	 rep.config().setTheme(Theme.DARK);
	 rep.config().setReportName("Hrm Execution Report");
		
	 report = new ExtentReports();
	report.attachReporter(rep);
	report.setSystemInfo("base Browser", "Chrome");
	report.setSystemInfo("Os", "window");
	report.setSystemInfo("Base platform", "Testing");
	report.setSystemInfo("Url", " https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	
	
	}

	public void onFinish(ITestContext context) {
		
		System.out.println("---------Suite Execution Finished-----------");
		
		// Generate ExtentReport
		report.flush();
		
	}

	
	
}
