package selectclass;

	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class DefaultSelectedOption {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		driver.get("https://www.facebook.com/signup");
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select yearSelect = new Select(yearDropDown);
		String defaultSelectedYear = yearSelect.getFirstSelectedOption().getText();
		System.out.println("defaultSelectedYear = " + defaultSelectedYear);
		driver.manage().window().minimize();
		driver.quit();
	}
	
	}