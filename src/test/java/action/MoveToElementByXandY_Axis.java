package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementByXandY_Axis {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.cowin.gov.in/");
		WebElement abhaOption = driver.findElement(By.xpath("//a[text()='ABHA ']"));
		WebElement dashboardOption = driver.findElement(By.xpath("//a[text()=' Dashboard ']"));
		WebElement verifyCertificateOption = driver.findElement(By.xpath("//a[text()=' Verify Certificate ']"));
		WebElement faqOption = driver.findElement(By.xpath("//a[text()=' FAQ ']"));
		WebElement partnersOption = driver.findElement(By.xpath("//a[text()=' Partners ']"));
      	Actions actions = new Actions(driver);
      	//actions.moveToElement(abhaOption, 0, 0).pause(1000).moveToElement(abhaOption, 138, 0).pause(1000).moveToElement(dashboardOption, 152, 0).pause(1000).moveToElement(verifyCertificateOption, 123, 0).pause(1000).moveToElement(faqOption, 89, 0).perform();
      	actions.moveToElement(abhaOption, 0, 0).pause(1000).moveToElement(abhaOption, 138, 0).pause(1000).moveToElement(abhaOption, 291, 0).pause(1000).moveToElement(abhaOption, 415, 0).pause(1000).moveToElement(abhaOption, 504, 0).perform();
 
	}

}
