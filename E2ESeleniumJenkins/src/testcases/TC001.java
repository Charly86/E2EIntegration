package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC001 {
	
	private ChromeDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	
	 
	@BeforeClass
	public void setUp() {
	
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		 driver = new ChromeDriver();
				
	     baseUrl = "https://preproduccio.ioc.xtec.cat/campus/my/";
			    
	     
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
			  
		driver.get(baseUrl);
		
		driver.manage().window().maximize();
	
		
	
	    }

      
	  @Test( priority = 1 )
	  public void login() throws InterruptedException {
		  
		Thread.sleep(3000);
		driver.findElement(By.id("login-campus-large")).click();
		
		/*
	    driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys("usitteria");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("%Ue5^wjaUXpx3UJT");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cercar ...'])[1]/following::span[2]")).click();
	    driver.findElement(By.id("submitbutton")).click();
	    driver.findElement(By.id("label_3_23")).click();
	    
	    */
	  }

	 

	  
	  
	  
	

}
