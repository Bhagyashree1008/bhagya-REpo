package AutoDifaultSuggestion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuggestionGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().swi
		
	}

}
