package com.loginpac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {
	@Test
	public static void login()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
	}

}
