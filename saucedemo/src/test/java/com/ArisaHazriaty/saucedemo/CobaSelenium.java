package com.ArisaHazriaty.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CobaSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/arisahazriaty/Web Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// navigate web browser
		driver.navigate().to("https://www.saucedemo.com/");
		
		// input username dan password
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		// click button login
		driver.findElement(By.id("login-button")).click();
		
		
	}

}