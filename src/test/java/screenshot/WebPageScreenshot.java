package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebPageScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String timestamp = LocalDateTime.now().toString().replace(':', '-');
		driver.get("https://www.flipkart.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File tempfile = ts.getScreenshotAs(OutputType.FILE);
		File permfile = new File("./errorshots/"+timestamp+"facebookloginpage.png");
		FileUtils.copyFile(tempfile, permfile);
		driver.manage().window().minimize();
		driver.quit();
	}

}
