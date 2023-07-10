package Datadriven;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class ReadTheDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/testcasespecificdata_03.xlsx");
		Workbook workBook = WorkbookFactory.create(fis);
		Sheet sheet = workBook.getSheet("mockdata");
		Row row = sheet.getRow(4);
		Cell cell = row.getCell(0);
		String cellStringData = cell.getStringCellValue();
		System.out.println("cellStringData = " + cellStringData);
		Row row1 = sheet.getRow(4);
		Cell cell1 = row1.getCell(1);
		long cellNumericData = (long) cell1.getNumericCellValue();
	    System.out.println("cellNumericData = " + cellNumericData);
		
	}
}
