package POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHealthPage
{
	
	//variable initialization
	@FindBy(xpath = "//div[contains(text(),'Next')]") private WebElement next_button;
	
	//contructor 
	public CoverFoxHealthPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
   
	//create methods
	public void click_next_button()
	{
		next_button.click();
	}
	
	
}
