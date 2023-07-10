package action;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ClickAction {
	@Test
public void ClickActionTest() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	driver.get("https://www.facebook.com/");
	WebElement loginButton = driver.findElement(By.name("login"));
	Actions actions = new Actions(driver);
	//actions.click(loginButton).perform();
	//actions.contextClick().perform();
	actions.contextClick(loginButton).perform();
	driver.switchTo().alert().sendKeys("hi");
}
}
