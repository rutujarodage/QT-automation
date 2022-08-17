package Rutuja.QT_automation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_implemention {
	@Test
	public void demo()
	{
		System.out.println("demo is running");
	}
	@Test
    public void cmo1()
    {
           System.out.println("cmo1 is running");
    }
	@BeforeMethod
	public void eat()
	{
		System.out.println("Before method is running");
	}
	@AfterMethod
	public void run()
	{
		System.out.println("After method is running");
		
	}
	@BeforeClass
	public void demo1()
	{
		System.out.println("Before class is running");
	}
	@AfterClass
	public void demo2()
	{
		System.out.println("After class is running");
	}
}

