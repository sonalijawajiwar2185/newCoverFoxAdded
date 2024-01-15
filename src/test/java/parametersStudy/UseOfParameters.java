package parametersStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;



public class UseOfParameters 
   {
	 @Parameters({"fName","sName","moNum"})
	   @Test
	  public void faceBookEntry(String firstName,String lastname,String mobileNo)
	  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(mobileNo);
		driver.close();
		  
	  }

}
