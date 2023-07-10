package PopUpHandle;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

	public class NotificationPopup {
	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
	}
}
