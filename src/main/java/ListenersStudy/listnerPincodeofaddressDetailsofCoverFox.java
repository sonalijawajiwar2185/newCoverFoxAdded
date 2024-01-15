package ListenersStudy;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import BasePackage.BaseClassforCoverFox;
import UtilityPackage.UtilityClassCommonMethodsUse;

public class listnerPincodeofaddressDetailsofCoverFox extends BaseClassforCoverFox implements ITestListener 
{
	@Override
	public void onTestFailure(ITestResult result)
	{
		String Value = result.getName();
		try {
			UtilityClassCommonMethodsUse.getScreenShot(driver, Value);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("Error message is not displayed", true);	
	}
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		
			}

}
