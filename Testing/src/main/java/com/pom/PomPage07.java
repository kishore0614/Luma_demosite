package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage07 {
	
    public static WebDriver driver; // null driver
	
    public PomPage07 (WebDriver driver2) {  
		this.driver=driver2;
	    PageFactory.initElements(driver2, this);   
	}
    
    public WebElement getPlaceorder() {
		return placeorder;
    }
	
	@FindBy(xpath = "//button[@class='action primary checkout']" )
	private WebElement placeorder;
	


}
