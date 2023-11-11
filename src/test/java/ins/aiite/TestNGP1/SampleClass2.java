package ins.aiite.TestNGP1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class SampleClass2 {
	
	@Parameters({"uname"})
	@Test(priority = 0) 
	public void username(String u)
	{
		System.out.println(u);
	}
	
	@Parameters({"pwd"})
	@Test(priority = 1)
	public void password(String p)
	{
		System.out.println(p);
	}
	
	@Parameters({"pwd","uname"})
	@Test(priority = 2)
	public void login(String p, String u)
	{
		System.out.println(u + " " + p);
	}
	
	@Test @Ignore
	public void x()
	{
		System.out.println("x");
	}

}
