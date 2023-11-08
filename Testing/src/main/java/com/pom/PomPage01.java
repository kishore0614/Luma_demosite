package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage01 {
	
	public static WebDriver driver; // null driver
	
    public PomPage01(WebDriver driver2) {
		this.driver=driver2;
	    PageFactory.initElements(driver2, this);   
	}
    
    public WebElement getSignin() {
		return signin;
    }
	
	public WebElement getUsername() {
		return username;
		
	}
	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	
	}
	@FindBy(xpath = "(//a[@href='https://magento.softwaretestingboard.com/customer/account/"
			+ "login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/'])[1]" )
	private WebElement signin;
	
	@FindBy(xpath = "//input[@name='login[username]']" )
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='login[password]']" )
	private WebElement password;
	
	@FindBy(xpath = "//button[@name='send']" )
	private WebElement login;
	
}
