package action;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class DropDownByKeysClass {
	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(2000);
	WebElement datelist = driver.findElement(By.id("day"));
	Thread.sleep(1000);
	datelist.click();
	datelist.sendKeys(Keys.ARROW_UP);
	datelist.sendKeys(Keys.ARROW_DOWN);
	datelist.sendKeys(Keys.ARROW_DOWN);
	datelist.sendKeys(Keys.ARROW_DOWN);
	datelist.sendKeys(Keys.ARROW_UP);
	}
}
