package Automation_drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class upload {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.getTitle();
		driver.getCurrentUrl();
		driver.findElement(By.cssSelector("")).click();
		driver.findElement(By.id("")).sendKeys();
		
		

	}

}
