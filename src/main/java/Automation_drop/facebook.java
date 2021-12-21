package Automation_drop;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {
	public static WebDriver driver;
	public static ChromeOptions options =new ChromeOptions();

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	options.addArguments("--start-maximized");
	options.addArguments("--incognito");
	driver = new ChromeDriver(options);
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("")).click();
	driver.findElement(By.xpath("")).sendkeys();
	driver.findElement(By.xpath("")).sendkeys();
	driver.findElement(By.xpath("")).sendkeys();
	driver.findElement(By.xpath("")).sendKeys();
	Thread.sleep(1000);
	driver.findElement(By.xpath("")).sendKeys();
	Select select = new Select(driver.findElement(By.id("day"))));
	select.deselectByVisibleText("12");
	
	select = new Select(driver.findElement(By.id("month")));
	select=selectByvisibletext("feb");
	
	select = new Select(driver.findElement(By.id("year")));
	select.selectByVisibleText("1989");
	
	
	

	}

	private static Select selectByvisibletext(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
