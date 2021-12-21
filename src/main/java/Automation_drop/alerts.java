package Automation_drop;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerts {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.findElement(By.classname("signin").click();
		Alert alert = driver.switchTo().alert();
		System.out.println("the text is :" + alert.getText());
		alert.accept();
		// alert.dismiss();
		driver.findElement(By.id("login")).sendKeys("mandeep24.@gmail.com");
		
		
		
		

	}

}
