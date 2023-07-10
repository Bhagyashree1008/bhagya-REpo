package action;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class MoveToTaregtElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.myntra.com/");
		WebElement menOption = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Men']"));
		WebElement womenOption = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Women']"));
		WebElement kidsOption = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Kids']"));
		WebElement homeAndLivingOption = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Home & Living']"));
		WebElement beautyOption = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Beauty']"));
		WebElement studioOption = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Studio']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(menOption).pause(500).moveToElement(womenOption).pause(500).moveToElement(kidsOption).pause(500).moveToElement(homeAndLivingOption).pause(500).moveToElement(beautyOption).pause(500).moveToElement(studioOption).perform();
		
		
	}
	}

