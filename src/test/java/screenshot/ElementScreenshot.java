package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ElementScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String timestamp = LocalDateTime.now().toString().replace(':', '-');
		driver.get("https://www.facebook.com/");
		WebElement login = driver.findElement(By.name("login"));
		
		//TakesScreenshot ts=(TakesScreenshot) driver;
		File tempfile = login.getScreenshotAs(OutputType.FILE);
		File permfile = new File("./elementerrorshots/"+timestamp+"facebookloginbutton.png");
		FileUtils.copyFile(tempfile, permfile);
		driver.manage().window().minimize();
		driver.quit();
	}

}
