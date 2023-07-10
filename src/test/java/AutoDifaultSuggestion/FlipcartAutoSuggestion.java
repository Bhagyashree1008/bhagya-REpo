package AutoDifaultSuggestion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartAutoSuggestion {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();

	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("puma",Keys.ENTER);
	
/*	Thread.sleep(2000);
	List<WebElement> list = driver.findElements(By.tagName("li"));
	
	for(WebElement wb:list)
	{
		if(wb.getText().contains(" sneakers men"))
		{
			System.out.println(wb.getText());
			Thread.sleep(1000);
			wb.click();
			break;
		}
	}*/
	
	
}}
}
