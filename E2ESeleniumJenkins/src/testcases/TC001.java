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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC001 {
	
	private ChromeDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private WebDriver webDriver;
	private StringBuffer verificationErrors = new StringBuffer();
	private WebDriverWait wait;
	
	 
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
		  
		  
		  WebElement myDynamicElement = (new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.presenceOfElementLocated(By.id("login-campus-large")));  
		  
		  myDynamicElement.click();


	    driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys("usitteria");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("%Ue5^wjaUXpx3UJT");
	    driver.findElement(By.id("submitbutton")).click();
	   
	    
	  
	    

		/*
	    driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys("usitteria");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("%Ue5^wjaUXpx3UJT");
	    
	    driver.findElement(By.id("submitbutton")).click();
	    driver.findElement(By.id("label_3_23")).click();
	    
	    */
	  }
	  
	@AfterClass
	  public void tearDown(){
		  
		  driver.close();
		  
	  }

	 

	  
	  
	  
	

}
