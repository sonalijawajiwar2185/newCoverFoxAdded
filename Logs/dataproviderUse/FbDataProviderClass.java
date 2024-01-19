package dataproviderUse;

import org.testng.annotations.DataProvider;

public class FbDataProviderClass
{
	
	@DataProvider(name="FBRegression",parallel = true)
	public static String[][] fbDataset()
	{
		String data[][]= {{"Sonali","Jawajiwar","8888888888"},
				{"saisha","Jawajiwar","5656565656"},
				{"shubhra","Jawajiwar","6546546546"}};
		return data;
	}
			

}
