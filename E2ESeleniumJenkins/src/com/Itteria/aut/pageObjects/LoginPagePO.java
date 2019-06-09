package com.Itteria.aut.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginPagePO extends PageObjectFactory{


	
	@FindBy(id="username")
    private WebElement inputUserName;

    @FindBy(id="password")
    private WebElement inputUserPassword;

    @FindBy(id="submitbutton")
    private WebElement buttonLogin;

   
    public LoginPagePO(WebDriver driver) {
        super(driver);
    }

    public void enterName(String username){
    	
        this.inputUserName.clear();
        this.inputUserName.sendKeys(username);

     
    }

    public void enterPassword(String password){
        this.inputUserPassword.clear();
        this.inputUserPassword.sendKeys(password);

    }

    public void clickButtonLogin (){
    	
    	buttonLogin.click();
      
    }

   

}
