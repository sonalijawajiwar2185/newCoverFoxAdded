package POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHomePage1
{
	//variable initialization
//     @FindBy(xpath = "//div[text()='Female']") private WebElement GenderCheck;
//     @FindBy(xpath = "//div[text()='MOBILE NUMBER']") private WebElement enter_mobile;
       @FindBy(xpath = "//button[text()='Get Started']")private WebElement getStartedButton1;
     
     
     //Create Constructor
     public CoverFoxHomePage1(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
    
      //create methods
//     public void clickOnGender()
//     {
//    	 GenderCheck.click();
//     }
//     public void mobile_number_enter()
//     {
//    	 enter_mobile.sendKeys("8888888888");
//     }
//     
     public void clickOngetStartedButton1()
     {
    	 getStartedButton1.click();
     }
}
