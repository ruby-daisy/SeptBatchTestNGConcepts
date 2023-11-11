package ins.aiite.TestNGP1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleClass3 {
	@Test(groups = {"smoke"})
	public void test1()
	{
		
		String s="TestNG Session Day 1";
		Assert.assertEquals("TestNG Session Day 1", s);
		Assert.assertEquals(" Session Day 1", s);
	}
	
	@Test(groups = {"sanity"})
	public void test2()
	{
		
		String s="TestNG Session Day 1";
		Assert.assertTrue(s.contains("day"));
		Assert.assertEquals("TestNG Session Day 1", s);
	}
	
	@Test(groups = {"sanity"})
	public void test3()
	{
		String s="TestNG Session Day 1";
		Assert.assertFalse(s.contains("day"));
	}
	@Test(groups = {"sanity","regression"})
	public void test4()
	{
		
		String s="TestNG Session Day 1";
		Assert.assertEquals("TestNG Session Day 1", s);
	}
	
	@Test(groups = {"regression"})
	public void test5()
	{
		
		String s="TestNG Session Day 1";
		Assert.assertTrue(s.contains("Day"));
	}
	
	@Test(groups = {"regression"})
	public void test6()
	{
		String s="TestNG Session Day 1";
		Assert.assertFalse(s.contains("day"));
	}

}
