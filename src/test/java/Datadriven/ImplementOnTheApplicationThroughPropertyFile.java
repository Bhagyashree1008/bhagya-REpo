package Datadriven;


	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.Properties;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class ImplementOnTheApplicationThroughPropertyFile {
		public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/commondataregularonline.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String browsername = pobj.getProperty("browsername");
		if (browsername.equals("chrome")) {
			driver = new ChromeDriver();
		}else if (browsername.equals("edge")) {
			driver = new EdgeDriver();
		}else if (browsername.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get(pobj.getProperty("url"));
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.sendKeys(pobj.getProperty("username"));
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		passwordTextField.sendKeys(pobj.getProperty("password"));
		WebElement loginOption = driver.findElement(By.id("loginButton"));
		loginOption.click();
	}
}
