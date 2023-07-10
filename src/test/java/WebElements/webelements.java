package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelements {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("foundation");
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/child::div"));
		
		for (WebElement result : suggestions) 
	       {
			String text =result.getText();
			if(text.contains(" for face makeup"))
			{
				result.click();
				break;
			}
		}
	       Thread.sleep(5000);
	    //   driver.quit();
	    }
	}

