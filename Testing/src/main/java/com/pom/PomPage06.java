package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage06 {
	
    public static WebDriver driver; // null driver
	
    public PomPage06 (WebDriver driver2) {  
		this.driver=driver2;
	    PageFactory.initElements(driver2, this);   
	}
    
    public WebElement getCheckbox() {
		return checkbox;
    }
    public WebElement getNext() {
		return next;
    }
	
	@FindBy(xpath = "//input[@name='ko_unique_1']" )
	private WebElement checkbox;
	
	@FindBy(xpath = "//button[@class='button action continue primary']" )
	private WebElement next;
	

}
