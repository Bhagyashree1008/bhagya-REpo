package AutoDifaultSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements {

		public static void main(String[] args) {
			
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();

	driver.findElement(By.xpath("//button[text()='✕']")).click();
	List<WebElement> allLinks = driver.findElements(By.xpath("//a"));//370

	int count=0;//1 //2
	//forEach loop
	for(WebElement wb:allLinks)//1 //2
	{
		System.out.println(wb.getText());//------>1,2-----370
		count++;//1 //2
	}
	System.out.println("total no of Links:"+count);
		}

	}
}
