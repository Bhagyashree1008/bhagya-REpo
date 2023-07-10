package HandleFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demo.automationtesting.in/Frames.html");
		WebElement iframeWithInAnIframe = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		iframeWithInAnIframe.click();
		WebElement outerFrame = driver.findElement(By.xpath("//div[@id='Multiple']/iframe"));
		driver.switchTo().frame(outerFrame);
		WebElement innerFrame = driver.findElement(By.xpath("//div[@class='iframe-container']/iframe"));
		driver.switchTo().frame(innerFrame);
		Thread.sleep(2000);
		WebElement innerFrameElement = driver.findElement(By.xpath("//input[@type='text']"));
		innerFrameElement.sendKeys("SELENIUM");
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
