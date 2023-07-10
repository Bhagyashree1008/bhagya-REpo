package Datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenExcel {
	public static void main(String[] args) throws Throwable {
		
	WebDriver driver=new EdgeDriver();
	driver=WebDriverManager.edgedriver().create();
	
	FileInputStream fis=new FileInputStream("./commondata10.properties.txt");
	
	Properties pro=new Properties();
	pro.load(fis);
	
	String URL = pro.getProperty("url1");
	driver.get(URL);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	
	//Fetching data from Excel
	//connecting the path
	//FileInputStream fes=new FileInputStream("./Batch10.xlsx");
	FileInputStream fes=new FileInputStream("C:\\Users\\Shobha\\Desktop\\Batch10.xlsx");
	//load the data
	Workbook book = WorkbookFactory.create(fes);
	
	//sheet
Sheet sheet = book.getSheet("FilpKart");
	
	//row
	Row row = sheet.getRow(1);
	
	//cell
	Cell cell = row.getCell(0);
	
	String Exceldata = cell.getStringCellValue();
	
	driver.findElement(By.name("q")).sendKeys(Exceldata);
}
}
