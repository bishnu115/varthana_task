package com.pomClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * 
 * @author Bishnu 
 */
public class buynow {
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")
	WebElement buyNow;
	
	public buynow(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void buyphone()
	{

		buyNow.click();
	}
}
