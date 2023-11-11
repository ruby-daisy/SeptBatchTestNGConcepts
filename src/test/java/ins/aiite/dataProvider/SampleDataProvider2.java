package ins.aiite.dataProvider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import ins.aiite.baseclass.BaseClass;

public class SampleDataProvider2 extends BaseClass{
	
	
	@DataProvider(name="logintestdata")
	public Object[][] pickData()
	{
		Object[][] ob1=BaseClass.covertExcelToTwoDimenArray();
		return ob1;		
	}	
	
	@Test(dataProvider = "logintestdata")
	public void pickDataUsingDataProvider(String type, String u, String p)
	{
		System.out.println("Browser Launch");
		System.out.println("GetUrl");
		System.out.println(type);
		System.out.println(u);
		System.out.println(p);
		System.out.println("Click Login");		
//		browserlaunch();
//		getUrl("https://adactinhotelapp.com/");
//		uname(u);
//		pwd(p);
//		login();
		
	}	
	
	}


