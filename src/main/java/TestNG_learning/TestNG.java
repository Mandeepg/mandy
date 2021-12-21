package TestNG_learning;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {

	//@Beforesuite > Beforetest > @Beforeclass > @Beforemethod > @Test > @Afterclass > @Aftermethod > @Aftertest > @Aftersuite
}
@BeforeSuite
public void Beforesuite() {
System.out.println("this is the before suite which will execute first");
 
@AfterSuite

public void Aftersuite() {
	System.out.println("this is the after suit");
	
	
}
@BeforeTest

public void beforeTest() {
	System.out.println("this is the before test");
	
	
	
}
@AfterTest

public void aftertest() {
	System.out.println("this is the after suit");
	
	
}
@BeforeTest

public void Beforetest() {
	System.out.println("this is the before test");
	
	
}
@Test

public void test() {
	System.out.println("this is the test");
	
	
}
@AfterMethod

public void aftermethod() {
	System.out.println("this is the after method");
	
	
}
}