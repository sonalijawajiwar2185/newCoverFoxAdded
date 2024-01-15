package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import UtilityPackage.UtilityClassCommonMethodsUse;

public class BaseClassforCoverFox {
	protected static WebDriver driver;

	// open browser
	public void launchcoverFoxBrowser() {

		driver = new ChromeDriver();
		Reporter.log("Launching Browser", true);
		driver.get("https://www.coverfox.com/");
		driver.manage().window().maximize();
		// use commonMethodClass for Implicit Wait
		UtilityClassCommonMethodsUse.waituse(driver, 5);
	}

	// close browser
	public void closeBrowser1() throws InterruptedException {
		driver.close();
		Thread.sleep(1000);
		Reporter.log("closing Browser", true);
	}
}
