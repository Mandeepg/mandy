package TestNG_learning;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class combination {
	 @BeforeMethod
	 public void initialize() {
		 System.out.println( "this is the initalize method");
		 
		 
	 }
	 
	 @Test
	 public void testcase() {
		 System.out.println( "this is the testcase1 method");
		 
}
	 @Test
	 public void testcase2() {
		 System.out.println( "this is the testcase2 method");
	 }
	 @AfterMethod
	 public void Aftermethod() {
		 System.out.println( "this is the aftermethod method");
		 
