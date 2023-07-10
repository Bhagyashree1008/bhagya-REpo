package Datadriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

		public HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//a[text()='View Time-Track']")
		private WebElement viewLink;

		@FindBy(xpath="//a[text()='Enter Time-Track']")
		private WebElement enterLink;
		
		public WebElement getEnterLink() {
			return enterLink;
		}
	     public WebElement getViewLink() {
			return viewLink;
		}
		
		public void clickViewLink()
		{
			viewLink.click();
		}
		
		public void ClickEnterLink()
		{
			enterLink.click();
		}
	}

