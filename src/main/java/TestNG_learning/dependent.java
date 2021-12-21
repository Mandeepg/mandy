package TestNG_learning;

import org.testng.annotations.Test;

public class dependent {
@Test
public void login1() {
	
}
@Test(dependsOnMethods = "login1")
public void logic() {
	
}
@Test(dependsOnMethods = {"login1" , "logic")}
public void logout() {
	