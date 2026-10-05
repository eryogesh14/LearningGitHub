package selenium_udemy;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class PriorityDemo {
	@Test(priority=4)
	public void a()
	{
		System.out.println("Good morning");
	}
	@Test(priority=2)
	public void c()
	{
		System.out.println("Good evening");
	}
	@Ignore
	@Test(priority=3)
	public void b()
	{
		System.out.println("Good afternoon");
	}
	@Test(priority=1,enabled=false)
	public void d()
	{
		System.out.println("Good night");
	}
	
	@Test(priority=-2)
	public void e()
	{
		System.out.println("Good night");
	}

	@Test(priority=-5)
	public void f()
	{
		System.out.println("Good night");
	}
	@Test(priority=-2)
	public void g()
	{
		System.out.println("Good night");
	}
	
	@Test    // default priority=0 will apply 
	public void h()
	{
		System.out.println("Good night");
	}

}
