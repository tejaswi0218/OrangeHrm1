package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		
		Properties p = new Properties();
		
	    p.load(f);
	    
	  String value=  p.getProperty("url");
	  System.out.println(value);
	  
	 String value1= p.getProperty("username");
	 System.out.println(value1);
	  
	}

}
