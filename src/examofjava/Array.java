package examofjava;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Array {
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("BeforeClass");
		
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("BeforeMethod");
	}
	@Test
	public void test()
	{
		System.out.println("Test");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("AfterMethod");
	}
}
