package com.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * 
 * @author Bishnu 
 */
public class iphonepage {
	@FindBy(xpath="//div[text()='Apple iPhone 15 (Black, 128 GB)']")
	WebElement phone;
	public iphonepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void click_iphone()
	{
		phone.click();
	}

}
