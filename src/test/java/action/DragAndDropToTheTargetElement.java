package action;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropToTheTargetElement {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	driver.get("https://jqueryui.com/droppable/");
	driver.switchTo().frame(0);
	WebElement draggableElement = driver.findElement(By.id("draggable"));
	WebElement droppableElement = driver.findElement(By.id("droppable"));
	Actions actions = new Actions(driver);
	actions.dragAndDrop(draggableElement, droppableElement).perform();
}
}

