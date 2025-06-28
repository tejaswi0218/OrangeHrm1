package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzerPratice {

	@Test(retryAnalyzer=genericUtility.RetryAnalyzerImplementation.class)
	public void retryanalyzer() {
		
		Assert.fail();
		System.out.println("Hi");
	}
}
