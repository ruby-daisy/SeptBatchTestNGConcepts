package ins.aiite.TestNGP1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleClass4 {
	@Test(groups = {"smoke"})
	public void test11()
	{
		
		String s="TestNG Session Day 1";
		Assert.assertEquals("TestNG Session Day 1", s);
	}
	
	@Test(groups = {"sanity"})
	public void test22()
	{
		
		String s="TestNG Session Day 1";
		Assert.assertTrue(s.contains("Day"));
	}
	
	@Test(groups = {"sanity"})
	public void test33()
	{
		String s="TestNG Session Day 1";
		Assert.assertFalse(s.contains("day"));
	}
	@Test(groups = {"sanity","regression"})
	public void test44()
	{
		
		String s="TestNG Session Day 1";
		Assert.assertEquals("TestNG Session Day 1", s);
	}
	
	@Test(groups = {"regression"})
	public void test55()
	{
		
		String s="TestNG Session Day 1";
		Assert.assertTrue(s.contains("Day"));
	}
	
	@Test(groups = {"regression"})
	public void test66()
	{
		String s="TestNG Session Day 1";
		Assert.assertFalse(s.contains("day"));
	}

}
