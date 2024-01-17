package TestNgTestClassPackage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.EncryptedDocumentException;
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
import POMPackage.CoverFoxHealthPlanMemberDetails;
import POMPackage.CoverFoxHomePage1;
import POMPackage.coverFoxHealthPlanResult;
import UtilityPackage.UtilityClassCommonMethodsUse;
@Listeners(ListenersStudy.ExtentReporterNG.class)

public class Validate_testcases_CoverFox extends BaseClassforCoverFox
{
    public static Logger logger;
    CoverFoxHomePage1 home;
    CoverFoxHealthPage healthPage;
	CoverFoxHealthPlanMemberDetails memberDetails;
	CoverFoxAddressDetailsInclude addressDetailsInclude;    
	coverFoxHealthPlanResult result;	
	
  @BeforeClass
  public void launchBrowser() throws InterruptedException
  {
	  logger=Logger.getLogger("CoverFoxInsurance");
	  PropertyConfigurator.configure("C:\\Users\\sonal\\eclipse-workspace\\CoverFoxInsurance\\src\\test\\resources\\log4j.properties");
	  launchcoverFoxBrowser();
	  Thread.sleep(1000);
	  home=new CoverFoxHomePage1(driver);
	  healthPage=new CoverFoxHealthPage(driver);
	  memberDetails=new CoverFoxHealthPlanMemberDetails(driver);
	  addressDetailsInclude=new CoverFoxAddressDetailsInclude(driver);
       result=new coverFoxHealthPlanResult(driver);	  
	  
	  //use commonMethodClass for Implicit Wait
	 // UtilityClassCommonMethodsUse.waituse(driver, 5);
  }  
  @BeforeMethod
  public void callingMethodsOfClass() throws EncryptedDocumentException, IOException, InterruptedException 
  {
	  Reporter.log("On home Page", true);
	  logger.fatal("On home Page");
	  home.clickOngetStartedButton1();
	  
	  Reporter.log("On Health Page", true);
	  logger.fatal("On Health Page");
	  healthPage.click_next_button();
	  
	  Reporter.log("On members details Page", true);
	  logger.info("On members details Page");
	  memberDetails.select_age(UtilityClassCommonMethodsUse.excelUse("coverFox", 0, 0));
	//  memberDetails.select_age(UtilityClassCommonMethodsUse.ReadDataFromPropertiesClass("age"));
	  memberDetails.click_healthPlanNextButton();
	  Thread.sleep(500);
     addressDetailsInclude.select_pincode1(UtilityClassCommonMethodsUse.excelUse("coverFox", 3, 0));
     // addressDetailsInclude.select_pincode1(UtilityClassCommonMethodsUse.ReadDataFromPropertiesClass("pincode"));
       addressDetailsInclude.select_mobile_number1(UtilityClassCommonMethodsUse.excelUse("coverFox", 3, 1));
	  //addressDetailsInclude.select_mobile_number1(UtilityClassCommonMethodsUse.ReadDataFromPropertiesClass("mobileNumber"));
       addressDetailsInclude.click_on_continue_button();
       }
  @Test
  public void validateResultNumber() throws InterruptedException, IOException 
  {
	  Reporter.log("On Result Page", true);
	  logger.info("On Result Page");
	  int textResult = result.Text_to_check_result();
	  Thread.sleep(4000);

	  Reporter.log("text Result :"+textResult, true);
	  logger.info("Text Result");
	  int bannerResult = result.banners_to_check_result();
	  Thread.sleep(4000);

	  Reporter.log("text Result :"+bannerResult, true);
	  logger.info("text Result :\"+bannerResult");
      SoftAssert soft=new SoftAssert();
	  soft.assertEquals(textResult, bannerResult,"Text result are not mathching with Banner Result,Test case failed ");
	 // Assert.assertEquals(textResult,bannerResult,"Text result are not mathching with Banner Result,Test case failed ");
	  Reporter.log("Test case passed", true);
	  logger.info("Test Case Passed");
     soft.assertAll();	
  }
 @Test(enabled = false)
 public void SearchsortPlanText() throws InterruptedException
  {
	  SoftAssert soft=new  SoftAssert();
	  soft.assertTrue(result.printSortPlanText(), "text SortPlan is not Present,test Case Failed");
	  soft.assertAll();
	  Reporter.log("test case passed", true);
	  logger.info("test case passed");
	  
	  
  }
  
   
  
   @AfterClass
  public void closeBrowser() throws InterruptedException
  {
       closeBrowser1();
   }
}  
  
  



  

