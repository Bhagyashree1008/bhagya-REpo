package Datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenFromPropertyFile {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		FileInputStream file=new FileInputStream("src/main/resources/file.properties");
		Properties pro=new Properties();
		pro.load(file);
		
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
	String PASSWORD = pro.getProperty("password");
	
	driver.get(URL);
	driver.findElement(By.id("username")).sendKeys(USERNAME);
	driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
	driver.findElement(By.id("loginButton")).click();
		
	}

}
