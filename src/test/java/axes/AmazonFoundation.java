package axes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonFoundation {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		
		//WebElement search = driver.findElement(By.xpath("//label[text()='Search Amazon.in']/parent::div"));
		//search.sendKeys("foundation");
		
		WebElement foundation = driver.findElement(By.id("twotabsearchtextbox"));
		foundation.sendKeys("foundation");
		//List<WebElement> search = driver.findElements(By.xpath("//div[@class=\"two-pane-results-container\"]"));
		//System.out.println(search);
			driver.findElement(By.xpath("//span[text()=' cream']")).click();
			
			driver.findElement(By.xpath("//span[contains(text(),'Lakme Perfecting Liquid Foundation, Co')]")).click();
			
		
	}

}
