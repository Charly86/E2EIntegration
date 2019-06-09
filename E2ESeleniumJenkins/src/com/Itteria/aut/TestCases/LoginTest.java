package com.Itteria.aut.TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Itteria.aut.pageObjects.BasePage;
import com.Itteria.aut.pageObjects.LoginPagePO;


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

public class LoginTest extends BasePage {
	
	
	
	 
	@Test
	public void login(){
		
		
		LoginPagePO loginPage = new LoginPagePO(driver);
		
		loginPage.enterName("usitteria");
		loginPage.enterPassword("%Ue5^wjaUXpx3UJT");
		loginPage.clickButtonLogin();
		
	}
	 

	  
	  
	  
	

}
