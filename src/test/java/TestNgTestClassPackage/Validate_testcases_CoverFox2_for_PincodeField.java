package TestNgTestClassPackage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BasePackage.BaseClassforCoverFox;
import POMPackage.CoverFoxAddressDetailsInclude;
import POMPackage.CoverFoxHealthPage;
import POMPackage.CoverFoxHomePage1;
import POMPackage.coverFoxHealthPlanResult;
import UtilityPackage.UtilityClassCommonMethodsUse;
import POMPackage.CoverFoxHealthPlanMemberDetails;
@Listeners(ListenersStudy.listnerPincodeofaddressDetailsofCoverFox.class)
public class Validate_testcases_CoverFox2_for_PincodeField extends BaseClassforCoverFox
{
    public static Logger logger;
	CoverFoxHomePage1 home;
	CoverFoxHealthPage healthPage;
	CoverFoxHealthPlanMemberDetails memberDetails;
	CoverFoxAddressDetailsInclude addressDetailsInclude;    
	coverFoxHealthPlanResult result;	
	
  @BeforeClass
  public void launchBrowser()
  {
	  logger=logger.getLogger("CoverFoxInsurance");
	  PropertyConfigurator.configure("C:\\Users\\sonal\\eclipse-workspace\\CoverFoxInsurance\\src\\test\\resources\\log4j.properties");
	  logger.fatal("Launching Browser");
	  launchcoverFoxBrowser();
	  driver=new ChromeDriver();
	  home=new CoverFoxHomePage1(driver);
	  healthPage=new CoverFoxHealthPage(driver);
	  memberDetails=new CoverFoxHealthPlanMemberDetails(driver);
	  addressDetailsInclude=new CoverFoxAddressDetailsInclude(driver);
       result=new coverFoxHealthPlanResult(driver);	  
	  
	  Reporter.log("Launching Browser", true);
	  //driver.manage().window().maximize();
	  //use commonMethodClass for Implicit Wait
	  UtilityClassCommonMethodsUse.waituse(driver, 5);
  }  
  @BeforeMethod
  public void callingMethodsOfClass() throws EncryptedDocumentException, IOException, InterruptedException 
  {
	  Reporter.log("On home Page", true);
	  logger.info("On Home Page");
	  home.clickOngetStartedButton1();
	  
	  Reporter.log("On Health Page", true);
	  logger.info("On Home Page");

	  healthPage.click_next_button();
	  
	  Reporter.log("On members details Page", true);
	  logger.fatal("On members details Page");
	 // memberDetails.select_age(CommonMethodsUse.excelUse("coverFox", 0, 0));
	  memberDetails.select_age(UtilityClassCommonMethodsUse.ReadDataFromPropertiesClass("age"));
	  memberDetails.click_healthPlanNextButton();
	  
       //addressDetailsInclude.select_pincode1(CommonMethodsUse.excelUse("coverFox", 3, 0));
      String pincode = addressDetailsInclude.select_pincode1(UtilityClassCommonMethodsUse.ReadDataFromPropertiesClass("pincode"));
      SoftAssert soft=new SoftAssert();
      soft.assertEquals("411003",pincode,"Pincode is  not mathching,Test case failed" );
      Reporter.log("Test Case passed", true);
      logger.info("Test Case passed");
      soft.assertAll();
      // addressDetailsInclude.select_mobile_number1(CommonMethodsUse.excelUse("coverFox", 3, 1));
	  addressDetailsInclude.select_mobile_number1(UtilityClassCommonMethodsUse.ReadDataFromPropertiesClass("mobileNumber"));
       addressDetailsInclude.click_on_continue_button();
       }
  
  @Test
  public void ValidatePincode() throws IOException
  {
	  String pincode = addressDetailsInclude.select_pincode1(UtilityClassCommonMethodsUse.ReadDataFromPropertiesClass("pincode"));
      SoftAssert soft=new SoftAssert();
      soft.assertEquals("411003",pincode,"Pincode is not mathching,Test case Failed" );
      soft.assertAll();
      Reporter.log("Test Case had been Passed", true);
      logger.info("Test Case passed");
       
  }
  
  @AfterClass
  public void closeBrowser() throws InterruptedException
  {
       closeBrowser1();
   }
}  
  
  

  

  

