package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage02 {
	
    public static WebDriver driver; // null driver
	
    public PomPage02
    (WebDriver driver2) {  
		this.driver=driver2;
	    PageFactory.initElements(driver2, this);   
	}
    
    public WebElement getMenbutton() {
		return menbutton;
    }
    public WebElement getHoodie() {
		return hoodie;
    }
	
	@FindBy(xpath = "//a[@id='ui-id-5']" )
	private WebElement menbutton;
	
	@FindBy(xpath = "(//div[@class='product-item-info'])[2]" )
	private WebElement hoodie;
	


}
