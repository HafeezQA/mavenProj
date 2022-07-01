package com.techarch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StudentRegistrationForm {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
		driver.findElement(By.id("password_field")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()='Login to Account']")).click();
		Thread.sleep(5000);
		driver.getTitle();
		
		
		
	}

}
