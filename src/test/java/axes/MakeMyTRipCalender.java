package axes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTRipCalender 
{
		public static void main(String[] args) throws Throwable {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
			driver.get("https://www.makemytrip.com/");
			//driver.findElement(By.xpath("//a[@class=\"close\"]/ancestor::div[@class=\"container\"]")).click();
			driver.findElement(By.xpath("//div[@class=\"wrapper\"]/descendant::a[@class=\"close\"]")).click();
}
}
