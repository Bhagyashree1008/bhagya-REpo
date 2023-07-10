package PopUpHandle;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class HiddenDivisionPopup {
		/*  behavior
		 * > <div> 
		 * > not draggable 
		 * > inspectable 
		 * > not a blockade
		 */
		// Strategy_01 : inspect and identify the element and handle the popup
		// Strategy_02 : by using Actions class method i.e: click() --- no argument method
		// since the control will be at the top left corner of the webpage we can perform the action
		// and handle the popup based on the behavior of the popup.
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		//WebElement closeOption = driver.findElement(By.xpath("//button[text()='✕']"));
		//closeOption.click();
		Actions actions = new Actions(driver);
		actions.click().perform();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
	}
}
