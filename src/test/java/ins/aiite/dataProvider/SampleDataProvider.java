package ins.aiite.dataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import ins.aiite.baseclass.BaseClass;

public class SampleDataProvider {
	
	@Test
	public void call2Din()
	{
		Object[][] ob1=BaseClass.covertExcelToTwoDimenArray();
		BaseClass.printTwoDImArray(ob1);
	}
	
	
	
	
	@Test @Ignore
	public void pickDataUsingDataProvider()
	{
		System.out.println("Browser Launch");
		System.out.println("GetUrl");
		System.out.println("Type");
		System.out.println("Username");
		System.out.println("Password");
		System.out.println("Click Login");
		
	}
	
	@Test @Ignore
	public void twoArr()
	{
		Object[][] ob1=new Object[][] {{"t1,1"},{"t1,1"},{"t1,1"},{"t1,1"}};
		Object[][] ob2=new Object[2][2];
		ob2[0][0]="T00";
		ob2[0][1]="T01";
		ob2[1][0]="T10";
		ob2[1][1]="T11";
		
		for(int i=0;i<ob2.length;i++)
		{
			for (int j=0;j<ob2[i].length;j++)
			{
				System.out.print(ob2[i][j]+ " ");
			}
			System.out.println();
		}	
		
	}
	
	@Test(dataProvider = "logintestdata", dataProviderClass =SampleDataProvider2.class)
	public void pickDataUsingDataProvider(String type, String u, String p)
	{
		System.out.println("Browser Launch");
		System.out.println("GetUrl");
		System.out.println(type);
		System.out.println(u);
		System.out.println(p);
		System.out.println("Click Login");		
	}	

}
