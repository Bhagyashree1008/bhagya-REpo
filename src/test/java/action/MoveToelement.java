package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoveToelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		driver.get("https://www.myntra.com/");
		WebElement men = driver.findElement(By.xpath("//header//a[text()='Men']"));
		WebElement Women = driver.findElement(By.xpath("//header//a[text()='Women']"));
		WebElement Kids = driver.findElement(By.xpath("//header//a[text()='Kids']"));
		WebElement HomeLiving = driver.findElement(By.xpath("//header//a[text()='Home & Living']"));
		WebElement Beauty = driver.findElement(By.xpath("//header//a[text()='Beauty']"));
		WebElement Studio = driver.findElement(By.xpath("//header//a[text()='Studio']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(men, 0, 0).pause(1000).moveToElement(men, 62, 0).pause(1000).moveToElement(Women, 103, 0).pause(1000).moveToElement(Kids, 135, 0).pause(1000).moveToElement(HomeLiving, 200, 0).pause(1000).moveToElement(Beauty, 241, 0).pause(1000).moveToElement(Studio, 282, 0).perform();
	//	actions.scrollTo.click().scrollByAmount(0, 500).perform();
		
	}

}
