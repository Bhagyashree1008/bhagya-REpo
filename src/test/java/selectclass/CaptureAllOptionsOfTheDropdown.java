package selectclass;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CaptureAllOptionsOfTheDropdown {

		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
			driver.get("https://www.facebook.com/signup");
			WebElement dayDropDown = driver.findElement(By.id("day"));
			Select daySelect = new Select(dayDropDown);
			List<WebElement> allDayOptions = daySelect.getOptions();
			for (WebElement opt : allDayOptions)
			{
				String optText = opt.getText();
				System.out.println(optText);
			
	}
	}
}
