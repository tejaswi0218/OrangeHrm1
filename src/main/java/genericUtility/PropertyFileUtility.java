package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
  * This class consist of generic method to use of generic method
  * @author Admin
  *
  */
 public class PropertyFileUtility {
/**
 * This method will read data from property file and return value to caller
 * @param key
 * @return
 * @throws IOException
 */
 
public String readDataFromPropertyFile(String key) throws IOException {
		
	FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
	
	Properties p = new Properties();
	
	p.load(fis);
	
    String value=p.getProperty(key);
   
    return value;
	
	}
	
	}


