package com.sc.modules.Marketing;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pressRelease {
	WebDriver driver;
	
		public static Properties prop = Datadriven.objectProperty();
	
	@Test
	public void scLogin(){

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://qadealeradminv2india.izmocars.com/login.htm");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='loginId']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);			
		WebElement DelaerButton= driver.findElement(By.xpath("//a[@id='dealerbutton']"));
		DelaerButton.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement selsite= driver.findElement(By.xpath("//li[@class='ui-state-default ui-corner-top']"));
		selsite.click();
		WebElement sitename=driver.findElement(By.xpath("//div[@class='dataTables_filter']//input[@type='text']"));
		sitename.sendKeys("aadhimaruti");
		WebElement site=driver.findElement(By.xpath("//tr[@class='odd']//a[@href='javascript:void(0);']"));
		site.click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		WebElement mark=driver.findElement(By.xpath("//a[@href='javascript:void(0);'][text()='Marketing']"));
		mark.click();
		WebElement pressrelease=driver.findElement(By.xpath("//a[@id='sd4']"));
		pressrelease.click();	
		WebElement addnew=driver.findElement(By.xpath("//a[@class='submitbtn']"));
		addnew.click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		WebElement title=driver.findElement(By.xpath("//input[@id='title16393']"));
		title.sendKeys("testpressrelease");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.switchTo().frame("idContent_editorobj1");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement editor=driver.findElement(By.xpath("//html//body[1]"));
		editor.click();
		editor.sendKeys("mypressrelease");
		driver.switchTo().defaultContent();
		WebElement datesel=driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']"));
		datesel.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement datepick=driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight']"));
		datepick.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement submit=driver.findElement(By.xpath("//input[@value='Submit']"));
		submit.click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.close();
	}
}
