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
import org.apache.poi.ss.usermodel.DataFormatter;
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
public class writeToExcelTagText {
			public static void main(String[] args) throws Throwable {
			
					WebDriver driver;
					WebDriverManager.chromedriver().setup();
					driver=new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
					
					FileInputStream file=new FileInputStream("./src/test/java/Datadriven/writeTo.xlsx");
					Workbook book = WorkbookFactory.create(file);
					Sheet sh = book.getSheet("Sheet2");

					System.out.println(sh.getLastRowNum());
					for(int i=0;i<sh.getLastRowNum();i++) {
						
						Row row = sh.getRow(i);
						for(int j=0;j<row.getLastCellNum();j++)
						{
							Cell cell=row.getCell(j);
							DataFormatter format=new DataFormatter();
							String data = format.formatCellValue(cell);
							System.out.println(data);		
						}
					}
			}
		}
