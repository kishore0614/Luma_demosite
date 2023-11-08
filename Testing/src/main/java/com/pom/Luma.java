package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Luma {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
                "C:\\Users\\DIVI\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new EdgeDriver();

		PomPage01 a = new PomPage01(driver);
		PomPage02 b = new PomPage02(driver);
		PomPage03 c = new PomPage03(driver);
		PomPage05 e = new PomPage05(driver);
		PomPage06 f = new PomPage06(driver);
		PomPage07 g = new PomPage07(driver);
		
		
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		a.getSignin().click();
		a.getUsername().sendKeys("lucky29bo@gmail.com");
		a.getPassword().sendKeys("Lucky2902");
		a.getLogin().click();
		Thread.sleep(2000);
		
		
		b.getMenbutton().click();
		b.getHoodie().click();
		Thread.sleep(2000);
		
		
		c.getSize().click();
		c.getColor().click();
		c.getAdd().click();
		Thread.sleep(2000);
	
		
		
		Thread.sleep(5000);
		e.getItems().click();
		Thread.sleep(1000);
		e.getCheckout().click();
		Thread.sleep(5000);
		Thread.sleep(5000);
		
		
		Thread.sleep(5000);
		f.getCheckbox().click();
		f.getNext().click();
		Thread.sleep(5000);
		
		
		g.getPlaceorder().click();
		Thread.sleep(5000);
		driver.quit();
	

	}

}
