package action;




	import java.awt.RenderingHints.Key;
import java.time.Duration;

	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.WebDriverWait;


public class KeyUpAndKeyDown {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		//WebElement loginButton = driver.findElement(By.name("login"));
		Actions actions = new Actions(driver);
		//driver.switchTo().activeElement().sendKeys("slenium",Keys.TAB,"selenium");
		Thread.sleep(1000);
			actions.moveToElement(email).keyDown(Keys.SHIFT).sendKeys("selenium").keyUp(Keys.SHIFT).perform();//.pause(1000).keyDown(Keys.CONTROL).sendKeys("a").release().pause(1000).sendKeys(Keys.BACK_SPACE).pause(1000).moveToElement(password).pause(1000).keyDown("selenium").sendKeys(Keys.TAB).click().build().perform();
	}
	}


