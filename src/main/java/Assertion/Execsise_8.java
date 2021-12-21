package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Execsise_8 {
public static WebDriver driver;
public static SoftAssert softAssert = new SoftAssert();
public static ChromeOptions options = new ChromeOptions();
@Test
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
    options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
    options.addArguments("--start--maximized");
    options.addArguments("--incognito");
    driver=new ChromeDriver(options);
    driver.get("https://rediff.com");
    softAssert.assertEquals(driver.getTitle(), "rediff.com");
    //softAssert.assertAll();
    
    @Test
    public static void signinclick1() {
  softAssert.assertEquals(driver.findElement(By.className("signin")).isEnabled(),false);
    	softAssert.assertAll();
    }
    
    		

	
		
	}

}
public static void signinclick() {
	// TODO Auto-generated method stub
	
}

