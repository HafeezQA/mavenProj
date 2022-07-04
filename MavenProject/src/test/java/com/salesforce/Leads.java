package com.salesforce;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leads {
	
	   public static WebDriver driver;
	@BeforeMethod()
	public void login()
	{
	   //Launch and Login 	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Shaikh@tek.com");
		WebElement passowrd=driver.findElement(By.id("password"));
		passowrd.sendKeys("tekarch123");
		WebElement login =driver.findElement(By.id("Login"));
		login.click();   
}
		
	@Test
	public void tc20() {
		   //Click leads tab link from Home Page
		driver.findElement(By.xpath("//a[normalize-space()='Leads']")).click();
		System.out.println(driver.getTitle());	
	}
	@Test
	public void tc21() {
		   //Click leads tab link from Home Page
		driver.findElement(By.xpath("//a[normalize-space()='Leads']")).click();
		driver.findElement(By.xpath("//select[@id='fcf']")).click();
	}
	
    @AfterMethod
    public void tearDown()
{
    driver.quit();

}

}
