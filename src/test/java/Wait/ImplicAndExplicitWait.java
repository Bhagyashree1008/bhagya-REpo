package Wait;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ImplicAndExplicitWait {

	public static void main(String[] args) {
	
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.royalchallengers.com/");
		WebDriverWait explicit = new WebDriverWait(driver, Duration.ofSeconds(15));
		   List<WebElement> element = driver.findElements(By.xpath("//div[@id=\"homepage-slider\"]"));
		  System.out.println(element);
		if(explicit.until(ExpectedConditions.
		{
			System.out.println("elements are not visible in given time duration");
		}
		else
		{
			System.out.println("elements are visible in given time");
		}
	}

}
