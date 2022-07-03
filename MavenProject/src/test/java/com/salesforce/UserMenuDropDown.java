package com.salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserMenuDropDown {
	
		@Test(priority=1)
		public void tco5() throws InterruptedException
		{	
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().window().maximize();
			driver.get("https://login.salesforce.com/");
			driver.findElement(By.id("username")).sendKeys("Shaikh@tek.com");
			driver.findElement(By.id("password")).sendKeys("tekarch123");
			driver.findElement(By.id("Login")).click();
			driver.findElement(By.id("userNavLabel")).click();
			Thread.sleep(3000);
			driver.close();

}
		@Test(priority=2)
		public void tco6post() throws InterruptedException
		{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		//Launch URL
		driver.get("https://login.salesforce.com/");
		//Enter User Id
		driver.findElement(By.id("username")).sendKeys("Shaikh@tek.com");
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("tekarch123");
		//Click LogIn button
		driver.findElement(By.id("Login")).click();
		//Click User menu button
		driver.findElement(By.id("userNavLabel")).click();
		Thread.sleep(3000);
		//Select My Profile
		driver.findElement(By.xpath("//a[text()='My Profile']")).click();
		//click on User Action menu
		driver.findElement(By.xpath("//a[@id='moderatorMutton']")).click();
		//Select Edit Profile 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Edit Profile']")).click();
		 //switch to frame
		driver.switchTo().frame("aboutMeContentId");
		//clear the title field
		driver.findElement(By.xpath("//input[@id='title']")).clear();
		//Enter Title field
		//driver.findElement(By.xpath("//input[@id='title']")).sendKeys("QA");
		//click save All button
		driver.findElement(By.xpath("//input[@value='Save All']")).click();
		//Come out from frame
		driver.switchTo().defaultContent();
		//click Post link
		driver.findElement(By.xpath("//*[@id=\"publisherAttachTextPost\"]/span[1]")).click();
		//switch to frame
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, publisherRichTextEditor']")));
		//Enter text into text field
	    WebElement textbox=  driver.findElement(By.xpath("/html[1]/body[1]"));
	    textbox.click();
	    textbox.sendKeys("HelloWorld");
	    //come out from frame
	    driver.switchTo().defaultContent();
		//click share button
		driver.findElement(By.id("publishersharebutton")).click();
		//click file link
		//driver.findElement(By.xpath("input[contains(@class,'cke_editable_themed ')]")).click();
		//upload file
		//driver.findElement(By.id("chatterUploadFileAction")).sendKeys("C:\\Users\\shafe\\OneDrive\\Desktop.txt");
		
		//Thread.sleep(3000);
		//driver.close();
}
		
		
}
	
