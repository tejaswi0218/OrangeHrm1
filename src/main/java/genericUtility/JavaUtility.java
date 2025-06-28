package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class consist of java specific method
 * @author Admin
 *
 */
public class JavaUtility {

	public String getDate() {
		
		Date d = new Date();
		SimpleDateFormat f = new SimpleDateFormat("dd-MM-yy hh-mm-ss");
		String date =f.format(d);
		return date;
		
		
	}
}
