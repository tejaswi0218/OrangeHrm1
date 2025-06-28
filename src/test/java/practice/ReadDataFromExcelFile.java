package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream f = new FileInputStream(".\\src\\test\\resources\\orangehrm.xlsx");
		
		Workbook w =WorkbookFactory.create(f);
		
		Sheet s =w.getSheet("Orangehrm");
		
		Row r =s.getRow(4);
		
		Cell c =r.getCell(2);
		
		String value =c.getStringCellValue();
		
		System.out.println(value);
		
		
		
	}

}
