package selectclass;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class SelectBirthDate {

		public static void main(String[] args) throws Throwable {
			// 14-Feb-2002
			// select day by index
			// select month by value
			// select year by visible text  ---- Tag text
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
			driver.get("https://www.facebook.com/signup");
			Thread.sleep(2000);
			// DAY
			WebElement dayDropDown = driver.findElement(By.id("day"));
			Select daySelect = new Select(dayDropDown);
			daySelect.selectByIndex(28);
			Thread.sleep(2000);
			// MONTH
			WebElement monthDropDown = driver.findElement(By.id("month"));
			Select monthSelect = new Select(monthDropDown);
			monthSelect.selectByValue("9");
			Thread.sleep(2000);
			// YEAR
			WebElement yearDropDown = driver.findElement(By.id("year"));
			Select yearSelect = new Select(yearDropDown);
			yearSelect.selectByVisibleText("1989");
			Thread.sleep(2000);
			// post - condition
			driver.manage().window().minimize();
			driver.quit();
		}
		
	}

