package ins.aiite.TestNGFails;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleClass9 {
	
	@Test(invocationCount = 3)
	public void test1()
	{
		
		String s="TestNG Session Day 1";
		System.out.println("Test 1");
		Assert.assertEquals("TestNG Session Day 1", s);
		System.out.println("Test 1Pass");
		Assert.assertEquals(" Session Day 1", s);
		System.out.println("Test 1 Fail");
	}
	
	@Test
	public void test2()
	{
		SoftAssert sa=new SoftAssert();
		String s="TestNG Session Day 1";
		System.out.println("Test 2");
		sa.assertTrue(s.contains("day"));
		System.out.println("Test 2 Fail");
		sa.assertEquals("TestNG Session Day 1", s);
		System.out.println("Test 2 Pass");
	}
	
	@Test(enabled=false)
	public void test3()
	{
		String s="TestNG Session Day 1";
		System.out.println("Test 3");
		Assert.assertFalse(s.contains("day"));
		System.out.println("Test 3 Fail");
	}

}
