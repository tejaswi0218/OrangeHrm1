package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class consist of generic method to read data from excel file
 * @author Admin
 *
 */
public class ExcelFileUtility {
/**
 * This method will read data from ExcelFile and return value to caller
 * @param sheetname
 * @param rowno
 * @param cellno
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
   public String readDataFromExcelFile(String sheetname,int rowno,int cellno) throws EncryptedDocumentException, IOException {
		
	  FileInputStream f = new FileInputStream(".\\src\\test\\resources\\orangehrm.xlsx");
		
	  Workbook w=	WorkbookFactory.create(f);
		
      String value= w.getSheet(sheetname).getRow(rowno).getCell(cellno).getStringCellValue();
      
      return value;
		
		
		
		
	}
}
