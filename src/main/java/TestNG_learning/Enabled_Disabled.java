package TestNG_learning;

import org.testng.annotations.Test;

public class Enabled_Disabled {
	@Test(enabled = true)
	public void login() {
		
}
	@Test(enabled =false, dependsOnMethods = {"login" ," logic"})
	public void logic1() {
		
	}
	@Test( enabled = true, dependsOnMethods = {"login" ," logic"})
	public void logic() {
		 ,