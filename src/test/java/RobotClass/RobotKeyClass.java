package RobotClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import WebElements.webelements;

public class RobotKeyClass {
	

		public static void main(String[] args) throws Throwable {
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			driver.manage().window().maximize();
			
			  WebElement ele = driver.findElement(By.id("username"));
			 ele.sendKeys("admin");
			ele.sendKeys(Keys.chord(Keys.CONTROL,"a"));
			ele.sendKeys(Keys.chord(Keys.CONTROL,"c"));
			/*	Robot r =new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_A);
			
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_C);
			
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);*/
			}}

