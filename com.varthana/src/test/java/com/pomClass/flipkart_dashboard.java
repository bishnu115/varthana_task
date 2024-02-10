package com.pomClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * 
 * @author Bishnu 
 */
public class flipkart_dashboard {
	
	public WebDriver driver;

	@FindBy(name="q")
	WebElement searchBox;
	
	public flipkart_dashboard(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void search()
	{
		try {
			driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		} catch (Exception e) {

		}
		
		searchBox.clear();
		searchBox.sendKeys("iphone15");
		searchBox.submit();
}
}
