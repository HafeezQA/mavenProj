package com.techarch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceSignUP {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://developer.salesforce.com/signup");
		driver.manage().window().maximize();
		driver.findElement(By.id("input")).sendKeys("Shaikh");
		driver.findElement(By.name("last_name")).sendKeys("Hafeez");
		driver.findElement(By.name("email")).sendKeys("hafeezqat@gmail.com");
		driver.findElement(By.id("select")).click();
	    Select se = new Select(null);
	    se.selectByVisibleText("Developer");
	    driver.findElement(By.name("company")).sendKeys("GlanceSoft");
	    
		
		
		
	}

}
