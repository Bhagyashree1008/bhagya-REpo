package axes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import WebElements.webelements;

public class AxesInLocators {

	public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement element1 = driver.findElement(By.xpath("//td[text()='Helen Bennett']/following-sibling::td"));
	System.out.println("following sibling"+element1);
	
	
	
	}

}
