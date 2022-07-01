package com.salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SFDCLogin {
	
	@Test
	public void logInErrorMessage1()
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("Shaikh@tek.com");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("Login")).click();
		System.out.println(driver.findElement(By.id("error")).getText());
	    driver.close();	
	}
	@Test
	public void logInSalesForce2() throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("Shaikh@tek.com");
		driver.findElement(By.id("password")).sendKeys("tekarch123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(3000);
		driver.close();
}
	@Test
	public void checkRememberMe3() throws InterruptedException
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("Shaikh@tek.com");
		driver.findElement(By.id("password")).sendKeys("tekarch123");
		driver.findElement(By.id("rememberUn")).click();
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.id("userNavLabel")).click();
		driver.findElement(By.xpath("//a[@title='Logout']")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("idcard-identity")).getText());
		System.out.println(driver.findElement(By.id("hint_back_chooser")).getText());
		driver.close();	   
}
	@Test
	public void forgotPassword4a() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("forgot_password_link")).click();
		System.out.println(driver.findElement(By.id("header")).getText());
		Thread.sleep(3000);
		driver.close();
	   
}
	@Test
	public void forgotPassword4b() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("123");
		driver.findElement(By.id("password")).sendKeys("221321");
		driver.findElement(By.id("Login")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='error']")).getText());
		driver.close();


	}
}
