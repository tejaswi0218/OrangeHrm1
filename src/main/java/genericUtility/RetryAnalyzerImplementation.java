package genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * This class consist of implementation to IRetryAnalyzer of testng
 * @author Admin
 *
 */
public class RetryAnalyzerImplementation implements IRetryAnalyzer {

	int count =0;
	int retrycount =3;
	public boolean retry(ITestResult result) {
		
		while(count<retrycount) {
			
			count++;
			return true;
		}
		return false; // no to retry
	}

}
