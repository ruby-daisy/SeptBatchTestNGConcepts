package ins.aiite.TestNGP1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SampleClass6 {
	
	@Parameters({"browser"})
	@Test
	public void crossBrowser(String b){
		WebDriver driver=null; 
		if(b.equals("chrome"))
		{
			System.out.println("Chrome");
			driver=new ChromeDriver();
			driver.get("https://demoqa.com");
		}
		else if (b.equals("edge"))
		{
			System.out.println("edge");
			driver=new EdgeDriver();
			driver.get("https://demoqa.com");
		}
		else if (b.equals("firefox"))
		{
			System.out.println("firefox");
			
		}
		
		
		
	}

}
