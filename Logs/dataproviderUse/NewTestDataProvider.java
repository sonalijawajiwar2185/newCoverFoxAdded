package dataproviderUse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dataproviderUse.FbDataProviderClass;



public class NewTestDataProvider {
  @Test(dataProvider="FBRegression",dataProviderClass =FbDataProviderClass.class)
  public void faceBookEntry(String firstName,String lastname,String mobileNo) throws InterruptedException
  {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
	driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstName);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(mobileNo);
	Thread.sleep(1000);
	driver.close();
	  
  }
}
