package com.salesforce;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOpty {
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
	@Test()
	public void tc15() throws InterruptedException
	{
		//Click on opportunities link
		WebElement opportunities =driver.findElement(By.xpath("//a[normalize-space()='Opportunities']"));
		opportunities.click();
		//Verify opportunities drop down is present
		WebElement allOpportunities = driver.findElement(By.xpath("(//select[@id='fcf'])[1]"));
		driver.findElement(By.id("fcf")).click();
		allOpportunities.click();	
}
	@Test()
	public void tc16() throws InterruptedException
	{
		//Click on opportunities link
		WebElement opportunities =driver.findElement(By.xpath("//a[normalize-space()='Opportunities']"));
		opportunities.click();
		String parentHandle = driver.getWindowHandle();
		System.out.println("Parent Window - " +parentHandle);
		//Enter Opportunity Name,Account Name,Close Date,Stage,Probability,Lead Source , Primary Campaign Source and click on save button.
		WebElement oppName = driver.findElement(By.id("name"));
		oppName.sendKeys("abc");
		WebElement account = driver.findElement(By.id("account"));
		account.sendKeys("rk");
		WebElement newWindow =driver.findElement(By.xpath("//img[@title='Account Lookup (New Window)']"));
		newWindow.click();
		Set<String >handles=driver.getWindowHandles();
		
		for(String handle : handles) {
			System.out.println(handle);
			if(!handle.equals(parentHandle))
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//a[contains(text(),'RkEnterprise')]")).click();
			
		}
	}
		
		@Test()
		public void tc17() throws InterruptedException
		{
			//Click on opportunities link
			WebElement opportunities =driver.findElement(By.xpath("//a[normalize-space()='Opportunities']"));
			opportunities.click();
			//All opportunities link
			Thread.sleep(5000);
			WebElement allOpportunities = driver.findElement(By.xpath("(//select[@id='fcf'])[1]"));
			driver.findElement(By.id("fcf")).click();
			allOpportunities.click();				
}
		@Test()
		public void tc18() throws InterruptedException
		{
			//Click on opportunities link
			WebElement opportunities =driver.findElement(By.xpath("//a[normalize-space()='Opportunities']"));
			opportunities.click();
			//Click on Stuck Opportunities link  
           driver.findElement(By.xpath("//a[normalize-space()='Stuck Opportunities']")).click();
           
		}
		@Test()
		public void tc19() {
		//Click on opportunities link
		WebElement opportunities =driver.findElement(By.xpath("//a[normalize-space()='Opportunities']"));
		opportunities.click();
		//Click on Quarterly Summary link  
        driver.findElement(By.id("quarter_q")).click();
        		
}
		
        @AfterMethod
        public void tearDown()
{
	    driver.quit();

}
}

