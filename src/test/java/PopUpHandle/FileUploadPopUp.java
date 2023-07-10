package PopUpHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.monsterindia.com/");
		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
//WebElement data = driver.findElement(By.xpath("//button[text()='Or select file to upload']"));
    WebElement data = driver.findElement(By.id("file-upload"));
    data.sendKeys("C:\\Users\\Shobha\\Downloads\\extentReportDoc.txt");
    System.out.println("uploaded sucessfully");
	}

}

