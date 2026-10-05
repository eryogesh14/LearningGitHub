package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation2 {
	
	@BeforeMethod
	public void open()
	{
		System.out.println("open the browser");
		
	}

	@Test
	public void run()
	{
		System.out.println("execute the program");
	}
	
	@AfterMethod
	public void close()
	{
		System.out.println("close the browser");
	}
	
	
	
}
