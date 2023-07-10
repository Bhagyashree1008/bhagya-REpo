

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import Product.HomePage;
import Product.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {

 public WebDriver driver;
 public static WebDriver Sdriver;
 File_Utility flib= new File_Utility();
	java_Utility jlib= new java_Utility();
	WebDriver_Utility wlib= new WebDriver_Utility();

	HomePage home= new HomePage(driver);

	@BeforeSuite
	  public void beforeSuite() {
		System.out.println("database Connection");
	  }

	 @BeforeTest
	  public void beforeTest() {
		 System.out.println("parallal execution");
	  }
//@DataProvider (name ="browser")	
@BeforeClass
	  public void beforeClass() throws Throwable {
		 System.out.println("launching the browser");

		String browser = flib.getBrowser("browser");

			if(browser.equalsIgnoreCase("chrome"))
			{

				WebDriverManager.chromedriver().setup();
				 driver = new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("edge"))
			{
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			else
			{
				driver = new ChromeDriver();
			}




			wlib.maximisescreen(driver);
			wlib.implicitlyWait(driver);
			wlib.waitForPageLoad(driver);

	// Sdriver=driver;

	}
  @BeforeMethod
  public void beforeMethod() throws Throwable {
	  System.out.println("login to the application");


		String url = flib.getStringKeyAndValue("url");
		String username = flib.getStringKeyAndValue("username");
		String password = flib.getStringKeyAndValue("password");
		driver.get(url);
		LoginPage login = new LoginPage(driver);
		login.LoginToPage(username, password);

		System.out.println("successfully login and home is displayed");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("close the application");

		home.logout(driver);;
  }



  @AfterClass
  public void afterClass() {
	  System.out.println("close the browser");
	  driver.quit();
  }



  @AfterTest
  public void afterTest() {
	  System.out.println("close parallal execution");
  }



  @AfterSuite
  public void afterSuite() {
	  System.out.println("close database connetion");
  }

}
