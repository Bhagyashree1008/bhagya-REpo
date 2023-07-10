package Datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class writeDataToExcel {

	public static void main(String[] args) throws Throwable {
	
			WebDriver driver;
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			driver.get("https://www.amazon.com/");
			FileInputStream file=new FileInputStream("./src/test/java/Datadriven/writeTo.xlsx");
			//FileInputStream file= new FileInputStream("actifile.xlsx");
			Workbook book = WorkbookFactory.create(file);
			Sheet sh = book.getSheet("Sheet2");

			List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
			
			for(int i=0;i<alllinks.size();i++) {
				Row row = sh.createRow(i);
				Cell cell=row.createCell(0);
				cell.setCellValue(alllinks.get(i).getText());
			}
			FileOutputStream fout=new FileOutputStream("./src/test/java/Datadriven/writeTo.xlsx");
			//FileOutputStream fout=new FileOutputStream("actifile.xlsx");
			
			book.write(fout);
			book.close();
	
		}
	

}
