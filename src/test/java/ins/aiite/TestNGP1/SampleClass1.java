package ins.aiite.TestNGP1;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class SampleClass1 {
	
	@BeforeSuite
	public void bs()
	{
		System.out.println("@BeforeSuite");
	}
	@AfterSuite
	public void as()
	{
		System.out.println("@AfterSuite");
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("@BeforeTest");
	}
	
	@AfterTest
	public void at()
	{
		System.out.println("@AfterTest");
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("@BeforeClass");
	}
	
	@AfterClass
	public void ac()
	{
		System.out.println("@AfterClass");
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("@BeforeMethod");
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("@AfterMethod");
	}
	
	@Test
	public void test1()
	{
		
		String s="TestNG Session Day 1";
		Assert.assertEquals("TestNG Session Day 1", s);
	}
	
	@Test
	public void test2()
	{
		
		String s="TestNG Session Day 1";
		Assert.assertTrue(s.contains("Day"));
	}
	
	@Test(enabled=false)
	public void test3()
	{
		String s="TestNG Session Day 1";
		Assert.assertFalse(s.contains("day"));
	}

}
