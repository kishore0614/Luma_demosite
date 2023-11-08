package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage03 {
	public static WebDriver driver; // null driver
	
    public PomPage03(WebDriver driver2) {
		this.driver=driver2;
	    PageFactory.initElements(driver2, this);   
	}
	
	public WebElement getSize() {
		return size;
		
	}
	public WebElement getColor() {
		return color;
	}

	public WebElement getAdd() {
		return add;
	
	}	
	
	@FindBy(xpath = "//div[@id='option-label-size-143-item-168']" )
	private WebElement size;
	
	@FindBy(xpath = "//div[@id='option-label-color-93-item-53']" )
	private WebElement color;
	
	@FindBy(xpath = "//button[@id='product-addtocart-button']" )
	private WebElement add;
	
	
}
