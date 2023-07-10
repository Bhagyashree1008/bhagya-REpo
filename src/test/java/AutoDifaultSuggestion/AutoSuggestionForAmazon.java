package AutoDifaultSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import WebElements.webelements;

public class AutoSuggestionForAmazon {
	
		public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("puma");
		 WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
		 searchField.sendKeys("bluetooth");

		 Thread.sleep(3000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']"
		 + "/child::div"));
		 for (WebElement web : suggestions)
		 {
		String text = web.getText();
		if(text.contains(" earbuds"))
		{
		web.click();
		break;
		}
		}
		 Thread.sleep(5000);
		 // driver.quit();
		}
	}