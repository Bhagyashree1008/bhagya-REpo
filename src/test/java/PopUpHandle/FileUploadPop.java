package PopUpHandle;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class FileUploadPop {
	public static void main(String[] args) throws Throwable {
		// this logic is applicable only if the ele is made up of <input>.
		// so for the ele we will pass the absolute file path of the system.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://demo.guru99.com/test/upload/");
		WebElement chooseFileOption = driver.findElement(By.id("uploadfile_0"));
		chooseFileOption.sendKeys("C:\\Users\\satya1008\\Desktop\\vtiger.properties");
		Thread.sleep(1000);
		WebElement termsOfService = driver.findElement(By.id("terms"));
		termsOfService.click();
		Thread.sleep(1000);
		WebElement submitOption = driver.findElement(By.id("submitbutton"));
		submitOption.click();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
	}
}
