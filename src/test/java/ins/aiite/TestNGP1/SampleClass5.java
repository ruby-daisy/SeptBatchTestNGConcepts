package ins.aiite.TestNGP1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleClass5 {
	
	@Test
	public void username()
	{
		System.out.println("username");
	}
	
	
	@Test(dependsOnMethods = {"username"})
	public void password()
	{
		System.out.println("password");
	}
	
	
	@Test(dependsOnMethods = {"password"})
	public void login()
	{
		System.out.println("login");
	}
	

}
