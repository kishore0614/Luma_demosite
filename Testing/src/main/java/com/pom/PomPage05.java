package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage05 {

    public static WebDriver driver; // null driver
	
    public PomPage05(WebDriver driver2) {  
		this.driver=driver2;
	    PageFactory.initElements(driver2, this);   
	}
    
    public WebElement getItems() {
		return items;
    }
    public WebElement getCheckout() {
		return checkout;
    }
    
	
	@FindBy(xpath = "//a[@class='action showcart']" )
	private WebElement items;
	
	@FindBy(xpath = "//button[@id='top-cart-btn-checkout']" )
	private WebElement checkout;
	

}