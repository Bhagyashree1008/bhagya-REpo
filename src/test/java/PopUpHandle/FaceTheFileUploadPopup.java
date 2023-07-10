package PopUpHandle;


	import java.awt.Robot;
	import java.awt.Toolkit;
	import java.awt.datatransfer.Clipboard;
	import java.awt.datatransfer.StringSelection;
	import java.awt.event.KeyEvent;
	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class FaceTheFileUploadPopup {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.foundit.in/");
		WebElement uploadResumeOption = driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]"));
		uploadResumeOption.click();
		//WebElement selectFileOption = driver.findElement(By.xpath("//button[text()='Or select file to upload']"));
		WebElement selectFileOption = driver.findElement(By.id("file-upload"));
		String absoluteFilePath = "C:\\Users\\satya1008\\Desktop\\java throry.docx";
		StringSelection stringObject = new StringSelection(absoluteFilePath);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Clipboard clipboard = toolkit.getSystemClipboard();
		clipboard.setContents(stringObject, null);
		Thread.sleep(2000);
		//selectFileOption.click();
		Actions actions = new Actions(driver);
		actions.click(selectFileOption).perform();
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
