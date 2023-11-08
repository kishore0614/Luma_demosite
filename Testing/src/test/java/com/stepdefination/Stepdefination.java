package com.stepdefination;

import com.baseclass.BaseClass;
import com.pom.Page_object_manager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefination extends BaseClass {

	
	Page_object_manager pom = new Page_object_manager(driver);
	
	@Given("User Launch the url")
	public void user_launch_the_url() throws InterruptedException {
		driver.get("https://magento.softwaretestingboard.com/");
        Thread.sleep(2000);
	
	}
	@When("User click Login")
	public void user_click_login() {
		pom.getPomPage01().getSignin().click();
		
	}
	@When("User Enter the Username")
	public void user_enter_the_username() {
		pom.getPomPage01().getUsername().sendKeys("lucky29bo@gmail.com");
		
	}
	@When("User Enter the Password")
	public void user_enter_the_password() {
		pom.getPomPage01().getPassword().sendKeys("Lucky2902");
	
	}
	@When("User Click the Signin")
	public void user_click_the_signin() throws InterruptedException {
		pom.getPomPage01().getLogin().click();
		Thread.sleep(2000);
		
	}
	@Then("Next page shown \\(Page02)")
	public void next_page_shown_page02() {

		
	}
	@When("User click Men")
	public void user_click_men() {
		pom.getPomPage02().getMenbutton().click();
		
	}
	@When("User click Hoodie")
	public void user_click_hoodie() throws InterruptedException {
		pom.getPomPage02().getHoodie().click();
		Thread.sleep(2000);
		
	}
	@Then("Next page shown \\(Page03)")
	public void next_page_shown_page03() {
	   
	}
	
	
	@When("User select Size")
	public void user_select_size() {
		pom.getPomPage03().getSize().click();
		
	}
	@When("User select Color")
	public void user_select_color() {
		pom.getPomPage03().getColor().click();
		
	}
	@When("User click the Added to cart")
	public void user_click_the_added_to_cart() throws InterruptedException {
		pom.getPomPage03().getAdd().click();
	    Thread.sleep(5000);
	}

	@Then("Next page shown \\(Page04)")
	public void next_page_shown_page04() {
	    
	
	}
	@When("User click Items")
	public void user_click_items() throws InterruptedException {
		pom.getPomPage05().getItems().click();
		Thread.sleep(1000);
		Thread.sleep(2000);

	}
	@When("User click Checkout")
	public void user_click_checkout() throws InterruptedException {
		pom.getPomPage05().getCheckout().click();
		Thread.sleep(5000);
		Thread.sleep(3000);

	}
	@Then("Next page shown \\(Page05)")
	public void next_page_shown_page05() {
	    
	}
	
	
	@When("User click the Checkout")
	public void user_click_the_checkout() throws InterruptedException {
		Thread.sleep(5000);
		Thread.sleep(5000);
		pom.getPomPage06().getCheckbox().click();

	}
	@When("User click Next")
	public void user_click_next() throws InterruptedException {
		pom.getPomPage06().getNext().click();
		Thread.sleep(5000);
		Thread.sleep(5000);
		
	}
	@Then("Next page shown \\(Page06)")
	public void next_page_shown_page06() {
	    
	}
	
	
	@When("User click Place Order")
	public void user_click_place_order() throws InterruptedException {
		pom.getPomPage07().getPlaceorder().click();
		Thread.sleep(5000);
		driver.quit();
		
	}
	@Then("Next page shown \\(Page07)")
	public void next_page_shown_page07() {
	    
	}

}
