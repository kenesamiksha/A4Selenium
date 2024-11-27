package JavaScriptExecutier;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	File f = new File("");	
	FileInputStream fis = new FileInputStream(f);
	Workbook workbook = WorkbookFactory.create(fis);
	Sheet sheet = workbook.getSheet("")	;
	Row row = sheet.getRow(1);
	Cell cell = row.getCell(3);
	String data = cell.toString();
	System.out.println(data);
	
	}

}
