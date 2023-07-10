package Launch;

import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		Object FileNotFoundException;
		wait.ignoring(FileNotFoundException extends Throwable)


		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("//input[@id=\"email\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
	}


