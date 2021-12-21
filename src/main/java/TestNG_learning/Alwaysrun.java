package TestNG_learning;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Alwaysrun {
	@Test
	public void begin() {
		System.out.println("this is the begining part of my life");
	}
	@Test(dependsOnMethods = {"begin", "mid"}, alwaysRun = true)
	public void mid() {
		System.out.println("this is the middle of my life");
		Assert.fail();
	
	}
	@Test(dependsOnMethods = "end")
	public void login() {
		System.out.println("this is the end part of my life");
	}
			
	}
		
}
