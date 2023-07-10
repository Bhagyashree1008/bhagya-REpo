package selectclass;

	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	public class DropDownUsingSelectClass {
	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(2000);
	/*WebElement datelist = driver.findElement(By.id("day"));
	//SelectByIndex()
	Select sel = new Select(datelist);
	sel.selectByIndex(8);
	WebElement monthlist = driver.findElement(By.id("month"));
	Select sele = new Select(monthlist);
	sele.selectByIndex(3);*/
	//SelectByValue()
	/* WebElement datelist = driver.findElement(By.id("day"));
	Select sel = new Select(datelist);
	sel.selectByValue("10");
	WebElement monthlist = driver.findElement(By.id("month"));
	Select sele = new Select(monthlist);
	sele.selectByValue("8");*/
	//SelectByVisibleText()
	WebElement datelist = driver.findElement(By.id("day"));
	Select sel = new Select(datelist);
	sel.selectByVisibleText("15");
	WebElement monthlist = driver.findElement(By.id("month"));
	Select sele = new Select(monthlist);
	sele.selectByVisibleText("Sep");
	WebElement yearlist = driver.findElement(By.id("year"));
	Select select = new Select(yearlist);
	select.selectByVisibleText("2002");
	}
	}
