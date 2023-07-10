package action;


import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendKeysThroughActions {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	driver.get("https://www.facebook.com/");
	WebElement eamilTextField = driver.findElement(By.id("email"));
	WebElement loginButton = driver.findElement(By.name("login"));
	Actions actions = new Actions(driver);
	//actions.sendKeys(eamilTextField, "123abc@gmail.com").perform();
	//actions.sendKeys("123abc@gmail.com").perform();
	//actions.sendKeys(driver.switchTo().activeElement()).sendKeys("QSPIDERS").perform();
	actions.sendKeys(driver.switchTo().activeElement()).pause(1000).sendKeys("Qspiders@gamil.com").pause(1000).sendKeys(Keys.TAB).pause(1000).sendKeys("QSP").pause(1000).click(loginButton).build().perform();
}
}