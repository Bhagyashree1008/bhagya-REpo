package HandleFrame;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIndividualFrame {
	
		// NoSuchFrameException ---- if it is not nested frame and if you try to transfer the driver control 
		// from one frame to another frame 
		// NoSuchElementException ---- if the ele is present in the frame and if we have not identified the frame 
		// and if we try to perform the action.
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		// Frame 01
		driver.switchTo().frame("packageListFrame");
		WebElement frame_1Ele = driver.findElement(By.xpath("//li/a[text()='org.openqa.selenium']"));
		frame_1Ele.click();
		Thread.sleep(1000);
		// frame 02
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		WebElement frame_2Ele = driver.findElement(By.xpath("//span[text()='Alert']"));
		frame_2Ele.click();
	}
	}

