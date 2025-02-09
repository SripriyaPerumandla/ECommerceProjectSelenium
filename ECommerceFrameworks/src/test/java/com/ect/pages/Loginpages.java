package com.ect.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpages {
    WebDriver driver;
    
    // Constructor for Loginpages class
    public Loginpages(WebDriver ldriver) {
        // Assigning the WebDriver instance passed to the constructor to the local driver variable
        this.driver = ldriver;
        
        // Initializing elements using PageFactory, where 'this' refers to the current instance of Loginpages class
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//*[@id=\"navbarText\"]/ul/li[2]/a") WebElement logimage;
   
    @FindBy(id="email") WebElement email;
    
    @FindBy(id="password") WebElement pass;
    
    @FindBy(id="customerloginForm") WebElement sub;
    
@FindBy(xpath="/html/body/nav/div/ul/li[2]/div/button") WebElement logoutimage;
	
	@FindBy(xpath="/html/body/nav/div/ul/li[2]/div/div/a[2]") WebElement logout;
    
    public void portalLogin(String username,String password) {
    	logimage.click();
    	email.sendKeys(username);
    	pass.sendKeys(password);
    	sub.click();
    }
    public void logout()
	{
		logoutimage.click();
		logout.click();
	}
}
