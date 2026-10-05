package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_annotations {
	
	@Test
	public void logintest() {
		
		System.out.println("Yogesh");
        System.out.println("Shivansh");		
	}
	@Test
	public void passtest() {
		
		System.out.println("Shivalik");
		System.out.println("Aarawali");
		
	}
	
	@BeforeMethod
	public void setup() {
		
		System.out.println("open browser");
	}
	
	@AfterMethod
	public void teardown() {
		
		System.out.println("close browser");
	}

	
	
}
