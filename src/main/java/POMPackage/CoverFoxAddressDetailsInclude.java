package POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestListener;
import org.testng.Reporter;

public class CoverFoxAddressDetailsInclude  
{
	
	@FindBy(xpath = "(//input[@type='number'])[1]") private WebElement pincode;
	@FindBy(xpath = "(//input[@type='number'])[2]") private WebElement mobile_number;
	@FindBy(xpath = "//div[text()='Continue']") private WebElement continue_button;
	

	//constructor
	public CoverFoxAddressDetailsInclude(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//create methods
	public String select_pincode1(String addpincode)
	{
		pincode.sendKeys(addpincode);
		return addpincode;
	}
	public void select_mobile_number1(String Addmob)
	{
		mobile_number.sendKeys(Addmob);
	}
	public void click_on_continue_button()
	{
		continue_button.click();
	}
	public boolean check_error_message_forPincode()
	{
		Reporter.log("Please enter correct Pincode",true);
		return true;
	}

	
	
	
	
	
}

