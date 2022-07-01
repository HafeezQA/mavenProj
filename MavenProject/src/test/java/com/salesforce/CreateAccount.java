package com.salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {
	
	@Test
	public static void tc10()
	{
		WebDriver driver;
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
		WebElement accountTab =driver.findElement(By.xpath("//a[contains(text(),'Accounts')]"));
		accountTab.click();
		driver.findElement(By.id("createNewButton")).click();
		driver.findElement(By.xpath("//a[@class='accountMru menuButtonMenuLink']")).click();
		driver.findElement(By.cssSelector("#acc2")).sendKeys("ABC Company");
		WebElement techpartner = driver.findElement(By.xpath("//select[@id='acc6']"));
		techpartner.click();
		Select se1 = new Select(techpartner);
		se1.selectByValue("Technology Partner");
		techpartner.click();
		WebElement customerpriority = driver.findElement(By.id("00N8Z000004OiLb"));
		customerpriority.click();
		Select se2 = new Select(customerpriority);
		se2.selectByValue("High");
		techpartner.click();
	    driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Cancel']")).click();
	    driver.findElement(By.id("userNavLabel")).click();
		driver.findElement(By.xpath("//a[@title='Logout']")).click();
		driver.close();	
	}
	@Test
	public static void tc11()
	{
	WebDriver driver;
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
	WebElement accountTab =driver.findElement(By.xpath("//a[contains(text(),'Accounts')]"));
	accountTab.click();
	WebElement creatNewView = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
	creatNewView.click();
	 driver.findElement(By.id("fname")).clear();
	WebElement viewName = driver.findElement(By.id("fname"));
	viewName.sendKeys("Shaikh");
	WebElement save = driver.findElement(By.xpath("(//input[@title='Save'])[2]"));
	save.click();
	driver.findElement(By.id("userNavLabel")).click();
	driver.findElement(By.xpath("//a[@title='Logout']")).click();
	driver.close();	
	
}
	@Test
	public static void tc12editView()
	{
	WebDriver driver;
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
	WebElement accountTab =driver.findElement(By.xpath("//a[contains(text(),'Accounts')]"));
	accountTab.click();
	WebElement creatNewView = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
	creatNewView.click();
	 driver.findElement(By.id("fname")).clear();
	WebElement viewName = driver.findElement(By.id("fname"));
	viewName.sendKeys("Shaikh Hafeez");	
	WebElement field = driver.findElement(By.id("fcol1"));
	field.click();
	Select se1 = new Select(field);
	se1.selectByVisibleText("Account Name");
	WebElement operator = driver.findElement(By.id("fop1"));
	operator.click();
	Select se2 = new Select(operator);
	se2.selectByVisibleText("contains");
	WebElement value = driver.findElement(By.id("fval1"));
	value.click();
	value.sendKeys("a");
	WebElement save = driver.findElement(By.xpath("(//input[@title='Save'])[2]"));
	save.click();
	driver.findElement(By.id("userNavLabel")).click();
	driver.findElement(By.xpath("//a[@title='Logout']")).click();
	driver.close();		
}
	@Test
	public static void tc13mergeAccount()
	{
	WebDriver driver;
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
	WebElement accountTab =driver.findElement(By.xpath("//a[contains(text(),'Accounts')]"));
	accountTab.click();
	WebElement mergeAccount =driver.findElement(By.xpath("//a[normalize-space()='Merge Accounts']"));
	mergeAccount.click();
	WebElement srchBox = driver.findElement(By.id("srch"));
	srchBox.sendKeys("RkEnterprise");
	WebElement findAccount = driver.findElement(By.xpath("//div[@class='pbWizardBody']//input[2]"));
	findAccount.click();
	driver.findElement(By.xpath("//td[normalize-space()='RkEnterprise']")).click();
	driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[contains(@title,'Next')]")).click();
	
	
}
}