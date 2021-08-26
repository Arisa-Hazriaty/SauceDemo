package com.ArisaHazriaty.saucedemo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;


public class SeleniumTest {
	WebDriver driver;

	@Before
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/arisahazriaty/Web Driver/chromedriver");
		driver = new ChromeDriver();
		
		// navigate web browser
		driver.navigate().to("https://www.saucedemo.com/");
	}
	
	@Test
	public void test1()
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		//div[@class='inventory_list']//div[@class='inventory_item_label']/div[contains(.,'carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromis')]
		String expected1 = driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']")).getText();
		String expected2 = driver.findElement(By.className("inventory_item_desc")).getText();
		String expected3 = driver.findElement(By.cssSelector(".inventory_list > div:nth-of-type(1) .inventory_item_price")).getText();
		
		driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']")).click();

		String actual1 = driver.findElement(By.cssSelector(".inventory_details_name")).getText();
		String actual2 = driver.findElement(By.cssSelector(".inventory_details_desc")).getText();
		String actual3 = driver.findElement(By.cssSelector(".inventory_details_price")).getText();

		Assert.assertEquals(actual1, expected1);
		Assert.assertEquals(actual2, expected2);
		Assert.assertEquals(actual3, expected3);
		System.out.println("Assert passed");	
		
	}
	
	/*
	 * @After public void quit() { driver.close(); }
	 */		
}
