package POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CoverFoxHealthPlanMemberDetails
{

	//variable initialization
	@FindBy(id = "Age-You") private WebElement age_drop;
	@FindBy(xpath = "//div[text()='Next']")private WebElement healthPlanNextButton;
	
	//costructor
	
	public CoverFoxHealthPlanMemberDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//create methods
	public void select_age( String age)
	{
	     Select sAge=new Select(age_drop);
	     sAge.selectByValue(age+"y");
	}
	
	public void click_healthPlanNextButton()
	{
		healthPlanNextButton.click();
	}
}
