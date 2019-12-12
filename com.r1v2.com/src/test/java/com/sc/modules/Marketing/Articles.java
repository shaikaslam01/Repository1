package com.sc.modules.Marketing;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Articles {

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
	
	
}

@Test
public void selectDealer() throws InterruptedException{
	
	WebElement DelaerButton= driver.findElement(By.xpath(prop.getProperty("DelaerButton.xpath")));
	DelaerButton.click();
	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	WebElement SiteList= driver.findElement(By.xpath("//span[contains(text(),'Site')]"));
		SiteList.click();
		
	 WebElement SearcDealer= driver.findElement(By.xpath(prop.getProperty("searchdealer.xpath")));
	 	 SearcDealer.sendKeys("aadhimaruti");
	 	 
	 WebElement DealerSelect= driver.findElement(By.xpath("//tr[@class='odd']//a[@href='javascript:void(0);']"));
	 DealerSelect.click();	

WebElement Marketing= driver.findElement(By.xpath("//a[@href='javascript:void(0);'][contains(text(),'Marketing')]"));	
	Marketing.click();
	
	Thread.sleep(100);

  WebElement ManageArticle= driver.findElement(By.xpath("//a[@id='sd7' and text()='Manage Articles']"));  
  ManageArticle.click();
  WebElement AddNew= driver.findElement(By.xpath("//a[@class='submitbtn']"));
  AddNew.click();
  WebElement Title =driver.findElement(By.xpath("//input[@id='title16393']"));
  Title.sendKeys("testarticle");
  
  driver.switchTo().frame("idContent_editorobj1");
  
  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  WebElement editor=driver.findElement(By.xpath("//html//body[1]"));
  editor.click();
  editor.sendKeys("testarticlepage");
  driver.switchTo().defaultContent();
  WebElement desc=driver.findElement(By.xpath("//textarea[@id='shortdescription16393']"));
  desc.sendKeys("test");
  WebElement calendar=driver.findElement(By.xpath("//td//img[@class='ui-datepicker-trigger']"));
  calendar.click();
  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  WebElement selectdate=driver.findElement(By.xpath("//td//a[@class='ui-state-default ui-state-highlight']"));
  selectdate.click();
  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
  submit.click();

}
}










/*@Test
public void tearDown(){
	
}
*/



